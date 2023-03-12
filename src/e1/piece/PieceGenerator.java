package e1.piece;

import e1.Pair;
import e1.movements.Moves;

public interface PieceGenerator {
    Piece createPiece(Pair position, PieceType type, Moves moves);
}
