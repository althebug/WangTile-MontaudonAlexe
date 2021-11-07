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

public class ConstrainedRotatedTruchetTileGenerator implements TileGenerator {
    private Random randomGenerator;
    private Side firstSide;
    private Side secondSide;
    private List<Tile> test = new ArrayList<>();

    public ConstrainedRotatedTruchetTileGenerator(Color color1, Color color2, Random randomGenerator) {
        this.firstSide = new ColoredSide(color1);
        this.secondSide = new ColoredSide(color2);
        this.randomGenerator = randomGenerator;
        for(Rotation a : Rotation.values()) {
            this.test.add(new RotatedTile(new TruchetTile(this.firstSide, this.secondSide), a ));
        }
    }

    @Override
    public Tile nextTile(Square square) {
        return RandomUtil.randomElement(square.compatiblesTiles(this.test), this.randomGenerator);
    }
}