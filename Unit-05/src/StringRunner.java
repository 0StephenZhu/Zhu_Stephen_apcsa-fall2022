//(c) A+ Computer Science
//www.apluscompsci.com

//Name -
//Date - 
//Class -
//Lab  -

import static java.lang.System.*;
import java.util.Scanner;

public class StringRunner
{
	public static void main ( String[] args )
	{
		
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Enter a word :: ");
		String nextString = sc.nextLine();
		StringOddOrEven temp = new StringOddOrEven(nextString);
		System.out.println(nextString + " is " + temp.toString() + "\n");
		
		String[] testCases = {
			"cat",
			"boot",
			"it",
			"a",
			"eleven",
			"thirteen",
			"odd",
			"even"
		};
		
		
		for (String test : testCases) {
			temp.setString(test);
			System.out.println(test + " is " + temp.toString());
		}
	}
}