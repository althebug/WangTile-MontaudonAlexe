import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class MatrixGrayImageTest {

    @Test
    void getWidth() {
        assertEquals(0, new MatrixGrayImage(0,0).getWidth());
        assertEquals(10, new MatrixGrayImage(10,20).getWidth());
        assertEquals(400, new MatrixGrayImage(400,300).getWidth());
    }

    @Test
    void getHeight() {
        assertEquals(0, new MatrixGrayImage(0,0).getHeight());
        assertEquals(20, new MatrixGrayImage(10,20).getHeight());
        assertEquals(300, new MatrixGrayImage(400,300).getHeight());
    }
}