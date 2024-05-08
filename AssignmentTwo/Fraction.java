
public class Fraction // this class goes with the FractionDemo class
{
	private int numerator;   //these two instance variables are used to demonstrate the numerator and denominator in the fraction class
	private int denominator;
	
	
	
	//************************************************************************************** 
	
	//this method makes it so the when a new fraction is declared it has or needs the numerator and denominator, this constructor and the one below are the one chatgpt helped me understand
	
	public Fraction(int numerator, int denominator) 
	{
		this.numerator = numerator;
		this.denominator = denominator;
	}
	
	//*************************************************************************************
	
	// this  method makes it so the default fraction value is equal to zero (0/1 = 0)-- this part I was not so sure about initially, but I read ahead  briefly on the power point to constructors, so it does make more sense, but not completely
	
	public Fraction() 
	{
		this.numerator = 0;
		this.denominator = 1;
	}
	
	//************************************************************************************
	
	 //this method adds two fractions together, this.(variable) which is the calling object, and the otherFraction.(variable) which is the parameter object
	
	public Fraction add(Fraction otherFraction) 
	{
		int numeratorAdd = (this.numerator * otherFraction.denominator) + 	(otherFraction.numerator * this.denominator) ; // when adding fractions you need to multiply the numerators with the denominators so they add correctly, which makes this equation long
		int denominatorAdd = this.denominator * otherFraction.denominator;
		this.numerator = numeratorAdd;
		this.denominator = denominatorAdd;
		return this;
		
	}
	
	//*************************************************************************************
	
	//this does the same as the add class, but multiplies instead
	
	public Fraction multiply(Fraction otherFraction)
	{
		int numeratorMult = this.numerator * otherFraction.numerator;
		int denominatorMult = this.denominator * otherFraction.denominator;
		this.numerator = numeratorMult;
		this.denominator = denominatorMult;
		return this;
		
	}
	
	//************************************************************************************
	
	 // this method prints the numerator over the denominator
	
	public void print() 
	{
		System.out.println(this.numerator + "/" + this.denominator);
	}
	
	//***********************************************************************************
	
	//this method prints the numerator over the denominator as a double through type casting
	
	public void printAsDouble() 
	{
		System.out.println((double)(this.numerator) / (this.denominator));
	}
	
	//**********************************************************************************
	
	//these two methods getNumerator and getDenominator are getter/accessor methods. They allow the user to access the value of the private variables in the other driver(FractionDemo) class
	
	public int getNumerator() 
	{
		return this.numerator;
	}
	
	
	public int getDenominator()
	{
		return this.denominator;
	}
	
}//end class
