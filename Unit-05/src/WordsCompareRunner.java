//(c) A+ Computer Science
//www.apluscompsci.com

//Name -
//Date -
//Class -
//Lab  -

import static java.lang.System.*;

public class WordsCompareRunner
{
   public static void main( String args[] )
   {
		
	   String[][] testCases = {
		   {"abe", "ape"},
		   {"giraffe", "gorilla"},
		   {"one", "two"},
		   {"fun", "funny"},
		   {"123", "19"},
		   {"193", "1910"},
		   {"goofy", "godfather"},
		   {"funnel", "fun"}
	   };
	   
	   WordsCompare temp = new WordsCompare();

	   for (String[] test : testCases) {
		   temp.setWords(test[0], test[1]);
		   System.out.println(temp);
	   }

	}
}