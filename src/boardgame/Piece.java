package boardgame;

public class Piece {

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
}
