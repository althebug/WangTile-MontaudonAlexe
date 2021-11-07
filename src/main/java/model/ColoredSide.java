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

    @Override
    public Color color() {
        return this.color;
    }

    @Override
    public List<Side> compatiblesSides(List<Side> sides) {
        List<Side> sideAccepted = new ArrayList<>();
        for(Side side : sides) {
            if(this.accept(side))
                sideAccepted.add(side);
        }
        return sideAccepted;
    }

    @Override
    public boolean accept(Side side) {
        if(side.color() == this.color())
            return true;
        return false;
    }


}