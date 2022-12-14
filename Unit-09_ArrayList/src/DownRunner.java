import java.util.Arrays;

//(c) A+ Computer Science
//www.apluscompsci.com
//Name -
//Date -

public class DownRunner
{
	public static void main( String args[] )
	{						
		
		Integer[][] testCases = {
			{-99,1,2,3,4,5,6,7,8,9,10,12345},
			{10,9,8,7,6,5,4,3,2,1,-99},
			{10,20,30,40,50,-11818,40,30,20,10},
			{32767},
			{255,255},
			{9,10,-88,100,-555,1000},
			{10,10,10,11,456},
			{-111,1,2,3,9,11,20,30},
			{9,8,7,6,5,4,3,2,0,-2,-989},
			{12,15,18,21,23,1000},
			{250,19,17,15,13,11,10,9,6,3,2,1,-455},
			{9,10,-8,10000,-5000,1000}
		};
		
		boolean[] checkCases = {
			false,
			true,
			false,
			true,
			false,
			false,
			false,
			false,
			true,
			false,
			true,
			false
		};
		
		for (int i = 0; i < testCases.length; i++) {
			System.out.println(ListDown.go(Arrays.asList(testCases[i])));
		}
		
		for (int i = 0; i < testCases.length; i++) {
			assert (ListDown.go(Arrays.asList(testCases[i])) == checkCases[i]) : "Test case " + (i + 1) + " failed";
		}
		System.out.println("Pass!!");
	}
}