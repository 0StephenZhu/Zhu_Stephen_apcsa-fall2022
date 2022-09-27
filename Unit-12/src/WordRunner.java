//(c) A+ Computer Science
//www.apluscompsci.com
//Name -

import java.io.File; 
import java.io.IOException;
import java.util.Scanner;
import java.util.Arrays;
import static java.lang.System.*;

public class WordRunner
{
	public static void main( String args[] ) throws IOException
	{
		//words.dat
		Scanner file = new Scanner(new File("C:\\Users\\zhus1953\\Desktop\\APCSA-StephenZ\\Zhu_Stephen_apcsa-fall2022\\Unit-12\\src\\words.dat"));

		int size = Integer.parseInt(file.nextLine());
		Word[] words = new Word[size];
		
		while (size > 0) {
			size--;
			String s = file.nextLine();
			Word temp = new Word(s);
			words[size] = temp;
		}
		
		Arrays.sort(words);
		
		for (Word s : words) {
			out.println(s);
		}
		

	}
}















