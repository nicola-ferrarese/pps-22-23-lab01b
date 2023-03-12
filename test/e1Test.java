import e1.Pair;
import org.junit.jupiter.api.BeforeEach;

import e1.LogicsImpl;
import org.junit.jupiter.api.Test;

import java.util.ArrayList;
import java.util.List;

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
    void testDifferentPositions(){
        assertNotEquals(Logic.getKnightPosition(),Logic.getPawnPosition());
    }
    @Test
    void testOnlyOneKnight(){
        List<Pair<Integer, Integer>> allPositions = new ArrayList<>();
        for (var i = 0; i < BOARD_SIZE; i++) {
            for (var y = 0; y < BOARD_SIZE; y++) {
                allPositions.add(new Pair<>(i, y));
            }
        }
        int count = 0;
        for (Pair<Integer, Integer> p : allPositions) {
            boolean hasKnight = this.Logic.hasKnight(p.getX(), p.getY());
            if (hasKnight){
                count++;
            }
        }
        assertEquals(1, count);
    }
    @Test
    void testOnlyOnePawn(){
        List<Pair<Integer, Integer>> allPositions = new ArrayList<>();
        for (var i = 0; i < BOARD_SIZE; i++) {
            for (var y = 0; y < BOARD_SIZE; y++) {
                allPositions.add(new Pair<>(i, y));
            }
        }
        int count = 0;
        for (Pair<Integer, Integer> p : allPositions) {
            boolean hasPawn = this.Logic.hasPawn(p.getX(), p.getY());
            if (hasPawn){
                count++;
            }
        }
        assertEquals(1, count);
    }


}
