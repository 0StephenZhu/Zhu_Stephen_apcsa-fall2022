//(c) A+ Computer Science
//www.apluscompsci.com
//Name -
//Date -

import java.util.List;
import java.util.ArrayList;

public class ListSumFirst
{
	public static int go(List<Integer> ray)
	{
		int firstNum = ray.get(0);
		int sum = 0;
		boolean hasSum = false;
		for (int i = 1; i < ray.size(); i++) {
			if (ray.get(i) > firstNum) {
				sum += ray.get(i);
				hasSum = true;
			}
		}
		if (!hasSum) {
			return -1;
		}
		return sum;
	}
}