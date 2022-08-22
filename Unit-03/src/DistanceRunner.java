//(c) A+ Computer Science
//www.apluscompsci.com

//Name -
//Date -
//Class -
//Lab  -

import java.util.Scanner; 
import static java.lang.System.*;
import static java.lang.Math.*;

public class DistanceRunner
{
	public static void main( String[] args )
	{
		//add test cases	
		
		Scanner keyboard = new Scanner(System.in);
		
		System.out.print("Enter X1 :: ");
		int x1 = keyboard.nextInt();
		
		System.out.print("Enter Y1 :: ");
		int y1 = keyboard.nextInt();
		
		System.out.print("Enter X2 :: ");
		int x2 = keyboard.nextInt();
		
		System.out.print("Enter Y2 :: ");
		int y2 = keyboard.nextInt();
		
		Distance test = new Distance();
		test.setCoordinates(x1, y1, x2, y2);
		
		System.out.println(test);
		
		int testCases[][] = {
				{1, 1, 2, 1}, 
				{1, 1, -2, 2}, 
				{1, 1, 0, 0}, 
		};
		
		for (int[] testCase : testCases) {
			test.setCoordinates(testCase[0], testCase[1], testCase[2], testCase[3]);
			System.out.println(test);
		}	
		

		
	}
}