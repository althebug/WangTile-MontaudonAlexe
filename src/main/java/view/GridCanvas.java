package view;

import javafx.beans.NamedArg;
import javafx.scene.canvas.Canvas;
import javafx.scene.canvas.GraphicsContext;
import javafx.scene.paint.Color;
import model.*;

import java.util.List;

public class GridCanvas extends Canvas {

  public final double tileWidth;
  private final double tileHeight;
  private final Integer numberOfColumns;
  private final Integer numberOfRows;
  private final Grid grid;
  private final GraphicsContext graphicsContext;

  public GridCanvas(@NamedArg("tileWidth") Double tileWidth,
                    @NamedArg("tileHeight") Double tileHeight,
                    @NamedArg("numberOfColumns") Integer numberOfColumns,
                    @NamedArg("numberOfRows") Integer numberOfRows) {
    this.tileWidth = tileWidth;
    this.tileHeight = tileHeight;
    this.numberOfColumns = numberOfColumns;
    this.numberOfRows = numberOfRows;
    this.setWidth(tileWidth * numberOfColumns);
    this.setHeight(tileHeight * numberOfRows);
    // TODO change the EmptyGrid for an ArrayGrid
    grid = new EmptyGrid(numberOfRows, numberOfColumns);
    graphicsContext = getGraphicsContext2D();
  }

  public void update(){
    clear();
    drawGrid();
  }

  private void drawGrid(){
    drawGridTile(grid);
  }

  private void clear(){
    graphicsContext.clearRect(0, 0, getWidth(), getHeight());
  }

  public void fillGrid(TileGenerator tileGenerator){
    grid.fill(tileGenerator);
  }

  public void drawGridTile(Grid tileGrid){
    for(int row = 0; row < numberOfRows; row++)
      for(int column = 0; column < numberOfColumns; column++){
        Tile tile = tileGrid.getSquare(row, column).getTile();
        drawTile(tile, column * tileWidth, row * tileHeight);
      }
  }

  private void drawTile(Tile tile, double x, double y) {
    for(CardinalDirection side: CardinalDirection.values()){
      drawSideTriangle(tile, x, y, side);
    }
  }

  private void drawSideTriangle(Tile tile, double x, double y, CardinalDirection side){
    List<PointType> cornerTypes = PointType.trianglePointTypes(side);
    double[] xPoints = new double[3];
    double[] yPoints = new double[3];
    for(int index = 0; index < 3; index++){
      xPoints[index] =  x + (cornerTypes.get(index).getXPosition() * tileWidth);
      yPoints[index] =  y + (cornerTypes.get(index).getYPosition() * tileHeight);
    }

    Color color = tile.side(side).color();
    graphicsContext.setFill(color);
    graphicsContext.strokePolygon(xPoints, yPoints, 3);
    graphicsContext.fillPolygon(xPoints, yPoints, 3);
  }
}
