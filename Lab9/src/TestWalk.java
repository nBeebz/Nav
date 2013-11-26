// ************************************************************
// TestWalk.java
//
// Program to test methods in the RandomWalk class.
// ************************************************************
import java.util.Scanner;
public class TestWalk
{
	public static void main (String[] args)
	{
		/*
		RandomWalk test = new RandomWalk(200, 10);
		System.out.println("Before walk() is called:"+test);
		test.walk();
		System.out.println("After walk() is called:"+test);
		*/
		int maxSteps; // maximum number of steps in a walk
		int maxCoord; // the maximum x and y coordinate
		int x, y; // starting x and y coordinates for a walk
		Scanner scan = new Scanner(System.in);
		System.out.println ("\nRandom Walk Test Program");
		System.out.println ();
		System.out.print ("Enter the boundary for the square: ");
		maxCoord = scan.nextInt();
		System.out.print ("Enter the maximum number of steps: ");
		maxSteps = scan.nextInt();
		System.out.print ("Enter the starting x and y coordinates with " +
				"a space between: ");
		x = scan.nextInt();
		y = scan.nextInt();
		RandomWalk walk1 = new RandomWalk(10,5);
		RandomWalk walk2 = new RandomWalk(maxSteps, maxCoord, x, y);
		for(int i=0;i<5;i++){
			walk1.takeStep();
			walk2.takeStep();
			System.out.println("Walk 1:"+walk1);
			System.out.println("Walk 2:"+walk2);
			
		}
		System.out.println("Walk 1 distance:"+walk1.getMaxDistance());
		System.out.println("Walk 2 distance:"+walk2.getMaxDistance());	
		scan.close();
	}
}