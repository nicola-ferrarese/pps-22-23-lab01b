package e1;

import java.util.Random;

public class PositionGeneratorImpl implements PositionGenerator {

    private final Random random;

    public PositionGeneratorImpl(Random random) {
        this.random = random;
    }

    @Override
    public Pair<Integer, Integer> generateRandomPosition(int size, Pair<Integer, Integer> otherPosition) {
        Pair<Integer, Integer> position = new Pair<>(this.random.nextInt(size), this.random.nextInt(size));
        while (position.equals(otherPosition)) {
            position = new Pair<>(this.random.nextInt(size), this.random.nextInt(size));
        }
        return position;
    }

    public Pair<Integer, Integer> moveKnight(int row,int col, Pair<Integer, Integer> knight) {
        // Below a compact way to express allowed moves for the knight
        int x = row- knight.getX();
        int y = col- knight.getY();
        // if the move is not allowed, the knight stays in the same position
        if (x!=0 && y!=0 && Math.abs(x)+Math.abs(y)==3) {
            knight = new Pair<>(row,col);
        }

        return knight;
    }

}
