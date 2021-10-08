package model;

import java.util.List;

public interface Square {
  boolean accept(Tile tile);
  void put(Tile tile);
  Tile getTile();
  List<Tile> compatibleTiles(List<Tile> tiles);
  List<Side> compatibleSides(List<Side> sides, CardinalDirection direction);
  Square getNeighbor(CardinalDirection direction);
  void setNeighbor(Square neighbor, CardinalDirection direction);
}
