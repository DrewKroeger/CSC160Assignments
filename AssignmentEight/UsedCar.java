//this is a subclass of the car class
public class UsedCar extends Car
{
	private int mileage;
	//******************************************
	
	//this is a constructor for the usedCar object
		
	public UsedCar(double cost,int mileage) 
	{
		super(cost);
		this.mileage= mileage;
	}//end of constructor
	
	//*********************************************
	
	//this is an overridden equals method for the usedCar objects 
		
	public boolean equals(UsedCar otherCar) 
	{
		
		if(mileage == otherCar.mileage && getPrice() == otherCar.getPrice()) 
		{
			return true;
		}
		else 
		{
			return false;
		}
	}//end of method equals
	
	//********************************************
	
	//this is the toString method, it makes sure the object variables are returned as a string and are readable
	
	public String toString() 
	{
		String temp;
		return temp = "price=$" + getPrice() + ",mileage=" + mileage;
	}//end of method
}//end of class
