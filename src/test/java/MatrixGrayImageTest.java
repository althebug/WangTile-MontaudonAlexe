import org.junit.jupiter.api.Test;

import static org.assertj.core.api.Assertions.*;

class MatrixGrayImageTest {

    @Test
    void getWidth() {
        assertThat(new MatrixGrayImage(0,0).getWidth()).isEqualTo(0);
        assertThat(new MatrixGrayImage(10,20).getWidth()).isEqualTo(10);
        assertThat(new MatrixGrayImage(400,300).getWidth()).isEqualTo(400);
    }

    @Test
    void getHeight() {
        assertThat(new MatrixGrayImage(0,0).getHeight()).isEqualTo(0);
        assertThat(new MatrixGrayImage(10,20).getHeight()).isEqualTo(20);
        assertThat(new MatrixGrayImage(400,300).getHeight()).isEqualTo(300);
    }
}