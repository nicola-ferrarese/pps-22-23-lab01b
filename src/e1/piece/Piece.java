package e1.piece;
import e1.Pair;

import java.util.Set;

public interface Piece {

    Pair getPosition();

    void setPosition(Pair position);

    PieceType getType();

    Boolean canMove(Piece piece, Pair end, int boardSize);
}