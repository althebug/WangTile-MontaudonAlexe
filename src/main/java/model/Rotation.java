package model;

import model.CardinalDirection;

public enum Rotation {
    NO_TURN(0),
    QUARTER_TURN(1),
    HALF_TURN(2),
    THREE_QUARTER_TURN(3);


    private final int numberOfQuarterTurns;

    Rotation(int numberOfQuartersTurns) {
        this.numberOfQuarterTurns = numberOfQuartersTurns;
    }

    public CardinalDirection rotatedDirection(CardinalDirection direction) {
        switch (this) {
            case NO_TURN:
                return direction;
            case QUARTER_TURN:
                switch (direction.ordinal()) {
                    case 0:
                        return CardinalDirection.EAST;
                    case 1:
                        return CardinalDirection.SOUTH;
                    case 2:
                        return CardinalDirection.WEST;
                    case 3:
                        return CardinalDirection.NORTH;
                }
            case HALF_TURN:
                return direction.oppositeDirection();
            case THREE_QUARTER_TURN:
                switch (direction.ordinal()) {
                    case 0:
                        return CardinalDirection.WEST;
                    case 1:
                        return CardinalDirection.NORTH;
                    case 2:
                        return CardinalDirection.EAST;
                    case 3:
                        return CardinalDirection.SOUTH;
                }
        }
        return null;
    }
    public Rotation getRandomValue(int value) {
        return switch (value) {
            case 0 -> Rotation.NO_TURN;
            case 1 -> Rotation.QUARTER_TURN;
            case 2 -> Rotation.HALF_TURN;
            case 3 -> Rotation.THREE_QUARTER_TURN;
            default -> null;
        };
    }
}