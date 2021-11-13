package chess;

public final class Bishop extends Piece{
    public Bishop(int l, int c, String color) {
        super(l, c, color, "fou");
    }

    @Override
    public boolean canBeMoved(int newC, int newL) {
        return false;
    }
}