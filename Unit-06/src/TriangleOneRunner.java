//(c) A+ Computer Science
//www.apluscompsci.com
//Name

import static java.lang.System.*;

public class TriangleOneRunner
{
	public static void main ( String[] args )
	{
		//add test cases	
		
		String[] testCases = {
			"hippo",
			"abcd",
			"it",
			"a",
			"chicken"
		};
		
		TriangleOne temp = new TriangleOne();
		for (String test : testCases) {
			temp.setWord(test);
			System.out.println(temp + "\n");
		}
	}
}