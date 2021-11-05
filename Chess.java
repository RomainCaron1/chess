package chess;

//rook = tour , bishop = fou

public class Chess {
    public static void main(String[] args) {
        Chessboard chessboard = new Chessboard();

        for(int i = 0; i < 8; i++) {
            System.out.println(chessboard.getChessBoard()[0][i].getType());
        }
    }
}