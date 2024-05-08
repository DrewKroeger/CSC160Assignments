
//this is the car superclass, it keeps a price/cost for any car- used or new
public class Car 
{
	private double price;
	//*************************************
	
	//this is the superclass car constructor- it takes a cost spent on the car and gives a price(twice the cost)- this will be used in the subclass constructors also
	
	public Car(double cost) 
	{
			price = cost * 2;
	}//end of constructor
	
	//*************************************
	
	//this is the getPrice method- we want to keep the price variable private- so we use this instead when we need to use the price
	
	public double getPrice()
	{
		return this.price;
	}//end of getPrice method

}//end of of car class
