package chess;

public abstract class ChessPiece {
    protected String color;
    private boolean check;

    public ChessPiece(String color) {
        this.color = color;
        check = true;
    }

    protected abstract String getColor();

    protected abstract char getSymbol();

    protected abstract boolean canMoveToPosition(ChessBoard chessBoard, int line, int column, int toLine, int toColumn);

}
