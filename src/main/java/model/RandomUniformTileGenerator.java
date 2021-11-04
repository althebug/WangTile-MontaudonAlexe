package model;

import javafx.scene.paint.Color;
import model.ColoredSide;
import model.Square;
import model.Tile;
import model.TileGenerator;
import model.UniformTile;

import java.util.ArrayList;
import java.util.List;
import java.util.Random;

public class RandomUniformTileGenerator implements TileGenerator {
    private final List<Tile> tiles = new ArrayList<>();
    private Random randomGenerator;

    public RandomUniformTileGenerator(List<Color> colors, Random randomGenerator) {
        for(int colorValue = 0; colorValue < colors.size(); colorValue++) {
            this.tiles.add(new UniformTile(new ColoredSide(colors.get(colorValue))));
        }
        this.randomGenerator = randomGenerator;
    }


    @Override
    public Tile nextTile(Square square) {
        int colorsPlaceAtRandom = this.randomGenerator.nextInt(this.tiles.size());
        return this.tiles.get(colorsPlaceAtRandom);
    }
}