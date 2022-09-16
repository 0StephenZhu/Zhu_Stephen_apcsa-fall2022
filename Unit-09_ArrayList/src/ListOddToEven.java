//(c) A+ Computer Science
//www.apluscompsci.com
//Name -
//Date -

import java.util.ArrayList;
import java.util.List;

public class ListOddToEven
{
	public static int go( List<Integer> ray )
	{
		int firstOdd = 0;
		boolean check = false;
		int lastEven = 0;
		boolean hasEven = false;
		
		for (int i = 0; i < ray.size(); i++) {
			if (!check && ray.get(i) % 2 == 1) {
				firstOdd = i;
				check = true;
			}
			if (check && ray.get(i) % 2 == 0) {
				lastEven = i;
				hasEven = true;
			}
		}
		
		if (check && hasEven) {
			return lastEven - firstOdd;
		}
		return -1;
	}
}