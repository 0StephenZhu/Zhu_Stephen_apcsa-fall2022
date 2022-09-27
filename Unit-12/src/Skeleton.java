//(c) A+ Computer Science
//www.apluscompsci.com
//Name -

import static java.lang.System.*; 

public class Skeleton implements Monster
{
	//add instance variables	

	private String name;
	private int size;

	//add a constructor

	public Skeleton() {
		this("", 0);
	}
	
	public Skeleton(String nm, int sz) {
		setName(nm);
		setSize(sz);
	}
	
	public void setName(String nm) {
		name = nm;
	}
	
	public void setSize(int sz) {
		size = sz;
	}
	
	//add code to implement the Monster interface
	
	public String getName() {
		return name;
	}
	
	public int getHowBig() {
		return size;
	}
	
	public boolean isBigger(Monster other) {
		if (size > other.getHowBig()) return true;
		return false;
	}
	
	public boolean isSmaller(Monster other) {
		if (size < other.getHowBig()) return true;
		return false;
	}
	
	public boolean namesTheSame(Monster other) {
		if (name.equals(other.getName())) return true;
		return false;
	}

	//add a toString
	
	
	public String toString() {
		return name + " " + size;
	}
}










