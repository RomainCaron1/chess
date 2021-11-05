package chess;

public class Chessboard {
    private Piece[][] pieces;

    public Chessboard() {
        //Initalisation des pièces noires
        Piece BT1 = new Rook(0, 0, "black"); Piece BC1 = new Knight(1, 0, "black"); 
        Piece BF1 = new Bishop(2, 0, "black"); Piece BRE = new Queen(3, 0, "black"); 
        Piece BRO = new King(4, 0, "black"); Piece BF2 = new Bishop(5, 0, "black");
        Piece BC2 = new Knight(6, 0, "black"); Piece BT2 = new Rook(7, 0, "black"); 
        Piece[][] p = {
            { BT1, BC1, BF1, BRE, BRO, BF2, BC2, BT2 }
        };
        this.pieces = p;
    }

    public Piece[][] getChessBoard() {
        return this.pieces;
    }
}