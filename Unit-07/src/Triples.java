//(c) A+ Computer Science
// www.apluscompsci.com
//Name -  

import static java.lang.System.*;

public class Triples
{
   private int number;

	public Triples()
	{
		this(0);
	}

	public Triples(int num)
	{
		setNum(num);
	}

	public void setNum(int num)
	{
		number = num;
	}
	
	private int greatestCommonFactor(int a, int b, int c)
	{
		int max = 1;
		
		for (int i = 2; i < c; i++) {
			int tempCount = 0;
			if (a % i == 0) {
				tempCount++;
			}
			if (b % i == 0) {
				tempCount++;
			}
			if (c % i == 0) {
				tempCount++;
			}
			
			if (tempCount >= 2) {
				max = i;
			}
		}

		return max;
	}

	public String toString()
	{
		String output="";
		
		int[][] triples;
				
		for (int c = 1; c <= number; c += 2) {
			for (int b = 1; b < c; b++) {
				for (int a = (b % 2) + 1; a < b; a += 2) {
					if (greatestCommonFactor(a, b, c) == 1 && a*a + b*b == c*c) {
						output += a + " " + b + " " + c + "\n";
					}
				}
			}
		}

		return output+"\n";
	}
}