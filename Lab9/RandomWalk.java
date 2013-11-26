import java.util.Random;


public class RandomWalk {
	private int x, y;
	private int steps, maxSteps;
	private int boundary;
	private int maxDistance;
	
	public RandomWalk(int max, int edge){
		maxSteps = max;
		boundary = edge;
		x = 0;
		y = 0;
		steps = 0;
		maxDistance = 0;
	}
	
	public RandomWalk(int max, int edge, int startX, int startY){
		maxSteps = max;
		boundary = edge;
		x = startX;
		y = startY;
		steps = 0;
		maxDistance = 0;
	}
	
	public String toString(){
		return "\nSteps: "+steps+"\nPosition: ("+x+","+y+")\n";
	}
	
	public void takeStep(){
		int dir = new Random().nextInt(4);
		switch (dir){
		case 0: ++y; break;
		case 1: ++x; break;
		case 2: --y; break;
		case 3: --x; break;
		}
		++steps;
		maxDistance = max(maxDistance, max(x,y));
	}
	
	public boolean moreSteps(){
		return (steps<maxSteps);
	}
	
	public boolean inBounds(){
		return(Math.abs(x)<=boundary && Math.abs(y)<=boundary);
	}
	
	public void walk(){
		while(moreSteps() && inBounds()){
			takeStep();
		}
	}
	
	public int getX(){
		return x;
	}
	
	public int getY(){
		return y;
	}
	
	public static boolean samePosition(RandomWalk p1, RandomWalk p2){
		return(p1.x == p2.x && p1.y == p2.x);
	}
	private int max(int num1, int num2){
		return Math.max(Math.abs(num1), Math.abs(num2));
	}
	public int getMaxDistance(){
		return maxDistance;
	}
}
