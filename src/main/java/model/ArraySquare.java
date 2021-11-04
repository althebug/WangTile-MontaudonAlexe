package model;

import model.*;

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

    public Tile getTile() {
        return this.tile;
    }





}