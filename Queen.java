package chess;

public final class Queen extends Piece{
    public Queen(int l, int c, String color) {
        super(l, c, color, "reine");
    }

    @Override
    public boolean canBeMoved(int newC, int newL) {
        return false;
    }
}