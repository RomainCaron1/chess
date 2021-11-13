package chess;

public class Chessboard {
    private Piece[][] pieces;

    public Chessboard() {
        //Initalisation des pièces noires
        Piece BT1 = new Rook(0, 0, "black"); Piece BC1 = new Knight(0, 1, "black"); 
        Piece BF1 = new Bishop(0, 2, "black"); Piece BRE = new Queen(0, 3, "black"); 
        Piece BRO = new King(0, 4, "black"); Piece BF2 = new Bishop(0, 5, "black");
        Piece BC2 = new Knight(0, 6, "black"); Piece BT2 = new Rook(0, 7, "black");
        Piece BP1 = new Pawn(1, 0, "black"); Piece BP2 = new Pawn(1, 1, "black");
        Piece BP3 = new Pawn(1, 2, "black"); Piece BP4 = new Pawn(1, 3, "black");
        Piece BP5 = new Pawn(1, 4, "black"); Piece BP6 = new Pawn(1, 5, "black");
        Piece BP7 = new Pawn(1, 6, "black"); Piece BP8 = new Pawn(1, 7, "black");

        //Initialisation des pièces blanches
        Piece WP1 = new Pawn(5, 0, "white"); Piece WP2 = new Pawn(5, 1, "white");
        Piece WP3 = new Pawn(5, 2, "white"); Piece WP4 = new Pawn(5, 3, "white");
        Piece WP5 = new Pawn(5, 4, "white"); Piece WP6 = new Pawn(5, 5, "white");
        Piece WP7 = new Pawn(5, 6, "white"); Piece WP8 = new Pawn(5, 7, "white");
        Piece WT1 = new Rook(0, 6, "white"); Piece WC1 = new Knight(1, 6, "white"); 
        Piece WF1 = new Bishop(2, 6, "white"); Piece WRE = new Queen(3, 6, "white"); 
        Piece WRO = new King(4, 6, "white"); Piece WF2 = new Bishop(5, 6, "white");
        Piece WC2 = new Knight(6, 6, "white"); Piece WT2 = new Rook(7, 6, "white");

        Piece[][] p = {
            { BT1, BC1, BF1, BRE, BRO, BF2, BC2, BT2 },
            { BP1, BP2, BP3, BP4, BP5, BP6, BP7, BP8 },
            { null, null, null, null, null, null, null, null },
            { null, null, null, null, null, null, null, null },
            { null, null, null, null, null, null, null, null },
            { WP1, WP2, WP3, WP4, WP5, WP6, WP7, WP8 },
            { WT1, WC1, WF1, WRO, WRE, WF2, WC2, WT2 }
        };
        this.pieces = p;
    }

    public Piece[][] getChessBoard() {
        return this.pieces;
    }

    public void updateChessBoard(Piece piece, int newL, int newC) {
        for(int i = 0; i < 7; i++) {
            for(int j = 0; j < 8; j++) {
                if(pieces[i][j] == piece) {
                    pieces[newL][newC] = piece;
                    pieces[i][j] = null;
                }
            }
        }
        pieces[newL][newC] = piece;
    }
}