//(c) A+ Computer Science
//www.apluscompsci.com
//Name

import static java.lang.System.*;

public class WordRunner
{
	public static void main ( String[] args )
	{
		//add test cases
		
		String[] testCases = {
			"Hello",
			"World",
			"JukeBox",
			"TCEA",
			"UIL"
		};
		
		Word temp = new Word();
		for (String test : testCases) {
			temp.setString(test);
			System.out.println(temp);
		}
	}
}