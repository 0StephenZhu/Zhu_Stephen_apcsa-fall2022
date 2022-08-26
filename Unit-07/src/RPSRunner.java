//(c) A+ Computer Science
// www.apluscompsci.com
//Name -  

import java.util.Scanner;

import static java.lang.System.*;

public class RPSRunner
{
	public static void main(String args[])
	{
		Scanner keyboard = new Scanner(System.in);
		char response;
		boolean isContinue = true;
		
		//add in a do while loop after you get the basics up and running
		
		while (isContinue) {
		
			String player = "";
		
			out.print("\ntype in your prompt [R,P,S] :: ");
			
			player = keyboard.nextLine();
			
			//read in the player value
		
			RockPaperScissors game = new RockPaperScissors(player);		
			System.out.println(game);
			
			System.out.print("Do you want to play again (y/n)? ");
			
			response = keyboard.nextLine().charAt(0);
			if (response == 'n') {
				isContinue = false;
			}
		}
	}
}



