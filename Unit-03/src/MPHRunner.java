//(c) A+ Computer Science
//www.apluscompsci.com

//Name -
//Date -
//Class -
//Lab  -

import java.util.Scanner; 
import static java.lang.System.*;
import static java.lang.Math.*;

public class MPHRunner
{
	public static void main( String[] args )
	{
		Scanner keyboard = new Scanner(in);

		out.print("Enter the distance :: ");
		int dist = keyboard.nextInt();

		out.print("Enter the hours :: ");
		int hrs = keyboard.nextInt();

		out.print("Enter the minutes :: ");
		int mins = keyboard.nextInt();

		MilesPerHour test = new MilesPerHour(dist, hrs, mins);
		test.calcMPH();
		
		System.out.println(test);
		
		
		//add more test cases
		
		int testCases[][] = {
				{45, 0, 32}, 
				{96, 1, 43}, 
				{100, 2, 25}, 
				{50, 2, 25}
		};
		
		for (int[] testCase : testCases) {
			test.setNums(testCase[0], testCase[1], testCase[2]);
			test.calcMPH();
			System.out.println(test);
		}
		
		
		
	}
}