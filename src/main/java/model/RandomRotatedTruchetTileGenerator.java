package model;

import javafx.scene.paint.Color;
import model.CardinalDirection;
import model.ColoredSide;
import model.Square;
import model.Tile;
import model.TileGenerator;
import model.util.RandomUtil;

import java.util.Random;

public class RandomRotatedTruchetTileGenerator implements TileGenerator {
    private Color firstColor;
    private Color secondColor;
    private Random randomGenerator;

    public RandomRotatedTruchetTileGenerator(Color color1, Color color2, Random randomGenerator) {
        this.firstColor = color1;
        this.secondColor = color2;
        this.randomGenerator = randomGenerator;
    }


    @Override
    public Tile nextTile(Square square) {
        int randomValue = this.randomGenerator.nextInt(CardinalDirection.NUMBER_OF_DIRECTIONS);
        Rotation randomRotation = Rotation.NO_TURN;

        return new RotatedTile(
                new TruchetTile(
                        new ColoredSide(this.firstColor),
                        new ColoredSide(this.secondColor)
                ),randomRotation.getRandomValue(randomValue)
        );
    }
}