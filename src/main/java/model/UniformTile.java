package model;

import model.CardinalDirection;
import model.Side;

public class UniformTile implements Tile {
    private final Side side;

    public UniformTile(Side side) {
        this.side = side;
    }

    @Override
    public Side side(CardinalDirection direction) {
        return this.side;
    }
}