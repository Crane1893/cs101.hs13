package blatt7;
import java.util.Random;

public class GameOfLife {
	int size;
	boolean[][] matrix;
	
	/* Constructors */
	public GameOfLife(){
		this.size = 6;
		this.matrix = new boolean[][] {	{false,false,false,false,false,false},
										{false,true,false,true,false,false},
										{false,false,true,true,false,false},
										{false,false,true,false,false,false},
										{false,false,false,false,false,false},
										{false,false,false,false,false,false}};
	}
	
	public GameOfLife(int size){
		this.size = size;
		this.matrix = new boolean[size][size];
		Random rand = new Random();
		for(int x=0;x<size;x++){
			for(int y=0;y<size;y++){
				if(rand.nextInt(100)<30){this.matrix[x][y]=true;}
				else{this.matrix[x][y]=false;}
			}
		}
	}
	
	public boolean Alive(int x, int y){
		return this.matrix[x][y];
	}
	
	public int AliveNeighbours(int x, int y){
		int neighbours = 0;
		for(int i=x-1; i<=x+1; i++){
			for(int j=y-1; j<=y+1; j++){
				if(this.matrix[(i+size)%size][(j+size)%size] && !(i==x && j==y)) neighbours++;
			}
		}
		return neighbours;
	}
	
	public void update(int... percent){
		
	}
}
