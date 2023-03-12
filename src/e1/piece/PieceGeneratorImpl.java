package e1.piece;

import e1.Pair;
import e1.movements.Moves;

public class PieceGeneratorImpl implements PieceGenerator{

    @Override
    public Piece createPiece(Pair position, PieceType type, Moves moves) {
        return new PieceImpl(position, type, moves);
    }

}
