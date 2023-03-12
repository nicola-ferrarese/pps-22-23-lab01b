package e1;

import e1.Pair;
import org.junit.jupiter.api.BeforeEach;

import e1.LogicsImpl;
import org.junit.jupiter.api.Test;

import java.util.ArrayList;
import java.util.List;
import java.util.function.BiFunction;

import static org.junit.jupiter.api.Assertions.*;

/**
 * The test suite for testing the Exercise_1 implementation
 */
public class e1Test {
    private LogicsImpl Logic;
    private final int BOARD_SIZE = 4;
    @BeforeEach
    void beforeEach(){
        int SIZE = 5;
        Logic = new LogicsImpl(SIZE);
    }
    @Test
    void testOnlyOneKnight(){
        assertEquals(1, pieceCounter(this.Logic::hasKnight));
    }
    @Test
    void testOnlyOnePawn(){
        assertEquals(1, pieceCounter(this.Logic::hasPawn));
    }

    private long pieceCounter(BiFunction<Integer, Integer, Boolean> piece){
        List<Pair<Integer, Integer>> allPositions = new ArrayList<>();
        for (var i = 0; i < BOARD_SIZE; i++) {
            for (var y = 0; y < BOARD_SIZE; y++) {
                allPositions.add(new Pair<>(i, y));
            }
        }
        return allPositions.stream()
                    .map(p -> piece.apply(p.getX(),p.getY()))
                    .filter(Boolean::booleanValue)
                    .count();
    }

}
