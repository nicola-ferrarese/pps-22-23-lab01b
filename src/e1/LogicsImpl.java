package e1;

import java.util.*;

public class LogicsImpl implements Logics {

	private Pair<Integer,Integer> pawn;
	private Pair<Integer,Integer> knight;
	private final int size;
	private final PositionGenerator positionGenerator = new PositionGeneratorImpl(new Random());
	public LogicsImpl(int size) {
		this.size = size;
		this.pawn = positionGenerator.generateRandomPosition(size, null);
		this.knight = positionGenerator.generateRandomPosition(size, this.pawn);
	}

	@Override
	public boolean hit(int row, int col) {
		if (row<0 || col<0 || row >= this.size || col >= this.size) {
			throw new IndexOutOfBoundsException();
		}
		this.knight=positionGenerator.moveKnight(row, col, this.knight);
		return this.pawn.equals(this.knight);
	}

	@Override
	public boolean hasKnight(int row, int col) {
		return this.knight.equals(new Pair<>(row,col));
	}

	public Pair getKnightPosition(){
		return new Pair(this.knight.getX(),this.knight.getY());
	}
	public void setKnightPosition(int x, int y){
		this.knight =new Pair<>(x,y);
	}

	public void setPawnPosition(int x, int y){
		this.pawn =new Pair<>(x,y);
	}

	public Pair getPawnPosition(){
		return new Pair(this.pawn.getX(),this.pawn.getY());
	}
	public Pair getPawn(){
		return this.pawn;
	}
	@Override
	public boolean hasPawn(int row, int col) {
		return this.pawn.equals(new Pair<>(row,col));
	}
}
