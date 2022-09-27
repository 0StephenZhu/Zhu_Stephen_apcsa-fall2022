//(c) A+ Computer Science
//www.apluscompsci.com
//Name -

import static java.lang.System.*;

public class Toy implements Comparable<Toy>
{
	private String name;
	private int count;

	public Toy()
	{
		this("");
	}

	public Toy( String nm )
	{
		this(nm, 1);
	}
	
	public Toy(String nm, int cnt) {
		setName(nm);
		setCount(cnt);
	}
	
	public int getCount()
	{
		return count;
	}
	
	public void setCount( int cnt )
	{
		count = cnt;
	}
	
	public String getName()
	{
		return name;
	}
	
	public void setName( String nm )
	{
		name = nm;
	}
	
	public int compareTo( Toy rhs) {
		if (count == rhs.getCount()) {
			return name.compareTo(rhs.getName());
		}
		return (count > rhs.getCount()) ? -1 : 1;
	}

	public String toString()
	{
	   return name + " " + Integer.toString(count);
	}
}