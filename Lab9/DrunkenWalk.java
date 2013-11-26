import java.util.Scanner;


public class DrunkenWalk {
	public static void main(String[] args){
		int steps, bounds, drunks;
		int dunks = 0;
		Scanner scan = new Scanner(System.in);
		System.out.println("Enter in the number of steps");
		steps = scan.nextInt();
		System.out.println("Enter in the bounds of the platform");
		bounds = scan.nextInt();
		System.out.println("Enter the number of drunks you want to test");
		drunks = scan.nextInt();
		RandomWalk drunkWalk; 
		for(int i=0;i<drunks;i++){
			drunkWalk = new RandomWalk(steps, bounds);
			drunkWalk.walk();
			if(!drunkWalk.inBounds()) ++dunks;
		}
		
		System.out.println("Number of drunks who were dunked: "+dunks);
	}
}
