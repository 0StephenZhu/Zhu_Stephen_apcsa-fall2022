//(c) A+ Computer Science
//www.apluscompsci.com
//Name -

public class TotalRowRunner
{
	public static void main( String args[] ) throws Exception
	{
		int[][][] testCases = {
			{{1,2,3},{5,5,5,5}},
			{{1,2,3},{5},{1},{2,2}},
			{{1,2},{5,5},{5,5},{4,5,6,7},{123124,12312}}
		};	
		
		for (int[][] test : testCases) {
			System.out.println("Row totals are :: " + TotalRow.getRowTotals(test));
		}
		
		
	}
}



