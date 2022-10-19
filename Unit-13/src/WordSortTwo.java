//(c) A+ Computer Science
//www.apluscompsci.com
//Name -

import java.util.Arrays;
import java.util.Scanner;
import static java.lang.System.*;

public class WordSortTwo
{
	private String[] wordRay;

	public WordSortTwo(String sentence)
	{
		wordRay = sentence.split(" ");
	}

	public void sort()
	{
		for (int i = 0; i < wordRay.length; i++) {
			int leastIndex = i;
			for (int j = i + 1; j < wordRay.length; j++) {
				if (wordRay[leastIndex].compareTo(wordRay[j]) > 0) {
					leastIndex = j;
				}
			}
			String temp = wordRay[i];
			wordRay[i] = wordRay[leastIndex];
			wordRay[leastIndex] = temp;
		}
	}

	public String toString()
	{
		String output="";
		sort();
		for (String word : wordRay) {
			output += word + "\n";
		}
		return output+"\n\n";
	}
}