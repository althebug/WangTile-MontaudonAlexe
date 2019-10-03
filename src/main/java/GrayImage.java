/**
 * Created by Arnaud Labourel on 04/10/2018.
 */

public interface GrayImage extends Image{
    void setPixel(GrayColor grayLevel, int x, int y);
    GrayColor getPixel(int x, int y);
}
