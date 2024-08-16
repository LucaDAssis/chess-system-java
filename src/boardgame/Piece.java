package boardgame;

public abstract class Piece {

    //aqui usando protect pra esse atributo só ser usado no nosso pacote board
    protected Position position;
    private Board board;

    public Piece(Board board) {
        this.board = board;
        position = null;
    }
    //Aqui usando protected para deixar esse metodo só ser usado no nosso pacote board
    protected Board getBoard() {
        return board;
    }

    //aqui criando uma matrix para ver os possiveis movimentos das peças
    public abstract boolean[][] possibleMoves();


    //aqui é o seguinte chamei o possibleMoves para ele me mostrar as possiblidades com o get de Row e Column
    //um metodo concreto usando um metodo abstrato
    //tem um padrão de projeto sobre isso o tampletemetodo
    public Boolean possibleMove(Position position) {
        return possibleMoves()[position.getRow()][position.getColumn()];
    }

    public Boolean isThereAnyPossibleMove() {
        boolean[][] mat = possibleMoves();
        for (int i = 0; i < mat.length; i++) {
            for (int j = 0; j < mat[i].length; j++) {
                if (mat[i][j]) {
                    return true;
                }
            }
        }
        return false;
    }

}
