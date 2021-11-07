package model;

import model.CardinalDirection;
import model.Side;
import model.Tile;

public class TruchetTile implements Tile {
    private Side northWestColorSide;
    private Side southEastCColorSide;


    public TruchetTile(Side northWestColor, Side southEastColor) {
        this.northWestColorSide = northWestColor;
        this.southEastCColorSide = southEastColor;
    }

    @Override
    public Side side(CardinalDirection direction) {
        if(direction == CardinalDirection.NORTH || direction == CardinalDirection.WEST)
            return this.northWestColorSide;
        return this.southEastCColorSide;
    }

}