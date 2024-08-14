package boardgame;

public class Board {
    private int rows;
    private int columns;
    private Piece[][] pieces;

    public Board(int rows, int columns) {
        if (rows < 1 || columns < 1) {
            throw new BoardException("Error: rows and columns must be greater than 0");
        }
        this.rows = rows;
        this.columns = columns;
        this.pieces = new Piece[rows][columns];
    }

    public int getRows() {
        return rows;
    }

    public int getColumns() {
        return columns;
    }

    //aqui estou pegando o armazenamento da posição das peças e retornando para uso
    public Piece piece(Position position){
        if (!positionExists(position)) {
            throw new BoardException("Error: position does not exist");
        }
        return pieces[position.getRow()][position.getColumn()];
    }

    //aqui estou pegando a posição das peças e armazenando.
    public Piece piece(int row, int column) {
        if (!positionExists(row, column)) {
            throw new BoardException("Error: position not on the board");
        }
        return pieces[row][column];
    }

    public void placePiece(Piece piece, Position position) {
        if(thereIsAPiece(position)){
            throw new BoardException("Error: There is already a piece on the board " + position);
        }
        pieces[position.getRow()][position.getColumn()] = piece;
        piece.position = position;
    }

    public Piece removePiece(Position position) {
        if (!positionExists(position)) {
            throw new BoardException("Error: position does not exist");
        }
        if(piece(position) == null){
            return null;
        }
        Piece aux = piece(position);
        aux.position = null;
        pieces[position.getRow()][position.getColumn()] = null;
        return aux;
    }

    private Boolean positionExists(int row, int column) {
        return row >= 0 && row < rows && column >= 0 && column < columns;
    }

    public Boolean positionExists(Position position) {
        return positionExists(position.getRow(), position.getColumn());
    }

    public Boolean thereIsAPiece(Position position) {
        if (!positionExists(position)) {
            throw new BoardException("Error: position does not exist");
        }
        return piece(position) != null;
    }

}
