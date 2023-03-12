package e1.piece;

import e1.Pair;
import e1.movements.KnightMoves;
import e1.movements.Moves;

import java.util.Set;

public class PieceGeneratorImpl implements PieceGenerator{

    @Override
    public Piece createPawn(Pair piecePosition) {
        return new PieceImpl(piecePosition, PieceType.PAWN, (position, boardSize) -> Set.of());
    }

    @Override
    public Piece createKnight(Pair piecePosition) {
        return new PieceImpl(piecePosition, PieceType.KNIGHT, new KnightMoves());
    }

}
