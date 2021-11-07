package model;

import model.Square;
import model.util.RandomUtil;

import java.util.ArrayList;
import java.util.List;
import java.util.Random;

public class RandomTileSetGenerator implements TileGenerator{
    private List<Tile> availableTiles;
    private Random randomGenerator;

    public RandomTileSetGenerator(Iterable<Tile> tiles, Random randomGenerator) {
        this.availableTiles = new ArrayList<>();
        for(Tile tile : tiles) {
            this.availableTiles.add(tile);
        }
        this.randomGenerator = randomGenerator;
    }


    @Override
    public Tile nextTile(Square square) {
        return RandomUtil.randomElement(square.compatiblesTiles(this.availableTiles), this.randomGenerator);
    }
}