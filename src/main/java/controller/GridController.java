package controller;
import javafx.fxml.FXML;
import javafx.scene.paint.Color;
import model.*;
import view.GridTileCanvas;

import java.util.List;
import java.util.Random;

public class GridController {
  Random random = new Random();
  @FXML
  public GridTileCanvas gridTileCanvas;

  public void initialize() {
    clearGrid();
  }

  public void fillGrid(TileGenerator tileGenerator) {
    gridTileCanvas.fillGrid(tileGenerator);
  }

  public void drawGrid() {
    gridTileCanvas.update();
  }

  public void clearGrid(){
    fillGrid(new EmptyTileGenerator());
  }

  public void updateGrid(TileGenerator tileGenerator){
    clearGrid();
    fillGrid(tileGenerator);
    drawGrid();
  }

  @FXML
  public void updateEmptyUniformTile(){
    updateGrid(new EmptyTileGenerator());
  }

  @FXML
  public void updateRedUniformTile(){
    // TODO : uncomment the code to test UniformTileGenerator
    // updateGrid(new UniformTileGenerator(new InternalSide(Color.RED)));
  }

  @FXML
  public void updateRandomColorUniformTile(){
    // TODO : uncomment the code to test RandomUniformTileGenerator
    // updateGrid(new RandomUniformTileGenerator(List.of(Color.RED, Color.BLUE, Color.BLACK), random));
  }

  @FXML
  public void updateRandomTruchetTile(){
    // TODO : uncomment the code to test RandomRotatedTruchetTileGenerator
    // updateGrid(new RandomRotatedTruchetTileGenerator(Color.RED, Color.BLUE, random));
  }

  @FXML
  public void updateRandomWangTile() {
    // TODO : uncomment the code to test RandomWangTileGenerator
    // updateGrid(new RandomWangTileGenerator(List.of(Color.RED, Color.BLUE, Color.GREEN, Color.YELLOW), random));
  }

  @FXML
  public void updateRandomConstrainedWangTile() {
    // TODO : uncomment the code to test RandomConstrainedWangTileGenerator
    // updateGrid(new RandomConstrainedWangTileGenerator(List.of(Color.RED, Color.BLUE, Color.GREEN, Color.YELLOW), random));
  }

  @FXML
  public void updateConstrainedTruchetTile() {
    // TODO : uncomment the code to test ConstrainedRotatedTruchetTileGenerator
    // updateGrid(new ConstrainedRotatedTruchetTileGenerator(Color.RED, Color.BLUE, random));
  }

  @FXML
  public void updateRandomWangTileSet() {
    // TODO : uncomment the code to test RandomTileSetGenerator
    /*
    updateGrid(new RandomTileSetGenerator(List.of(
            new WangTile(new Side[]{new InternalSide(Color.RED), new InternalSide(Color.BLUE), new InternalSide(Color.RED), new InternalSide(Color.RED)}),
            new WangTile(new Side[]{new InternalSide(Color.RED), new InternalSide(Color.RED), new InternalSide(Color.BLUE), new InternalSide(Color.BLUE)}),
            new WangTile(new Side[]{new InternalSide(Color.RED), new InternalSide(Color.GREEN), new InternalSide(Color.GREEN), new InternalSide(Color.GREEN)}),
            new WangTile(new Side[]{new InternalSide(Color.BLUE), new InternalSide(Color.GREEN), new InternalSide(Color.RED), new InternalSide(Color.BLUE)}),
            new WangTile(new Side[]{new InternalSide(Color.BLUE), new InternalSide(Color.BLUE), new InternalSide(Color.BLUE), new InternalSide(Color.RED)}),
            new WangTile(new Side[]{new InternalSide(Color.BLUE), new InternalSide(Color.RED), new InternalSide(Color.GREEN), new InternalSide(Color.GREEN)}),
            new WangTile(new Side[]{new InternalSide(Color.GREEN), new InternalSide(Color.GREEN), new InternalSide(Color.BLUE), new InternalSide(Color.GREEN)}),
            new WangTile(new Side[]{new InternalSide(Color.GREEN), new InternalSide(Color.RED), new InternalSide(Color.RED), new InternalSide(Color.RED)}),
            new WangTile(new Side[]{new InternalSide(Color.GREEN), new InternalSide(Color.BLUE), new InternalSide(Color.GREEN), new InternalSide(Color.BLUE)})), random));
     */
  }
}
