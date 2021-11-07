package model;

import model.CardinalDirection;
import model.ColoredSide;
import model.Side;
import model.EmptyTile;
import model.Tile;

import java.lang.reflect.Array;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class ArraySquare implements Square {
    private Tile tile;
    private final Square[] neighbors;

    public ArraySquare() {
        this.tile = EmptyTile.EMPTY_TILE;
        this.neighbors = new Square[CardinalDirection.NUMBER_OF_DIRECTIONS];
        Arrays.fill(this.neighbors, EmptySquare.EMPTY_SQUARE);

    }

    public void put(Tile tile) {
        this.tile = tile;
    }

    @Override
    public void setNeighbor(Square neighbor, CardinalDirection direction) {

    }

    @Override
    public Square getNeighbor(CardinalDirection direction) {
        return this.neighbors[direction.ordinal()];
    }

    @Override
    public List<Side> compatibleSides(List<Side> sides, CardinalDirection direction) {
        List<Side> sideAccept = new ArrayList<>();
        for(Side side : sides) {
            if(getNeighbor(direction).getTile().side(direction.oppositeDirection()).accept(side))
                sideAccept.add(side);
        }
        return sideAccept;
    }

    @Override
    public List<Tile> compatiblesTiles(List<Tile> tiles) {
        List<Tile> compatibleTiles = new ArrayList<>();
        for(Tile tile : tiles) {
            int numberSideAccepted = 0;
            for(CardinalDirection direction : CardinalDirection.values()) {
                Side sideNeighbour = getNeighbor(direction).getTile().side(direction.oppositeDirection());
                if(sideNeighbour.accept(tile.side(direction)))
                    numberSideAccepted++;
            }
            if(numberSideAccepted == 4)
                compatibleTiles.add(tile);
        }
        return compatibleTiles;
    }


    public Tile getTile() {
        return this.tile;
    }





}