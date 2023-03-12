package e1.movements;

import e1.Pair;

import java.util.Set;

public interface Moves {
    Set<Pair<Integer, Integer>> getPossibleMoves(Pair position, int boardSize);

}
