package e1;

public interface PositionGenerator {
    Pair<Integer, Integer> generateRandomPosition(int size, Pair<Integer, Integer> otherPosition);

    Pair<Integer, Integer> moveKnight(int row, int col, Pair<Integer, Integer> knight);
}
