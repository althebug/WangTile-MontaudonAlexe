package model;

import model.ArrayGrid;

import java.util.Iterator;
import java.util.NoSuchElementException;

public class SquareGridIterator implements Iterator<Square> {
    private ArrayGrid grid;
    private int rowIndex;
    private int columnIndex;

    public SquareGridIterator(ArrayGrid grid) {
        this.grid = grid;
        this.rowIndex = 0;
        this.columnIndex = -1;
    }


    @Override
    public boolean hasNext() {
        if((this.rowIndex == this.grid.getNumberOfRows() - 1) && (columnIndex == this.grid.getNumberOfColumns() - 1))
            return false;
        return true;
    }

    @Override
    public Square next() {
        if(!this.hasNext())
            throw new NoSuchElementException();
        if(this.columnIndex == this.grid.getNumberOfColumns() - 1) {
            this.rowIndex++;
            this.columnIndex = 0;
        }
        else {
            this.columnIndex++;
        }
        return this.grid.getSquare(rowIndex, columnIndex);
    }
}