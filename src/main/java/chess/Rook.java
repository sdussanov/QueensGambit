package chess;

public class Rook extends ChessPiece {

    public Rook(String color) {
        super(color);
    }

    @Override
    protected String getColor() {
        return null;
    }

    @Override
    protected char getSymbol() {
        return 0;
    }

    @Override
    protected boolean canMoveToPosition(ChessBoard chessBoard, int line, int column, int toLine, int toColumn) {
        return false;
    }
}
