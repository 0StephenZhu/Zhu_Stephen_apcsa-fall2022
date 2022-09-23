//(c) A+ Computer Science
//www.apluscompsci.com
//Name -

import static java.lang.System.*;

public class ToyRunner
{
	public static void main(String[] args)
	{
		String[] testCasesName = {
			"sorry",
			"gi joe",
			"bat",
			"train",
			"teddy",
			"ball"
		};
		
		int[] testCasesCount = {
			4,
			5,
			1,
			2,
			2,
			2
		};
		
		Toy temp = new Toy();
		
		for (int i = 0; i < testCasesName.length; i++) {
			temp = new Toy(testCasesName[i], testCasesCount[i]);
			System.out.println(temp);
		}
	}
}