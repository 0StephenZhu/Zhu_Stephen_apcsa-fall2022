//(c) A+ Computer Science
// www.apluscompsci.com
//Name -  

import static java.lang.System.*;

public class BiggestDouble
{
	private double one,two,three,four;

	public BiggestDouble()
	{
		this(0,0,0,0); //New trick found
	}

	public BiggestDouble(double a, double b, double c, double d)
	{
		setDoubles(a, b, c, d);
	}
	
	public double max(double first, double second) {
		if (first > second) {
			return first;
		}
		return second;
	}

	public void setDoubles(double a, double b, double c, double d)
	{
		one = a;
		two = b;
		three = c;
		four = d;
	}

	public double getBiggest()
	{
		return max(max(one, two), max(three, four));
	}

	public String toString()
	{
	   return one + " " + two + " " + three + " " + four + "\nbiggest == " + getBiggest() + "\n";
	}
}