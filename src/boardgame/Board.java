package boardgame;

public class Board {
    private int rows;
    private int columns;

    private Piece[][] pieces;

    public Board(int rows, int columns) {
        // if (rows < 1 || columns < 1) {
        //     throw new BoardException("Error creating board: there must be at least 1 row and 1 column");
        // }
        this.rows = rows;
        this.columns = columns;
        pieces = new Piece[rows][columns];
    }

    public int getRows() {
        return rows;
    }

    public int getColumns() {
        return columns;
    }

    public void setRows(int rows) {
        this.rows = rows;
    }

    public void setColumns(int columns) {
        this.columns = columns;
    }

    public Piece piece(int row, int column) {
        // if (!positionExists(row, column)) {
        //     throw new BoardException("Position not on the board");
        // }
        return pieces[row][column];
    }

    public Piece piece(Position position) {
        // if (!positionExists(position)) {
        //     throw new BoardException("Position not on the board");
        // }
        return pieces[position.getRow()][position.getColumn()];
    }
}