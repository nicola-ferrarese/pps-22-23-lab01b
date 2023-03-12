import e1.LogicsImpl;
import e1.Pair;
import e1.PositionGenerator;
import e1.PositionGeneratorImpl;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import java.util.Random;
import static org.junit.jupiter.api.Assertions.*;

public class PositionGeneratorTest extends LogicsTest{
    private final PositionGenerator positionGenerator = new PositionGeneratorImpl(new Random());
    private Pair<Integer, Integer> knight;
    private Pair<Integer, Integer> newPosition;
    private Pair<Integer, Integer> startPosition;
    @BeforeEach
    void BeforeEach(){
        knight = new Pair<>(2, 3);
        startPosition = knight;
        int SIZE = 5;
        Logic = new LogicsImpl(SIZE);
    }
    @Test
    void testMoveKnightValid() {
        // Test moving to a valid position
        newPosition = positionGenerator.moveKnight(3, 1, knight);
        assertEquals(new Pair<>(3, 1), newPosition);
    }
    @Test
    void testMoveKnightSamePosition() {
        // Test moving to the same position
        // the knight should not move at all
        newPosition = new Pair<>(3,1);
        newPosition = positionGenerator.moveKnight(3, 1, newPosition);
        assertEquals(new Pair<>(3, 1), newPosition);
    }
    @Test
    void testMoveKnightInvalid() {
        // Test moving outside the board
        newPosition = positionGenerator.moveKnight(-1, -1, knight);
        assertEquals(startPosition, newPosition);
        // test moving to a position that is not a valid move for the knight
        newPosition = positionGenerator.moveKnight(2, 0, knight);
        assertEquals(startPosition, newPosition);

    }
}
