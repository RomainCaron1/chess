package chess;

public final class Pawn extends Piece{
    public Pawn(int x, int y, String color) {
        super(x, y, color, "pion");
    }

    @Override
    public void move(int newX, int newY) {
    }
}