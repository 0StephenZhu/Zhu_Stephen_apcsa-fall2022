//(c) A+ Computer Science
// www.apluscompsci.com
//Name -  

import java.util.Scanner;
import java.math.*;

import static java.lang.System.*;

public class RockPaperScissors
{
	private String playChoice;
	private String compChoice;

	public RockPaperScissors()
	{
		this("");
	}

	public RockPaperScissors(String player)
	{
		setPlayers(player);
	}

	public void setPlayers(String player)
	{
		playChoice = player;
	}
	
	public void randomCompChoice() {
		switch((int)(Math.random() * 3)) {
			case 0: compChoice = "R"; break;
			case 1: compChoice = "P"; break;
			case 2: compChoice = "S"; break;
		}
	}

	public String determineWinner()
	{
		randomCompChoice();
		if (playChoice.equals(compChoice)) {
			return "Draw Game";
		}
		
		if (compChoice.equals("R")) {
			if (playChoice.equals("P")) {
				return "Player wins <<Paper Covers Rock>>";
			}
			else {
				return "Computer wins <<Rock Breaks Scissors>>";
			}
		}
		else if (compChoice.equals("P")) {
			if (playChoice.equals("R")) {
				return "Computer wins <<Paper Covers Rock>>";
			}
			else {
				return "Player wins <<Scissors Cuts Paper>>";
			}
		}
		else {
			if (playChoice.equals("R")) {
				return "Player wins <<Rock Breaks Scissors>>";
			}
			else {
				return "Computer wins <<Scissors Cuts Paper>>";
			}
		}
	}

	public String toString()
	{
		String returnString = determineWinner() + "!\n";
		return "player had " + playChoice + "\ncomputer had " + compChoice + "\n!" + returnString;
	}
}