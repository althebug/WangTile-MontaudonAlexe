import org.junit.jupiter.api.Test;

import static org.assertj.core.api.Assertions.*;

public class ByteGrayColorTest {
  @Test
  public void testGetLuminosity_whenColorCreatedWithGrayLevel(){
    ByteGrayColor black = new ByteGrayColor(0);
    ByteGrayColor white = new ByteGrayColor(255);
    assertThat(black.getLuminosity()).isCloseTo(0., within(.01));
    assertThat(white.getLuminosity()).isCloseTo(1., within(.01));
  }

  @Test
  public void testGetLuminosity_whenColorCreatedWithLuminosity(){
    ByteGrayColor color1 = new ByteGrayColor(.25);
    ByteGrayColor color2 = new ByteGrayColor(.75);
    assertThat(color1.getLuminosity()).isCloseTo(.25, within(.01));
    assertThat(color2.getLuminosity()).isCloseTo(.75, within(.01));
  }
}