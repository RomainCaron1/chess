package chess;

public final class King extends Piece{
    public King(int l, int c, String color) {
        super(l, c, color, "roi");
    }

    @Override
    public boolean canBeMoved(int newC, int newL) {
        return false;
    }
}