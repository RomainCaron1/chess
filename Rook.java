package chess;

public final class Rook extends Piece{
    public Rook(int l, int c, String color) {
        super(l, c, color, "tour");
    }

    @Override
    public boolean canBeMoved(int newC, int newL) {
        return false;
    }
}