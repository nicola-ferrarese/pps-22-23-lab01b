package e1;
import e1.piece.Piece;
import e1.piece.PieceGeneratorImpl;
import e1.piece.PieceImpl;

import java.util.*;

public class LogicsImpl implements Logics {
	
	private Piece pawn;
	private Piece knight;

	private PieceGeneratorImpl factory = new PieceGeneratorImpl();
	private final Random random = new Random();
	private final int size;
	 
    public LogicsImpl(int size){
    	this.size = size;
		this.knight = factory.createKnight(randomEmptyPosition());
		this.pawn = factory.createPawn(randomEmptyPosition());

    }
    private Pair<Integer,Integer> randomEmptyPosition(){
		Pair<Integer,Integer> pos = new Pair<>(this.random.nextInt(size),this.random.nextInt(size));
    	// the recursive call below prevents clash with an existing pawn
    	return this.pawn!=null && this.pawn.getPosition().equals(pos) ? randomEmptyPosition() : pos;
    }

	@Override
	public boolean hit(int row, int col) {
		if (row<0 || col<0 || row >= this.size || col >= this.size) {
			throw new IndexOutOfBoundsException();
		}
		if(this.knight.canMove(this.knight, new Pair<>(row,col), this.size)){
			this.knight.setPosition(new Pair<>(row,col));
			return this.pawn.getPosition().equals(this.knight.getPosition());
		}
		return false;
	}

	@Override
	public boolean hasKnight(int row, int col) {
		return this.knight.getPosition().equals(new Pair<>(row,col));
	}
	@Override
	public boolean hasPawn(int row, int col) {
		return this.pawn.getPosition().equals(new Pair<>(row,col));
	}
}
