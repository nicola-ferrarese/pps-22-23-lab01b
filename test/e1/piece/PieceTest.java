package e1.piece;
import e1.Pair;
import org.junit.jupiter.api.Test;

import java.util.Set;

import static e1.piece.PieceType.KNIGHT;
import static e1.piece.PieceType.PAWN;
import static org.junit.jupiter.api.Assertions.*;

public class PieceTest {

    private final PieceGenerator generator = new PieceGeneratorImpl();

    @Test
    void testPawnType() {
        var pawnPosition = new Pair(0, 0);
        Piece pawn = this.generator.createPawn(pawnPosition);
        assertEquals(pawn.getType(), PAWN);
    }
    @Test
    void testKnightType() {
        var KnightPosition = new Pair(0, 0);
        Piece pawn = this.generator.createKnight(KnightPosition);
        assertEquals(pawn.getType(), KNIGHT);
    }

    @Test
    void testPawnSpawned() {
        var pawnPosition = new Pair(0, 0);
        Piece pawn = this.generator.createPawn(pawnPosition);
        assertEquals(pawnPosition, pawn.getPosition());
        assertNotNull(pawn);
    }
    @Test
    void testKnightSpawned() {
        var knightPosition = new Pair(0, 0);
        Piece knight = this.generator.createKnight(knightPosition);
        assertEquals(knightPosition, knight.getPosition());
        assertNotNull(knight);
    }
}
