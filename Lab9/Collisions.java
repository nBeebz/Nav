
public class Collisions {
	
	public static void main(String[] args){
		final int maxSteps = 100000;
		int collisions = 0;
		RandomWalk p1 = new RandomWalk(maxSteps,2000000,-3,0);
		RandomWalk p2 = new RandomWalk(maxSteps,2000000,3,0);
		for(int i=0;i<maxSteps;i++){
			p1.takeStep();
			p2.takeStep();
			if(RandomWalk.samePosition(p1,p2)) ++collisions;
		}
		System.out.println("They collided "+collisions+" times");
	}
}
