//(c) A+ Computer Science
//www.apluscompsci.com

//Name -
//Date -
//Class -
//Lab  - 

import static java.lang.System.*;

public class StringEqualityRunner
{
	public static void main( String args[] )
	{

		String[][] testCases = {
			{"hello", "goodbye"},
			{"one", "two"},
			{"three", "four"},
			{"TCEA", "UIL"},
			{"State", "Champions"},
			{"ABC", "ABC"},
			{"ABC", "CBA"},
			{"Same", "Same"}
		};
		
		StringEquality temp = new StringEquality();
		
		for (String[] test : testCases) {
			temp.setWords(test[0], test[1]);
			System.out.println(temp);
		}
	}
}