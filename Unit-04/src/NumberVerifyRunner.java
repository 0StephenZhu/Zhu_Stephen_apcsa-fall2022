//(c) A+ Computer Science
//www.apluscompsci.com

//Name -
//Date - 
//Class -
//Lab  -

import static java.lang.System.*;

import java.util.Scanner;

public class NumberVerifyRunner
{
	public static void main ( String[] args )
	{
		
		Scanner sc = new Scanner(System.in);
		
		System.out.print("Enter a whole number :: ");
		int userInput = sc.nextInt();
		
		System.out.println(userInput + " is odd :: " + NumberVerify.isOdd(userInput));
		System.out.println(userInput + " is even :: " + NumberVerify.isEven(userInput) + "\n");
		
		//add in more test cases
		
		
		int[] testCases = {
			5,
			111,
			2000,
			-99,
			1111,
			-850
		};
		
		for (int test : testCases) {
			System.out.println(test + " is odd :: " + NumberVerify.isOdd(test));
			System.out.println(test + " is even :: " + NumberVerify.isEven(test) + "\n");
		}
		
	}
}