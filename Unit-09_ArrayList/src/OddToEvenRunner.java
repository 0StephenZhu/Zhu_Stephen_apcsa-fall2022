import java.util.Arrays;

//(c) A+ Computer Science
//www.apluscompsci.com
//Name -
//Date -

public class OddToEvenRunner
{
	public static void main( String args[] )
	{
		Integer[][] testCases = {
			{7,1,5,3,11,5,6,7,8,9,10,12345,11},
			{11,9,8,7,6,5,4,3,2,1,-99,7},
			{10,20,30,40,5,41,31,20,11,7},
			{32767,70,4,5,6,7},
			{2,7,11,21,5,7},
			{7,255,11,255,100,3,2},
			{9,11,11,11,7,1000,3},
			{7,7,7,11,2,7,7,11,11,2},
			{2,4,6,8,8}
		};
		
		
		for (int i = 0; i < testCases.length; i++) {
			System.out.println(ListOddToEven.go(Arrays.asList(testCases[i])));
		}
		
		
	}
}