//(c) A+ Computer Science
//www.apluscompsci.com
//Name -

import java.util.Arrays;
import java.util.Scanner;
import java.io.File;
import java.io.IOException;
import static java.lang.System.*;

public class NumberShifter
{
	
	//????????????????????? What is purpose of starter code ???????????????????????????????????
	
//	public static int[] makeLucky7Array( int size)
//	{
//		
//	}
//	public static void shiftEm(int[] array)
//	{
//		
//	}
	public static int[] makeLucky7Array(int[] array) {
		int indexFront = 0;
		int indexBack = array.length - 1;
		while (indexFront < indexBack) {
			while (array[indexFront] == 7 && indexFront < indexBack) {
				indexFront++;
			}
			while (array[indexBack] != 7 && indexFront < indexBack) {
				indexBack--;
			}
			int temp = array[indexFront];
			array[indexFront] = array[indexBack];
			array[indexBack] = temp;
		}
		
		return array;
	}
}