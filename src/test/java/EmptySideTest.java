package sideTest;

import javafx.scene.paint.Color;
import model.EmptySide;
import org.junit.jupiter.api.Test;

import static org.assertj.core.api.Assertions.assertThat;

public class EmptySideTest {
  @Test
  void testColor(){
    assertThat(EmptySide.EMPTY_SIDE.color()).isEqualTo(Color.WHITE);
  }
}