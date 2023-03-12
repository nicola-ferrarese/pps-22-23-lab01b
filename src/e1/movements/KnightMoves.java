package e1.movements;

import e1.Pair;

import java.util.HashSet;
import java.util.Set;

public class KnightMoves implements Moves {
    @Override
    public Set<Pair<Integer, Integer>> getPossibleMoves(Pair position, int boardSize) {
        // Create a set to hold the pairs
        Set<Pair<Integer, Integer>> pairsSet = new HashSet<>();
        int x = (int) position.getX();
        int y = (int) position.getY();

        // Define the domain ranges for x and y
        int[] xRange = {x-2, x-1, x+1, x+2};
        int[] yRange = {y-2, y-1, y+1, y+2};

        // Generate all possible pairs and add them to the set
        for (int row : xRange) {
            for (int col : yRange) {
                if ((Math.abs(row) == (Math.abs(col))) ||
                    (row < 0 || col <0) ||
                    (row >= boardSize || col >= boardSize)){ continue; }
                pairsSet.add(new Pair<>(row, col));
            }
        }
        return pairsSet;
    }
}
