package model;

import javafx.scene.paint.Color;
import model.Side;

import java.util.ArrayList;
import java.util.List;

public class ColoredSide implements Side {
    private final Color color;

    public ColoredSide(Color color) {
        this.color = color;
    }

    public Color color() {
        return this.color;
    }
}