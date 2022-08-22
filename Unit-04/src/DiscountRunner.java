//(c) A+ Computer Science
//www.apluscompsci.com

//Name - 
//Date -
//Class -
//Lab  -

import static java.lang.System.*;

import java.util.Scanner;

public class DiscountRunner
{
	public static void main( String args[] )
	{
		Scanner keyboard = new Scanner(System.in);
		
		out.print("Enter the original bill amount :: ");
		double amt = keyboard.nextDouble();
		System.out.println("Bill after discount :: " + String.format("%.2f", Discount.getDiscountedBill(amt)) + "\n");
		
		double testCases[] = {
			500,
			2500,
			4000,
			333.333,
			95874.2154
		};
		
		for (double test : testCases) {
			System.out.println("Original bill amount :: " + test);
			System.out.println("Bill after discount :: " + String.format("%.2f", Discount.getDiscountedBill(test)) + "\n");

		}

	}
}