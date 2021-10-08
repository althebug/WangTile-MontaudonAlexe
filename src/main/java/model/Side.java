package model;

import javafx.scene.paint.Color;

import java.util.List;

public interface Side {
  List<Side> compatibleSides(List<Side> sides);
  Color color();
  boolean accept(Side side);
}
