//(c) A+ Computer Science
//www.apluscompsci.com
//Name -

import java.math.*;

public class Grid
{
   private String[][] grid;

   //load vals into the rows x cols grid randomly
	public Grid(int rows, int cols, String[] vals)
	{
		grid = new String[rows][cols];
		for (int i = 0; i < rows; i++) {
			for (int j = 0; j < cols; j++) {
				int index = (int) Math.floor(Math.random() * vals.length);
				String val = vals[index];
				grid[i][j] = val;
			}
		}
	}

	//find out which of the vals occurs the most
	public String findMax(String[] vals)
	{
		int currMax = -1;
		String stringMax = "";
		for (String test : vals) {
			if (countVals(test) > currMax) {
				currMax = countVals(test);
				stringMax = test;
			}
		}
		return stringMax;
	}

	//returns a count of how many times val occurs in the matrix
	private int countVals( String val )
	{
		int counting = 0;
		for (int i = 0; i < grid.length; i++) {
			for (int j = 0; j < grid[i].length; j++) {
				if (grid[i][j].equals(val)) {
					counting++;
				}
			}
		}
		return counting;
	}

	//display the grid
	public String toString()
	{
		String output="";
		
		for (int i = 0; i < grid.length; i++) {
			for (int j = 0; j < grid[i].length; j++) {
				output += grid[i][j] + " ";
			}
			output += "\n";
		}
		
		return output;
	}
}