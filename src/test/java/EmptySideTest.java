import javafx.scene.paint.Color;
import model.EmptySide;
import model.Side;
import org.junit.jupiter.api.Test;

import java.util.List;

import static org.assertj.core.api.Assertions.assertThat;

public class EmptySideTest {
  @Test
  void testCompatibleSides(){
    List<Side> sides = List.of(EmptySide.EMPTY_SIDE);
    assertThat(EmptySide.EMPTY_SIDE.compatibleSides(sides)).containsExactly(EmptySide.EMPTY_SIDE);
  }

  @Test
  void testColor(){
    assertThat(EmptySide.EMPTY_SIDE.color()).isEqualTo(Color.WHITE);
  }
  @Test
  void testAccept(){
    assertThat(EmptySide.EMPTY_SIDE.accept(EmptySide.EMPTY_SIDE)).isTrue();
  }

}
