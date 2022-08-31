//(c) A+ Computer Science
//www.apluscompsci.com
//Name -

import static java.lang.System.*;

public class LetterRemover
{
   private String sentence;
   private char lookFor;

	public LetterRemover()
	{
		setRemover("", ' ');
	}

	//add in second constructor
	
	public LetterRemover(String s, char rem) {
		setRemover(s, rem);
	}
	
	
	public void setRemover(String s, char rem)
	{
		sentence = s;
		lookFor = rem;
	}
	
	public int min(int one, int two) {
		if (one < two) {
			return one;
		}
		return two;
	}

	public String removeLetters()
	{
		String cleaned=sentence;
		
		while (cleaned.indexOf(lookFor) != -1) {
			int index = cleaned.indexOf(lookFor);
			//cleaned becomes substring 
			
			cleaned = cleaned.substring(0, index) + cleaned.substring(min(index + 1, cleaned.length()));
		}
		
		
//		EVEN FASTER METHOD!!!!		
//		String newCleaned = "";
//		
//		for (int i = 0; i > sentence.length(); i++) {
//			if (sentence.charAt(i) != lookFor) {
//				newCleaned += sentence.charAt(i);
//			}
//		}
//		
		return cleaned;
	}

	public String toString()
	{
		return sentence + " - letter to remove " + lookFor + "\n" + removeLetters();
	}
}