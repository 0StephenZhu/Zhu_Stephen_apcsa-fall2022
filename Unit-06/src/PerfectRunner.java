//(c) A+ Computer Science
//www.apluscompsci.com
//Name -

import static java.lang.System.*; 

public class PerfectRunner
{
	public static void main( String args[] )
	{
		//add test cases
		
		int[] testCases = {
			496,
			45,
			6,
			14,
			8128,
			1245,
			33,
			28,
			27,
			33550336
		};
		
		Perfect temp = new Perfect();
		for (int test : testCases) {
			temp.setPerfect(test);
			System.out.println(temp);
		}
																
	}
}