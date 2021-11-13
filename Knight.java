package chess;

public final class Knight extends Piece{
    public Knight(int l, int c, String color) {
        super(l, c, color, "cavalier");
    }

    @Override
    public boolean canBeMoved(int newC, int newL) {
        return false;
    }
}