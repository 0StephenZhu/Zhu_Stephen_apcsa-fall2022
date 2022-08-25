//(c) A+ Computer Science
//www.apluscompsci.com
//Name -

import static java.lang.System.*;

public class LetterRemoverRunner
{
	public static void main( String args[] )
	{
		//add test cases		
					
		String[] testCasesString = {
			"I am Sam I am   a",
			"ssssssssxssssesssssesss",
			"qwertyqwertyqwerty",
			"abababababa",
			"abaababababa",
		};
		
		char[] testCasesChar = {
			'a',
			's',
			'a',
			'b',
			'x'
		};
		
		
		LetterRemover temp = new LetterRemover();
		
		for (int i = 0; i < testCasesString.length; i++) {
			temp.setRemover(testCasesString[i], testCasesChar[i]);
			System.out.println(temp);
		}
	}
}