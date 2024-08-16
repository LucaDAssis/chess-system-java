package chess.pieces;

import boardgame.Board;
import boardgame.Piece;
import chess.ChessPiece;
import chess.Color;

public class Rook extends ChessPiece {

    public Rook(Board board, Color color) {
        super(board, color);
    }

    @Override
    public String toString() {
        return "R";
    }


    //aqui eu implementei o metodo abstrato e fiz um novo bolean com o mesmo tamanho do tabuleiro
    @Override
    public boolean[][] possibleMoves() {
        boolean[][] mat = new boolean[getBoard().getRows()][getBoard().getColumns()];
        return mat;
    }
}
