//(c) A+ Computer Science
//www.apluscompsci.com
//Name -
//Date -

public class RayOddToEven
{
	
	private int[] ray;
	
	public RayOddToEven() {
		setRay(new int[] {});
	}
	
	public RayOddToEven(int[] array) {
		setRay(array);
	}
	
	public void setRay(int[] array) {
		ray = array;
	}
	
	
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