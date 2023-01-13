package chess;

public class ChessBoard {
    ChessPiece[][] board = new ChessPiece[8][8];
    String nowPlayer;

    public ChessBoard(String nowPlayer) {
        this.nowPlayer = nowPlayer;
    }

    public String nowPlayerColor() {
        return nowPlayer;
    }

    public boolean moveToPosition() {
        return true;
    }

    public void printBoard() {
    }
}