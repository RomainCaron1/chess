package chess;

public abstract class Piece {
    protected int l;
    protected int c;
    protected String color;
    protected String type;
    
    public Piece(int l, int c, String color, String type) {
        this.l = l;
        this.c = c;
        this.color = color;
        this.type = type;
    }

    //Getters & Setters
    public int getL() {
        return this.l;
    }

    public int getC() {
        return this.c;
    }

    public String getColor() {
        return this.color;
    }

    public String getType() {
        return this.type;
    }

    //Méthodes de la pièce
    public void take(Piece p) {
    }

    public void die() {
        System.gc();
    }

    public boolean canBeMoved(int newX, int newY) {
        return false;
    }
}