package e1.piece;
import e1.Pair;
import e1.movements.Moves;

import java.util.Set;

public class PieceImpl implements Piece{
    Moves moves;
    private PieceType type;
    private Pair position;

    public PieceImpl(Pair position, PieceType type, Moves moves) {
        this.type = type;
        this.position = position;
        this.moves = moves;
    }

    @Override
    public Pair getPosition() {
        return this.position;
    }

    @Override
    public void setPosition(Pair position) {
        this.position = position;
    }

    @Override
    public PieceType getType() {
        return this.type;
    }

    @Override
    public Boolean canMove(Piece piece, Pair end, int boardSize) {
        if(this.moves.getPossibleMoves(piece.getPosition(), boardSize).contains(end)){
            return true;
        }
        return false;
    }
}
