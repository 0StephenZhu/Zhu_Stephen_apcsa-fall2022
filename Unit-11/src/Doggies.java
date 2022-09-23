//(c) A+ Computer Science
//www.apluscompsci.com
//Name -

import java.util.Arrays;

public class Doggies
{
	private Dog[] pups;

	public Doggies(int size)
	{
		//point pups at a new arry of Dog
		pups = new Dog[size];
	}
	
	public void set(int spot, int age, String name)
	{
		//put a new Dog in the array at spot 
		//make sure spot is in bounds	
		if (spot < 0 || spot >= pups.length) {
			//Do nothing
		}
		else {
			pups[spot] = new Dog(age, name);
		}
	}

	public String getNameOfOldest()
	{
		if (pups.length == 0) {
			return "No Dogs!";
		}
		else {
			Dog oldestDog = pups[0];
			for (int i = 1; i < pups.length; i++) {
				if (oldestDog.getAge() < pups[i].getAge()) 
					oldestDog = pups[i];
			}
			return oldestDog.getName();
		}
	}

	public String getNameOfYoungest()
	{
		if (pups.length == 0) {
			return "No Dogs!";
		}
		else {
			Dog youngestDog = pups[0];
			for (int i = 1; i < pups.length; i++) {
				if (youngestDog.getAge() > pups[i].getAge()) 
					youngestDog = pups[i];
			}
			return youngestDog.getName();
		}
	}

	public String toString()
	{
		return ""+Arrays.toString(pups);
	}
}