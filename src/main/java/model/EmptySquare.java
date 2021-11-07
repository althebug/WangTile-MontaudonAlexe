package model;

import model.CardinalDirection;
import model.Side;
import model.EmptyTile;
import model.Tile;

import java.util.List;

public class EmptySquare implements Square {
  public static final Square EMPTY_SQUARE = new EmptySquare();

  private EmptySquare() {}

  @Override
  public void put(Tile tile) {}

  @Override
  public void setNeighbor(Square neighbor, CardinalDirection direction) {}

  @Override
  public Square getNeighbor(CardinalDirection direction) {
    return new EmptySquare();
  }

  @Override
  public List<Side> compatibleSides(List<Side> sides, CardinalDirection direction) {
    return sides;
  }

  @Override
  public List<Tile> compatiblesTiles(List<Tile> tiles) {
    return tiles;
  }

  @Override
  public Tile getTile() {
    return EmptyTile.EMPTY_TILE;
  }
}