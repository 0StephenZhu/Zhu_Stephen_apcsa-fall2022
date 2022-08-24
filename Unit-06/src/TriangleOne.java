//(c) A+ Computer Science
//www.apluscompsci.com
//Name

import static java.lang.System.*;

public class TriangleOne
{
	private String word;

	public TriangleOne()
	{
		word="";
	}

	public TriangleOne(String s)
	{
		setWord(s);
	}

	public void setWord(String s)
	{
		word = s;
	}

	public String toString()
	{
		String returnString = "";
		
		for (int i = word.length(); i > 0; i--) {
			returnString += word.substring(0, i) + "\n";
		}
		return returnString;
	}
}