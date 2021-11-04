package model;


import javafx.scene.paint.Color;
import model.ColoredSide;
import model.Square;


public class UniformTileGenerator implements TileGenerator{
    private final Tile tile;
    private final Color tileColor;

    public UniformTileGenerator(Color color) {
        this.tile = new UniformTile(new ColoredSide(color));
        this.tileColor = color;
    }

    public Tile nextTile() {
        return this.tile;
    }

    @Override
    public Tile nextTile(Square square) {
        return this.tile;
    }
}