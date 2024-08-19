package chess;

import boardgame.Position;

public class ChessPosition {

    private char column;
    private int row;


    //logica para verificar se o programa vai rodar seguro
    //e vendo se as linhas e colunas vão estar no intervalo valido
    public ChessPosition(char column, int row) {
        if (column < 'a' || column > 'h' || row < 1 || row > 8) {
            throw new ChessException("Error nas posçoes de a até h e de 1 até 8.");
        }
        this.column = column;
        this.row = row;
    }

    public char getColumn() {
        return column;
    }
    public int getRow() {
        return row;
    }

    protected Position toPosition(){
        return new Position(8 - row, column - 'a');
    }

    protected static ChessPosition fromPosition(Position position){
        return new ChessPosition((char)('a' + position.getColumn()), 8 - position.getRow());
    }

    @Override
    public String toString() {
        return " " + column + row;
    }
}
