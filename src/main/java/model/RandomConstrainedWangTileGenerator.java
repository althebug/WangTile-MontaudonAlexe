package model;

import javafx.scene.paint.Color;
import model.CardinalDirection;
import model.ColoredSide;
import model.Side;
import model.Square;
import model.Tile;
import model.TileGenerator;
import model.util.RandomUtil;

import java.util.ArrayList;
import java.util.List;
import java.util.Random;

public class RandomConstrainedWangTileGenerator implements TileGenerator {
    private final List<Side> availableSides = new ArrayList<>();
    private final Random randomGenerator;

    public RandomConstrainedWangTileGenerator(List<Color> colors, Random randomGenerator) {
        for(int element = 0; element < colors.size(); element++) {
            this.availableSides.add(new ColoredSide(colors.get(element)));
        }
        this.randomGenerator = randomGenerator;
    }


    @Override
    public Tile nextTile(Square square) {
        Side[] sides = new Side[CardinalDirection.NUMBER_OF_DIRECTIONS];
        CardinalDirection[] direction = CardinalDirection.values();
        for(int element = 0; element < 4; element++) {
            sides[element] = RandomUtil.randomElement(square.compatibleSides(this.availableSides, direction[element]), randomGenerator);
        }
        return new WangTile(sides);
    }
}