import model.CardinalDirection;
import model.EmptySide;
import model.EmptySquare;
import model.EmptyTile;
import org.junit.jupiter.api.Test;

import java.util.List;

import static org.assertj.core.api.Assertions.assertThat;

public class EmptySquareTest {
  @Test
  void testAccept(){
    assertThat(EmptySquare.EMPTY_SQUARE.accept(EmptyTile.EMPTY_TILE)).isTrue();
  }

  @Test
  void testGetTile(){
    assertThat(EmptySquare.EMPTY_SQUARE.getTile()).isEqualTo(EmptyTile.EMPTY_TILE);
  }

  @Test
  void testCompatibleTiles(){
    assertThat(EmptySquare.EMPTY_SQUARE.compatibleTiles(List.of(EmptyTile.EMPTY_TILE))).containsExactly(EmptyTile.EMPTY_TILE);
  }

  @Test
  void testCompatibleSides(){
    assertThat(EmptySquare.EMPTY_SQUARE.compatibleSides(List.of(EmptySide.EMPTY_SIDE), CardinalDirection.NORTH)).containsExactly(EmptySide.EMPTY_SIDE);
  }

  @Test
  void testGetNeighbor(){
    assertThat(EmptySquare.EMPTY_SQUARE.getNeighbor(CardinalDirection.NORTH)).isEqualTo(EmptySquare.EMPTY_SQUARE);
  }

}
