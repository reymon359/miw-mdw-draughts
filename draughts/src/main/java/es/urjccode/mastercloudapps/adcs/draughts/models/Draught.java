package es.urjccode.mastercloudapps.adcs.draughts.models;

public class Draught extends Piece {

    private static final int MAX_DISTANCE = 2;

    Draught(Color color) {
        super(color);
    }

    @Override
    Error isCorrectDiagonalMovement(int amountBetweenDiagonalPieces, int pair, Coordinate... coordinates) {
        if (amountBetweenDiagonalPieces > 1)
            return Error.TOO_MUCH_EATINGS;

        int distance = coordinates[pair].getDiagonalDistance(coordinates[pair+1]);
        if (distance == MAX_DISTANCE && amountBetweenDiagonalPieces != 1)
            return Error.MISSED_EATING;

        return null;
    }

    @Override
    public String getCode() {
        return super.getCode();
    }

}
