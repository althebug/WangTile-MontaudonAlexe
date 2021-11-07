package model;

import model.Square;
import model.TileGenerator;

public interface Grid extends Iterable<Square>{
  Square getSquare(int rowIndex, int columnIndex);
  int getNumberOfRows();
  int getNumberOfColumns();
  void fill(TileGenerator tileGenerator);
}