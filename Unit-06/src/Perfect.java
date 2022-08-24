//(c) A+ Computer Science
//www.apluscompsci.com
//Name -

import static java.lang.System.*;

public class Perfect
{
   private int number;

	//add constructors
   
   public Perfect() {
	   setPerfect(0);
   }
   
   public Perfect(int num) {
	   setPerfect(num);
   }

	//add a set method

   public void setPerfect(int num) {
	   number = num;
   }
   
	public boolean isPerfect()
	{
		int currSum = 0;
		
		for (int i = 1; i < number; i++) {
			if (number % i == 0) {
				currSum += i;
			}
		}
		
		return currSum == number;
	}

	//add a toString	
	
	public String toString() {
		if (isPerfect()) {
			return number + " is perfect\n";
		}
		else {
			return number + " is not perfect\n";
		}
	}
	
}