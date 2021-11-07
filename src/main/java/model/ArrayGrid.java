package model;

import model.CardinalDirection;
import model.ArraySquare;
import model.Square;
import model.SquareGridIterator;
import model.TileGenerator;

import java.util.Iterator;

public class ArrayGrid implements Grid {
    private final Square[][] squares;
    private final int rowsSquareNumber;
    private final int columnSquareNumber;

    public ArrayGrid(int numberOfRows, int numberOfColumns) {
        this.rowsSquareNumber = numberOfRows;
        this.columnSquareNumber = numberOfColumns;
        squares = new Square[numberOfRows][numberOfColumns];

        for(int rows = 0; rows < this.rowsSquareNumber; rows++) {
            for(int columns = 0; columns < this.columnSquareNumber; columns++) {
                squares[rows][columns] = new ArraySquare();
            }
        }
        for(int rows = 0; rows < this.rowsSquareNumber; rows++) {
            for(int columns = 0; columns < this.columnSquareNumber; columns++) {
                this.setNextNeighbour(rows, columns);
            }
        }
    }
    private void setNextNeighbour(int row, int column) {
        for(CardinalDirection direction : CardinalDirection.values()) {
            if(row != 0 && direction.ordinal() == 0)
                this.getSquare(row, column).setNeighbor(this.getSquare(row - 1, column), direction);
            if(row != this.getNumberOfRows() - 1 && direction.ordinal() == 2)
                this.getSquare(row, column).setNeighbor(this.getSquare(row + 1 , column), direction);
            if(column != 0 && direction.ordinal() == 3)
                this.getSquare(row, column).setNeighbor(this.getSquare(row , column - 1), direction);
            if(column != this.getNumberOfColumns() - 1 && direction.ordinal() == 1)
                this.getSquare(row, column).setNeighbor(this.getSquare(row , column + 1), direction);
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
        for(Square square : this) {
            square.put(tileGenerator.nextTile(square));
        }

    }

    @Override
    public Iterator<Square> iterator() {
        return new SquareGridIterator(this);
    }
}