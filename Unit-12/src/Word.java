//(c) A+ Computer Science
//www.apluscompsci.com
//Name -

import static java.lang.System.*;

public class Word implements Comparable<Word>
{
	private String word;

	public Word( String s )
	{
		setWord(s);
	}
	
	public void setWord(String s) {
		word = s;
	}
	
	public String getWord() {
		return word;
	}

	@Override
	public int compareTo( Word rhs )
	{		
		if (word.length() == rhs.getWord().length()) {
			return word.compareTo(rhs.getWord());
		}
		return (word.length() > rhs.getWord().length()) ? 1 : -1;
	}

	public String toString()
	{
		return word;
	}
}