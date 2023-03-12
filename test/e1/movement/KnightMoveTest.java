package e1.movement;

import e1.Pair;
import org.junit.jupiter.api.Test;

import java.util.Set;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertTrue;

public class KnightMoveTest {

    public static final int SIZE = 5;

    private final Move moves= new KnightMove() {
    };

    @Test
    void testGetPossibleMoves() {
        final var position = new Pair<>(0, 0);
        final var moves = this.moves.getPossibleMoves(position, SIZE);
        final var expectedMoves = Set.of(
                new Pair<>(2, 1),
                new Pair<>(1, 2)
        );
        assertEquals(2, moves.size());
        assertTrue(moves.containsAll(expectedMoves));
    }

    @Test
    void testNoPossibleMoves() {
        final var position = new Pair<>(0, 0);
        final var boardSize = 2;
        final var moves = this.moves.getPossibleMoves(position, boardSize);
        assertEquals(0, moves.size());
    }

}
