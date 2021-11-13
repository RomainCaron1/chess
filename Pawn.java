package chess;

public final class Pawn extends Piece{
    public Pawn(int l, int c, String color) {
        super(l, c, color, "pion");
    }

    @Override
    public boolean canBeMoved(int newL, int newC) {
        if(this.getColor() == "black") { //Pions noirs
            if(newL == (this.getL() + 1) && newC == this.getC()) {
                return true;
            } else {
                return false;
            }
        } else if(this.getColor() == "white") { //Pions blancs
            if(newL == this.getL() - 1 && newC == this.getC()) {
                return true;
            } else {
                return false;
            }
        } else {
            return false;
        }
    }
}