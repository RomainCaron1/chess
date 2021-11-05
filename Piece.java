package chess;

public abstract class Piece {
    protected int x;
    protected int y;
    protected String color;
    protected String type;
    
    public Piece(int x, int y, String color, String type) {
        this.x = x;
        this.y = y;
        this.color = color;
        this.type = type;
    }

    //Getters & Setters
    public int getX() {
        return this.x;
    }

    public int getY() {
        return this.y;
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

    public void move(int newX, int newY) {
    }
}