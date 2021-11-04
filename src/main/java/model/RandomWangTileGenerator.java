package model;

import javafx.scene.paint.Color;
import model.ColoredSide;
import model.Side;
import model.Square;
import model.Tile;
import model.TileGenerator;

import java.util.ArrayList;
import java.util.List;
import java.util.Random;

public class RandomWangTileGenerator implements TileGenerator {
    private final List<Side> availableSides = new ArrayList<>();
    private Random randomGenerator;

    public RandomWangTileGenerator(List<Color> colors, Random randomGenerator) {
        for(int colorValue = 0; colorValue < colors.size(); colorValue++) {
            this.availableSides.add(new ColoredSide(colors.get(colorValue)));
        }
        this.randomGenerator = randomGenerator;
    }

    @Override
    public Tile nextTile(Square square) {
        Side[] sideTab = new Side[4];
        for(int i = 0; i < 4; i++) {
            sideTab[i] = this.availableSides.get(this.randomGenerator.nextInt(4));
        }
        return new WangTile(sideTab);
    }
}