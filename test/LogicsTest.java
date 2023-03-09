import org.junit.jupiter.api.BeforeEach;

import e1.LogicsImpl;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

/**
 * The test suite for testing the Exercise_1 implementation
 */
public class LogicsTest {
    LogicsImpl Logic;

    @BeforeEach
    void BeforeEach(){
        int SIZE = 5;
        Logic = new LogicsImpl(SIZE);
    }
    @Test
    void TestDifferentPositions(){
        assertNotEquals(Logic.getKnightPosition(),Logic.getPawnPosition());
    }
    @Test
    void TestHit(){
        Logic.setKnightPosition(0,0);
        Logic.setPawnPosition(2,1);
        assertTrue(Logic.hit(2,1));
    }
    @Test
    void TestMove(){
        Logic.setKnightPosition(0,0);
        Logic.setPawnPosition(5,5);
        assertFalse(Logic.hit(2,1));
    }

}
