//(c) A+ Computer Science
//www.apluscompsci.com
//Name -

import static java.lang.System.*;

public class TriangleFive
{
   private char letter;
   private int amount;

	public TriangleFive()
	{
		this(' ', 0);
	}

	public TriangleFive(char c, int amt)
	{
		setLetter(c);
		setAmount(amt);
	}

	public void setLetter(char c)
	{
		letter = c;
	}

	public void setAmount(int amt)
	{
		amount = amt;
	}

	public String toString()
	{
		String output="";
		
		char[] alphabet = {'A', 'B', 'C', 'D', 'E', 'F', 'G', 'H', 'I', 'J', 'K', 'L', 'M', 'N', 'O', 'P', 
						   'Q', 'R', 'S', 'T', 'U', 'V', 'W', 'X', 'Y', 'Z'};
		
		for (int i = amount; i > 0; i--) {
			int currIndex = letter - 'A';
			int currPrint = amount;
			for (int j = i; j > 0; j--) {
				for (int k = 0; k < currPrint; k++) {
					output += alphabet[currIndex % 26];
				}
				output += " ";
				currIndex++;
				currPrint--;
			}
			output += "\n";
		}
		
		return output;
	}
}