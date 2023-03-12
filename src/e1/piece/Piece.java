package e1.piece;
import e1.Pair;

import java.util.Set;

public interface Piece {

    Pair getPosition();

    void setPosition(Pair position);

    PieceType getType();

    Set<Pair<Integer, Integer>> getPossibleMoves(int boardSize);
}