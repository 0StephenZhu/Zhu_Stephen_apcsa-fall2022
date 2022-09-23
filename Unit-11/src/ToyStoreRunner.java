//(c) A+ Computer Science
//www.apluscompsci.com
//Name -

import java.util.Scanner;
import java.util.ArrayList;
import java.util.Collections;
import static java.lang.System.*;

public class ToyStoreRunner {
	public static void main( String args[] )
	{
		String[] testCases = {
			"sorry bat sorry sorry sorry train train teddy teddy ball ball",
			"card card card card deck deck card deck deck card tree tree car tree deck"
		};
		
		ToyStore temp = new ToyStore();
		
		for (String test : testCases) {
			temp.loadToys(test);
			System.out.println(temp);
		}
		
		
	}
}