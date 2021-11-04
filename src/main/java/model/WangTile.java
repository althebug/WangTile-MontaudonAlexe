package model;

import model.CardinalDirection;
import model.Side;
import model.Tile;

public class WangTile implements Tile {
    private final Side[] sides;

    public WangTile(Side[] sides) {
        this.sides = new Side[CardinalDirection.NUMBER_OF_DIRECTIONS];
        for(int i = 0; i < sides.length ; i++) {
            this.sides[i] = sides[i];
        }
    }

    @Override
    public Side side(CardinalDirection direction) {
        return this.sides[direction.ordinal()];
    }
}