package model;

import model.CardinalDirection;
import model.ColoredSide;
import model.Side;
import model.Tile;

public class RotatedTile implements Tile {
    private final Tile tile;
    private final Rotation rotation;

    public RotatedTile(Tile tile, Rotation rotation) {
        this.tile = tile;
        this.rotation = rotation;
    }

    @Override
    public Side side(CardinalDirection direction) {
        return this.tile.side(this.rotation.rotatedDirection(direction));
    }
}