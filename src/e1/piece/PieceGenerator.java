package e1.piece;

import e1.Pair;
import e1.movements.Moves;

public interface PieceGenerator {
    Piece createPawn(Pair position);

    Piece createKnight(Pair position);
}
