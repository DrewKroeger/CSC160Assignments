
//this is a subclass of the car class
public class NewCar extends Car
{
	private String color;
	//******************************************
	
	//this is a constructor for the NewCar object
	
	public NewCar(double cost, String color) 
	{
		super(cost);
		this.color = color;
	}//end of constructor
	
	//*********************************************
	
	//this is an overridden equals method for the NewCar objects 
	
	public boolean equals(NewCar otherCar) 
	{
		if (color.equals(otherCar.color) && getPrice() == otherCar.getPrice() )//instead of comparing addresses in equals we compare the individual variables
		{
			return true;
		}
		else 
		{
			return false;
		}
	}//end of equals method
	
	//********************************************
	
	//this is the toString method, it makes sure the object variables are returned as a string and are readable
	
	public String toString() 
	{
		String temp;
		return temp= "price=$" + getPrice() + ",color=" + color;
	}//end of toString method
	
}//end of class newCar
