//(c) A+ Computer Science
//www.apluscompsci.com
//Name -

import java.util.Scanner;
import java.util.List;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import static java.lang.System.*;

public class ToyStore
{
	private ArrayList<Toy> toyList;

	public ToyStore()
	{
		this("");
	}
	
	public ToyStore(String toys) {
		loadToys(toys);
	}

	public void loadToys( String toys )
	{
		String[] temp = toys.split(" ");
		toyList = new ArrayList<Toy>();
		for (int i = 0; i < temp.length; i++) {
			Toy tempToy = getThatToy(temp[i]);
			if (tempToy == null) {
				toyList.add(new Toy(temp[i]));
			}
			else {
				tempToy.setCount(tempToy.getCount() + 1);
			}
		}
	}
  
  	public Toy getThatToy( String nm )
  	{
  		for (int i = 0; i < toyList.size(); i++) {
  			if (toyList.get(i).getName().equals(nm))
  				return toyList.get(i);
  		}
  		return null;
  	}
  
  	public String getMostFrequentToy()
  	{
  		String mostFrequent = "";
  		int currMax = -1;
  		for (Toy t : toyList) {
  			if (t.getCount() > currMax) {
  				mostFrequent = t.getName();
  				currMax = t.getCount();
  			}
  		}
  		return mostFrequent;
  	}  
  
  	public void sortToysByCount()
  	{
  		for (int i = 0; i < toyList.size(); i++) {
  			Toy maxToy = toyList.get(i);
  			int originalIndex = i;
  			for (int j = i; j < toyList.size(); j++) {
  				if (maxToy.getCount() < toyList.get(j).getCount()) {
  					maxToy = toyList.get(j);
  					originalIndex = j;
  				}
  			}
  			
  			
  			Toy temp = toyList.get(i);
  			toyList.set(i, maxToy);
  			toyList.set(originalIndex, temp);
  		}
  	}  
  	  
	public String toString()
	{
		String returnString = "";
		returnString += Arrays.toString(toyList.toArray()) + "\nmax == " + getMostFrequentToy() + "\n";
		sortToysByCount();
		returnString += Arrays.toString(toyList.toArray());
	   return returnString;
	}
}