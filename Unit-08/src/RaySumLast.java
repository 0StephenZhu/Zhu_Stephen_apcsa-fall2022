//(c) A+ Computer Science
//www.apluscompsci.com
//Name -
//Date -

public class RaySumLast
{
	private int[] ray;
	
	public RaySumLast() {
		setRay(new int[] {});
	}
	
	public RaySumLast(int[] array) {
		setRay(array);
	}
	
	public void setRay(int[] array) {
		ray = array;
	}
	
	public static int go(int[] ray)
	{
		int sum = 0;
		boolean isSum = false;
		int lastVal = ray[ray.length - 1];
		
		for (int i = 0; i < ray.length; i++) {
			if (ray[i] > lastVal) {
				sum += ray[i];
				isSum = true;
			}
		}
		
		if (!isSum) {
			return -1;
		}
		return sum;
	}
}