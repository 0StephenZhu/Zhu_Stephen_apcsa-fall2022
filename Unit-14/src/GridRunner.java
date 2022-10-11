//(c) A+ Computer Science
//www.apluscompsci.com
//Name -

import java.io.File;
import java.io.IOException;
import java.util.Scanner;
import static java.lang.System.*;

public class GridRunner
{
	public static void main( String args[] ) throws IOException
	{
		String[][] testCasesStrings = {
			{"a", "b", "c", "7", "9", "x", "2"}
		};
		
		int[][] testCasesDimensions = {
			{20, 20},
			{10, 10}
		};
		
		Grid temp;
		for (String[] testString : testCasesStrings) {
			for (int[] testInt : testCasesDimensions) {
				temp = new Grid(testInt[0], testInt[1], testString);
				System.out.println(temp);
				System.out.println("\nMax is: " + temp.findMax(testString) + "\n\n");
			}
		}
	}
}