//(c) A+ Computer Science
//www.apluscompsci.com
//Name -
//Date -

public class RayDown
{
	//go() will return true if all numbers in numArray
	//are in decreasing order [31,12,6,2,1]
	
	private int[] ray;
	
	public RayDown() {
		setRay(new int[] {});
	}
	
	public RayDown(int[] array) {
		setRay(array);
	}
	
	public void setRay(int[] array) {
		ray = array;
	}
	
	public static boolean go(int[] numArray)
	{
		for (int i = 0; i < numArray.length - 1; i++) {
			if (numArray[i] <= numArray[i + 1]) {
				return false;
			}
		}
		return true;
	}	
}