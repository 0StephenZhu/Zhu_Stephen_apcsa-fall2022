//(c) A+ Computer Science
//www.apluscompsci.com
//Name -

import java.util.*;
import java.io.*; 

public class WordSearch
{
    private char[][] m;

    public WordSearch( int size, String str )
    {
    	m = new char[size][size];
    	int index = 0;
    	for (int i = 0; i < size; i++) {
    		for (int j = 0; j < size; j++) {
    			m[i][j] = str.charAt(index);
    			index++;
    		}
    	}
    }

    public boolean isFound( String word )
    {
    	for (int i = 0; i < m.length; i++) {
    		for (int j = 0; j < m[i].length; j++) {
    			if (checkRight(word, i, j) || checkLeft(word, i, j) || checkUp(word, i, j) || checkDown(word, i, j) || checkDiagUpRight(word, i, j) 
    					|| checkDiagUpLeft(word, i, j) || checkDiagDownLeft(word, i, j) || checkDiagDownRight(word, i, j)) {
    				return true;
    			}
    				
    		}
    	}
    	return false;
    }

	public boolean checkRight(String w, int r, int c)
   {
		String checkString = "";
		while (c < m[r].length && checkString.length() < w.length()) {
			checkString += m[r][c];
			c++;
		}
		return checkString.equals(w);
	}

	public boolean checkLeft(String w, int r, int c)
	{
		String checkString = "";
		while (c >= 0 && checkString.length() < w.length()) {
			checkString += m[r][c];
			c--;
		}
		return checkString.equals(w);
	}

	public boolean checkUp(String w, int r, int c)
	{
		String checkString = "";
		while (r >= 0 && checkString.length() < w.length()) {
			checkString += m[r][c];
			r--;
		}
		return checkString.equals(w);
	}

	public boolean checkDown(String w, int r, int c)
   {
		String checkString = "";
		while (r < m.length && checkString.length() < w.length()) {
			checkString += m[r][c];
			r++;
		}
		return checkString.equals(w);
	}

	public boolean checkDiagUpRight(String w, int r, int c)
	{
		String checkString = "";
		while (r >= 0 && c < m[r].length && checkString.length() < w.length()) {
			checkString += m[r][c];
			r--;
			c++;
		}
		return checkString.equals(w);
	}

	public boolean checkDiagUpLeft(String w, int r, int c)
	{
		String checkString = "";
		while (r >= 0 && c >= 0 && checkString.length() < w.length()) {
			checkString += m[r][c];
			r--;
			c--;
		}
		return checkString.equals(w);
	}

	public boolean checkDiagDownLeft(String w, int r, int c)
   {
		String checkString = "";
		while (r < m.length && c >= 0 && checkString.length() < w.length()) {
			checkString += m[r][c];
			r++;
			c--;
		}
		return checkString.equals(w);
	}

	public boolean checkDiagDownRight(String w, int r, int c)
	{
		String checkString = "";
		while (r < m.length && c < m[r].length && checkString.length() < w.length()) {
			checkString += m[r][c];
			r++;
			c++;
		}
		return checkString.equals(w);
	}

    public String toString()
    {
    	String returnString = "";
    	for (int i = 0; i < m.length; i++) {
    		for (int j = 0; j < m[i].length; j++) {
    			returnString += m[i][j] + " ";
    		}
    		returnString += "\n";
    	}
 		return returnString;
    }
}
