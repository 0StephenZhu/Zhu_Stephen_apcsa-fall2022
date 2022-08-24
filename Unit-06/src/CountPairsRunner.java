//(c) A+ Computer Science
//www.apluscompsci.com
//Name

import static java.lang.System.*; 

public class CountPairsRunner
{
	public static void main( String[] args )
	{
		System.out.println( CountPairs.pairCounter("test_cases") );
		//add in all of the provided test cases from the lab handout	
		
		String[] testCases = {
			"ddogccatppig",
			"dogcatpig",
			"xxyyzz",
			"a",
			"abc",
			"aabb",
			"dogcatpigaabbcc",
			"aabbccdogcatpig",
			"dogabbcccatpig",
			"aaaa",
			"AAAAAAAAA"
		};
		
		for (String test : testCases) {
			System.out.println(CountPairs.pairCounter(test));
		}
		
		
		
	}
}