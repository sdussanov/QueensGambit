package chess;

public class King extends ChessPiece {

    public King(String color) {
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
