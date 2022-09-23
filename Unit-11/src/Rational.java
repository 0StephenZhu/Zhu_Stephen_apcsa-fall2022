//(c) A+ Computer Science
//www.apluscompsci.com
//Name -

import static java.lang.System.*; 

class Rational implements Comparable<Rational>
{
	//add two instance variables
	private int numerator;
	private int denominator;
	
	//write two constructors

	public Rational() {
		this(1, 1);
	}
	
	public Rational(int num, int den) {
		setRational(num, den);
	}

	//write a setRational method
	
	public void setRational(int num, int den) {
		setNumerator(num);
		setDenominator(den);
	}

	//write  a set method for numerator and denominator
	
	public void setNumerator(int num) {
		numerator = num;
	}
	
	public void setDenominator(int den) {
		denominator = den;
	}
	
	public int getNumerator() {
		return numerator;
	}
	
	public int getDenominator() {
		return denominator;
	}

	
	public void add(Rational other)
	{
		//num1/den1 + num2/den2 
		//new numerator = (num1 * den2 + num2 * den1)
		//new denominator = (den1 * den2)
		
		int num1 = numerator;
		int num2 = other.getNumerator();
		int den1 = denominator;
		int den2 = other.getDenominator();
		
		numerator = num1 * den2 + num2 * den1;
		denominator = den1 * den2;

		reduce();
	}

	private void reduce()
	{
		int gcdVal = gcd(numerator, denominator);
		numerator /= gcdVal;
		denominator /= gcdVal;
	}

	private int gcd(int numOne, int numTwo)
	{
		if (numOne == 0) {
			return numTwo;
		}
		if (numTwo == 0) {
			return numTwo;
		}
		
		return gcd(Math.max(numOne, numTwo) % Math.min(numOne, numTwo), Math.min(numOne, numTwo));
	}

	public Rational clone()
	{
		Rational temp = new Rational(numerator, denominator);
		return temp;
	}
	
	
	public boolean equals( Object obj)
	{
		if (obj.getClass().getSimpleName() != "Rational") {
			return false;
		}
		else if (compareTo((Rational)obj) == 0) {
			return true;
		}
		
		return false;
	}

	public int compareTo(Rational other)
	{
		int num1 = numerator;
		int num2 = other.getNumerator();
		int den1 = denominator;
		int den2 = other.getDenominator();
		
		int testVal = num1 * den2 - num2 * den1;
		if (testVal > 0) {
			return 1;
		}
		else if (testVal == 0) {
			return 0;
		}
		return -1;
	}

	public String toString() {
		String returnString = "";
		reduce();
		returnString += "Rational Number: " + Integer.toString(numerator) + "/" + Integer.toString(denominator);
		return returnString;
	}
	
	
}