package boardgame;

public class Board {
    private int rows;
    private int columns;
    private Piece[][] pieces;

    public Board(int rows, int columns) {
        this.rows = rows;
        this.columns = columns;
        this.pieces = new Piece[rows][columns];
    }

    public int getRows() {
        return rows;
    }

    public void setRows(int rows) {
        this.rows = rows;
    }

    public int getColumns() {
        return columns;
    }

    public void setColumns(int columns) {
        this.columns = columns;
    }

    //aqui estou pegando a posição das peças e armazenando.
    public Piece piece() {
        return pieces[rows][columns];
    }

    //aqui estou pegando o armazenamento da posição das peças e retornando para uso
    public Piece piece(Position position){
        return pieces[position.getRow()][position.getColumn()];
    }

    public Piece piece(int row, int column) {
        return pieces[row][column];
    }

}
