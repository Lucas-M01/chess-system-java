package chess.pieces;

import boardgame.Board;
import chess.ChessPiece;
import chess.Color;

public class King extends ChessPiece {

    public King(Board board, Color color) {
        super(board, color);
        //TODO Auto-generated constructor stub
    }

    @Override
    public boolean[][] possibleMoves() {
        // TODO Auto-generated method stub
        throw new UnsupportedOperationException("Unimplemented method 'possibleMoves'");
    }

    @Override
    public String toString() {
        return "K";
    }
    
}
