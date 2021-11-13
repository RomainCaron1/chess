package chess;

//rook = tour , bishop = fou

public class Chess {
    public static void main(String[] args) {
        Chessboard chessboard = new Chessboard();
        Piece[][] pieces = chessboard.getChessBoard();

        /*for(int i = 0; i < 8; i++) {
            System.out.println(chessboard.getChessBoard()[0][i].getType());
        }*/

        /*for(int i = 0; i < 7; i++) {
            for(int j = 0; j < 8; j++) {
                if(pieces[i][j] != null) {
                    System.out.println(pieces[i][j].getType());
                } else {
                    System.out.println("case vide");
                }
            }
        }*/



        /*
        int l1; int c1;
        int l2; int c2;

        while(!pieces[l1][c1].canBeMoved(l2, c2)) {
            //on lui demande de ressaisir l1, c1 et l2, c2
        }
        */

        if(pieces[1][0].canBeMoved(2, 0)) { //Est ce que le 1er pion de la 2e rangée peu avancer de 1 cases ?
            chessboard.updateChessBoard(pieces[1][0], 2, 0);
            System.out.println(pieces[2][0]); //Avant cette case était nulle, maintenant le pion a bougé donc la case contient le pion
        } else {
            System.out.println("Impossible !");
        }

        if(pieces[5][0].canBeMoved(3, 0)) { //Est ce que le 1er pion de la 5e rangée (1ere rangée des blancs) peu avancer de 2 cases ?
            chessboard.updateChessBoard(pieces[5][0], 3, 0);
            System.out.println(pieces[3][0].getType());
        } else {
            System.out.println("Impossible !");
        }

        if(pieces[0][4].canBeMoved(1, 3)) { //Est ce que le roi noir peut bouger en diagonale en bas à gauche de 1 case ?
            System.out.println("oui");
        }

    }
}