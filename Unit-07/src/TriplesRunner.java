//(c) A+ Computer Science
// www.apluscompsci.com
//Name -  

import static java.lang.System.*;

public class TriplesRunner
{
   public static void main(String args[])
   {
	   
	   int[] testCases = {
			  110
	   };
	   
	   
	   Triples temp = new Triples();
	   for (int test : testCases) {
		   temp.setNum(test);
		   System.out.println(temp);
	   }
	   
	}
}