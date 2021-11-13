package chess;

public final class King extends Piece{
    public King(int l, int c, String color) {
        super(l, c, color, "roi");
    }

    @Override
    public boolean canBeMoved(int newL, int newC) {
        if(this.getColor() == "black" || this.getColor() == "white") { //Pions noirs
            int l_plus = this.getL() + 1; int l_moins = this.getL() - 1;
            int c_plus = this.getC() + 1; int c_moins = this.getC() - 1;
            if(newL == l_plus && newC == this.getC() || newL == l_moins && newC == this.getC() || newC == c_plus && newL == this.getL() || newC == c_moins && newL == this.getL() ||
               newL == l_plus && newC == c_plus || newL == l_moins && newC == c_plus || newL == l_plus && newC == c_moins || newL == l_moins && newC == c_moins) {
                return true;
            } else {
                return false;
            }
        } else {
            return false;
        }
    }
}