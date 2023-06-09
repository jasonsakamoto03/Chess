// By: Jason Sakamoto
// Date: 4/25/2023
// The implementation of the game of chess for two players
import java.util.*;

public class Chess {
    private Piece[][] board;
    //private boolean isWhiteTurn;

    public Chess() {
        this.board = new Piece[8][8];
        setup();
        //this.isWhiteTurn = true;
    }


    // Returns the current state of the game as a String
    public String toString() {
        String result = "";
        for (int i = 0; i < 8; i++) {
            for (int j = 0; j < 8; j++) {
                if (board[i][j] != null) {
                    result += board[i][j].getVisual() + " ";
                } else {
                    result += " -  ";
                }
            }
            result += "\n";
        }
        return result;
    }

    // Creates all of the pieces in starting position
    private void setup() {
        // White pieces
        Piece whitePawn1 = new Pawn(6, 0, true, "WP1");
        board[whitePawn1.getXPos()][whitePawn1.getYPos()] = whitePawn1;
        Piece whitePawn2 = new Pawn(6, 1, true, "WP2");
        board[whitePawn2.getXPos()][whitePawn2.getYPos()] = whitePawn2;
        Piece whitePawn3 = new Pawn(6, 2, true, "WP3");
        board[whitePawn3.getXPos()][whitePawn3.getYPos()] = whitePawn3;
        Piece whitePawn4 = new Pawn(6, 3, true, "WP4");
        board[whitePawn4.getXPos()][whitePawn4.getYPos()] = whitePawn4;
        Piece whitePawn5 = new Pawn(6, 4, true, "WP5");
        board[whitePawn5.getXPos()][whitePawn5.getYPos()] = whitePawn5;
        Piece whitePawn6 = new Pawn(6, 5, true, "WP6");
        board[whitePawn6.getXPos()][whitePawn6.getYPos()] = whitePawn6;
        Piece whitePawn7 = new Pawn(6, 6, true, "WP7");
        board[whitePawn7.getXPos()][whitePawn7.getYPos()] = whitePawn7;
        Piece whitePawn8 = new Pawn(6, 7, true, "WP8");
        board[whitePawn8.getXPos()][whitePawn8.getYPos()] = whitePawn8;
        Piece whiteRook1 = new Rook(7, 0, true, "WR1");
        board[whiteRook1.getXPos()][whiteRook1.getYPos()] = whiteRook1;
        Piece whiteRook2 = new Rook(7, 7, true, "WR2");
        board[whiteRook2.getXPos()][whiteRook2.getYPos()] = whiteRook2;
        Piece whiteKnight1 = new Knight(7, 1, true, "WN1");
        board[whiteKnight1.getXPos()][whiteKnight1.getYPos()] = whiteKnight1;
        Piece whiteKnight2 = new Knight(7, 6, true, "WN2");
        board[whiteKnight2.getXPos()][whiteKnight2.getYPos()] = whiteKnight2;
        Piece whiteBishop1 = new Bishop(7, 2, true, "WB1");
        board[whiteBishop1.getXPos()][whiteBishop1.getYPos()] = whiteBishop1;
        Piece whiteBishop2 = new Bishop(7, 5, true, "WB2");
        board[whiteBishop2.getXPos()][whiteBishop2.getYPos()] = whiteBishop2;
        Piece whiteQueen = new Queen(7, 3, true, "WQu");
        board[whiteQueen.getXPos()][whiteQueen.getYPos()] = whiteQueen;
        Piece whiteKing = new King(7, 4, true, "WKi");
        board[whiteKing.getXPos()][whiteKing.getYPos()] = whiteKing;
        
        // Black Pieces
        Piece blackPawn1 = new Pawn(1, 0, false, "BP1");
        board[blackPawn1.getXPos()][blackPawn1.getYPos()] = blackPawn1;
        Piece blackPawn2 = new Pawn(1, 1, false, "BP2");
        board[blackPawn2.getXPos()][blackPawn2.getYPos()] = blackPawn2;
        Piece blackPawn3 = new Pawn(1, 2, false, "BP3");
        board[blackPawn3.getXPos()][blackPawn3.getYPos()] = blackPawn3;
        Piece blackPawn4 = new Pawn(1, 3, false, "BP4");
        board[blackPawn4.getXPos()][blackPawn4.getYPos()] = blackPawn4;
        Piece blackPawn5 = new Pawn(1, 4, false, "BP5");
        board[blackPawn5.getXPos()][blackPawn5.getYPos()] = blackPawn5;
        Piece blackPawn6 = new Pawn(1, 5, false, "BP6");
        board[blackPawn6.getXPos()][blackPawn6.getYPos()] = blackPawn6;
        Piece blackPawn7 = new Pawn(1, 6, false, "BP7");
        board[blackPawn7.getXPos()][blackPawn7.getYPos()] = blackPawn7;
        Piece blackPawn8 = new Pawn(1, 7, false, "BP8");
        board[blackPawn8.getXPos()][blackPawn8.getYPos()] = blackPawn8;
        Piece blackRook1 = new Rook(0, 0, false, "BR1");
        board[blackRook1.getXPos()][blackRook1.getYPos()] = blackRook1;
        Piece blackRook2 = new Rook(0, 7, false, "BR2");
        board[blackRook2.getXPos()][blackRook2.getYPos()] = blackRook2;
        Piece blackKnight1 = new Knight(0, 1, false, "BN1");
        board[blackKnight1.getXPos()][blackKnight1.getYPos()] = blackKnight1;
        Piece blackKnight2 = new Knight(0, 6, false, "BN2");
        board[blackKnight2.getXPos()][blackKnight2.getYPos()] = blackKnight2;
        Piece blackBishop1 = new Bishop(0, 2, false, "BB1");
        board[blackBishop1.getXPos()][blackBishop1.getYPos()] = blackBishop1;
        Piece blackBishop2 = new Bishop(0, 5, false, "BB2");
        board[blackBishop2.getXPos()][blackBishop2.getYPos()] = blackBishop2;
        Piece blackQueen = new Queen(0, 3, false, "BQu");
        board[blackQueen.getXPos()][blackQueen.getYPos()] = blackQueen;
        Piece blackKing = new King(0, 4, false, "BKi");
        board[blackKing.getXPos()][blackKing.getYPos()] = blackKing;
    }
}