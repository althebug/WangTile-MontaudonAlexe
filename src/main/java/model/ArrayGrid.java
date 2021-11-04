package model;

import model.CardinalDirection;
import model.ArraySquare;
import model.EmptySquare;
import model.Square;
import model.EmptyTile;
import model.EmptyTileGenerator;
import model.Tile;
import model.TileGenerator;

public class ArrayGrid implements Grid {
    private final Square[][] squares;
    private final int rowsSquareNumber;
    private final int columnSquareNumber;

    public ArrayGrid(int numberOfRows, int numberOfColumns) {
        this.rowsSquareNumber = numberOfRows;
        this.columnSquareNumber = numberOfColumns;
        squares = new Square[numberOfRows][numberOfColumns];

        for (int rows = 0; rows < this.rowsSquareNumber; rows++) {
            for (int columns = 0; columns < this.columnSquareNumber; columns++) {
                squares[rows][columns] = new ArraySquare();
            }
        }
    }

    @Override
    public Square getSquare(int rowIndex, int columnIndex) {
        return this.squares[rowIndex][columnIndex];
    }

    @Override
    public int getNumberOfRows() {
        return this.rowsSquareNumber;
    }

    @Override
    public int getNumberOfColumns() {
        return this.columnSquareNumber;
    }

    @Override
    public void fill(TileGenerator tileGenerator) {
        for(int rows = 0; rows < this.rowsSquareNumber; rows++) {
            for(int columns = 0; columns < this.columnSquareNumber; columns++) {
                squares[rows][columns].put(tileGenerator.nextTile(squares[rows][columns]));
            }
        }
    }
}