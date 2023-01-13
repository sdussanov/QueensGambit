package chess.pieces;

import chess.ChessBoard;
import chess.ChessPiece;

public class Pawn extends ChessPiece {

    public Pawn(String color) {
        super(color);
    }

    @Override
    protected String getColor() {
        return this.color;
    }

    @Override
    protected char getSymbol() {
        return 'P';
    }

    @Override
    protected boolean canMoveToPosition(ChessBoard chessBoard, int line, int column, int toLine, int toColumn) {
        chessBoard.moveToPosition();

        return false;

    }
}
