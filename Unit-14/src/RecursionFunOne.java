//(c) A+ Computer Science
//www.apluscompsci.com
//Name -

import static java.lang.System.*;

public class RecursionFunOne
{
	public static int countOddDigits(int num)
	{
		if (num <= 0) return 0;
		int increase = (num % 2 == 0) ? 1 : 0;

		return increase + countOddDigits(num / 10);
	}
}