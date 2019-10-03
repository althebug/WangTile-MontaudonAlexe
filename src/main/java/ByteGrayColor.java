import javafx.scene.paint.Color;

/**
 * Created by Arnaud Labourel on 02/10/2018.
 */

public class ByteGrayColor implements GrayColor {

    private static final int MINIMUM_GRAY_LEVEL = 0;
    private static final int MAXIMUM_GRAY_LEVEL = 255;
    private static final int OPACITY = 1;

    private int grayLevel;

    public int getGrayLevel() {
        // TODO : Renvoyer le niveau de gris de l'instance.
        return 0;
    }

    public ByteGrayColor(){
       this.grayLevel = MINIMUM_GRAY_LEVEL;
    }

    public ByteGrayColor(int grayLevel) {
        // TODO : Initialiser l'attribut grayLevel de l'instance.
    }

    @Override
    public Color getColor(){
        double component = grayLevel / (double) MAXIMUM_GRAY_LEVEL;
        return new Color(component, component, component, OPACITY);
    }


    @Override
    public int compareTo(GrayColor o) {
        // TODO : Renvoyer la différence de niveau de gris.
        return 0;
    }

}
