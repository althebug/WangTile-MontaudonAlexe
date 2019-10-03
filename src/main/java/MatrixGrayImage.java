import javafx.scene.paint.Color;

import java.io.FileWriter;
import java.io.InputStream;
import java.io.PrintWriter;
import java.util.Scanner;

/**
 * Created by Arnaud Labourel on 02/10/2018.
 */
public class MatrixGrayImage implements GrayImage {

    private final ByteGrayColor[][] pixels;
    private final int width;
    private final int height;


    @Override
    public void setPixel(GrayColor grayLevel, int x, int y) {
        // TODO : Compléter la méthode pour modifier le pixel.
    }

    @Override
    public GrayColor getPixel(int x, int y) {
        // TODO : Changer les instructions pour retourner le bon pixel.
        return new ByteGrayColor();
    }

    @Override
    public Color getPixelColor(int x, int y) {
        // TODO : Changer les instructions pour retourner la couleur du pixel.
        return Color.WHITE;
    }

    @Override
    public int getWidth() {
        // TODO : Changer les isntructions pour retourner la largeur de l'image.
        return 600;
    }

    @Override
    public int getHeight() {
        // TODO : Changer les instructions pour retourner la hauteur de l'image.
        return 400;
    }

    public MatrixGrayImage(int width, int height){
        /* TODO : Changer les instructions pour initialiser correctement
            les attributs de l'instance.
         */
        this.width = 0;
        this.height = 0;
        this.pixels = null;
    }


    public static MatrixGrayImage createImageFromPGMFile(String fileName) {
        // NE PAS MODIFIER !
        InputStream file = ClassLoader.getSystemResourceAsStream(fileName);
        Scanner scan = new Scanner(file);
        scan.nextLine();
        scan.nextLine();

        int width = scan.nextInt();
        int height = scan.nextInt();

        MatrixGrayImage result = new MatrixGrayImage(width, height);

        scan.nextInt();

        for(int y = 0; y < height; y++){
            for(int x = 0; x < width; x++) {
                GrayColor color = new ByteGrayColor(scan.nextInt());
                result.setPixel(color, x, y);
            }
        }

        return result;
    }

    public void writeIntoPGMFormat(String fileName){
        // NE PAS MODIFIER !
        try {
            FileWriter fileWriter = new FileWriter(fileName);
            PrintWriter printWriter = new PrintWriter(fileWriter);
            printWriter.println("P2");
            printWriter.println("# CREATOR: TP3 Version 1.0");
            printWriter.printf("%d %d\n",this.width, this.height);

            printWriter.println(pixels[0][0].getGrayLevel());

            for(int y = 0; y < height; y++){
                for(int x = 0; x < width; x++) {
                    printWriter.println(getPixel(x,y).getGrayLevel());
                }
            }
            printWriter.close();
        }
        catch (Exception e){
            e.printStackTrace();
        }
    }
}
