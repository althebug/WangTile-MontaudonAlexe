package model;

import java.util.List;

public class EmptySquare implements Square{
  public static final Square EMPTY_SQUARE= new EmptySquare();

  private EmptySquare(){}

  @Override
  public boolean accept(Tile tile) {
    return true;
  }

  @Override
  public void put(Tile tile) {}

  @Override
  public Tile getTile() {
    return EmptyTile.EMPTY_TILE;
  }

  @Override
  public List<Tile> compatibleTiles(List<Tile> tiles) {
    return tiles;
  }

  @Override
  public List<Side> compatibleSides(List<Side> sides, CardinalDirection direction) {
    return sides;
  }

  @Override
  public Square getNeighbor(CardinalDirection direction) {
    return EMPTY_SQUARE;
  }

  @Override
  public void setNeighbor(Square neighbor, CardinalDirection direction) {                                                           }
}
