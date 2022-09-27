//(c) A+ Computer Science
//www.apluscompsci.com
//Name -

import java.util.Scanner;
import static java.lang.System.*;

public class MonsterRunner
{
	public static void main( String args[] )
	{
		Scanner keyboard = new Scanner(System.in);
		
		//ask for name and size
		
		out.println("Enter 1st monster's name : ");
		String name1 = keyboard.next();
		out.println("Enter 1st monster's size : ");
		int size1 = keyboard.nextInt();
		out.println("Enter 2nd monster's name : ");
		String name2 = keyboard.next();
		out.println("Enter 2nd monster's size : ");
		int size2 = keyboard.nextInt();
		
		
		//instantiate monster one
		
		Monster monsterOne = new Skeleton(name1, size1);
		
		//instantiate monster two
		
		Monster monsterTwo = new Skeleton(name2, size2);
		
		out.println("Monster 1 - " + monsterOne);
		out.println("Monster 2 - " + monsterTwo);
		if (monsterOne.isBigger(monsterTwo)) {
			out.println("Monster one is bigger than Monster two");
		}
		else if (monsterOne.isSmaller(monsterTwo)) {
			out.println("Monster one is smaller than Monster two");
		}
		else {
			out.println("Monster one is the same size as Monster two");
		}
		
		if (monsterOne.namesTheSame(monsterTwo)) {
			out.println("Monster one has the same name as Monster two");
		}
		else {
			out.println("Monster one does not have the same name as Monster two");
		}
		
		
	}
}