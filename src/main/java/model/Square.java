package model;

import model.CardinalDirection;
import model.Side;
import model.Tile;

import java.util.List;

public interface Square {
  void put(Tile tile);
  void setNeighbor(Square neighbor, CardinalDirection direction);
  Square getNeighbor(CardinalDirection direction);
  List<Side> compatibleSides(List<Side> sides, CardinalDirection direction);
  List<Tile> compatiblesTiles(List<Tile> tiles);
  Tile getTile();

}