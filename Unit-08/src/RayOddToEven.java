//(c) A+ Computer Science
//www.apluscompsci.com
//Name -
//Date -

public class RayOddToEven
{
	public static int go(int[] ray)
	{
		int firstOdd = 0;
		boolean noFirstOdd = true;
		int firstEven = 0;
		boolean noFirstEven = true;
		
		for (int i = 0; i < ray.length; i++) {
			if (noFirstOdd && ray[i] % 2 == 1) {
				firstOdd = i;
				noFirstOdd = false;
			}
			if (!noFirstOdd && noFirstEven && ray[i] % 2 == 0) {
				firstEven = i;
				noFirstEven = false;
				break;
			}
		}
		
		if (noFirstOdd || noFirstEven) {
			return -1;
		}
		return firstEven - firstOdd;
		
	}
}