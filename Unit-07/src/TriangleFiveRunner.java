//(c) A+ Computer Science
//www.apluscompsci.com
//Name -

import static java.lang.System.*;

public class TriangleFiveRunner
{
   public static void main(String args[])
   {
	   
	   char[] testCasesChar = {
		   'C',
		   'A',
		   'B',
		   'X',
		   'Z'
	   };
	   
	   int[] testCasesInt = {
			  4,
			  5,
			  7,
			  6,
			  8
	   };
	   
	   
	   TriangleFive temp = new TriangleFive();
	   
	   for (int i = 0; i < testCasesChar.length; i++) {
		   temp.setLetter(testCasesChar[i]);
		   temp.setAmount(testCasesInt[i]);
		   
		   System.out.println(temp);
	   }
	   
	}
}