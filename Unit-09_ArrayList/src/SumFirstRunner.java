//(c) A+ Computer Science
//www.apluscompsci.com
//Name -
//Date -

import java.util.*;

public class SumFirstRunner
{
	public static void main( String args[] )
	{								
		Integer[][] testCases = {
			{-99,1,2,3,4,5,6,7,8,9,10,5},
			{10,9,8,7,6,5,4,3,2,1,-99},
			{10,20,30,40,50,-11818,40,30,20,10},
			{32767},
			{255,255},
			{9,10,-88,100,-555,2},
			{10,10,10,11,456},
			{-111,1,2,3,9,11,20,1},
			{9,8,7,6,5,4,3,2,0,-2,6},
			{12,15,18,21,23,1000},
			{250,19,17,15,13,11,10,9,6,3,2,1,0},
			{9,10,-8,10000,-5000,-3000}
		};
		
		
		for (int i = 0; i < testCases.length; i++) {
			System.out.println(ListSumFirst.go(Arrays.asList(testCases[i])));
		}
		
	}
}