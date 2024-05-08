/*
 * Drew Kroeger - CSC 160
 * Assignment 8
 * I did not use any outside resources for this assignment
 */

//this is the car driver class- it takes the car super class and newcar and usedcar subclasses.

public class CarDriver 
{

	public static void main(String[] args) 
	{
		NewCar new1 = new NewCar(8000.33, "silver");
		 NewCar new2 = new NewCar(8000.33, "silver");
		 
		 if (new1.equals(new2))//the equals method is overridden in the newcar class
		 {
		 System.out.println(new1);
		 }
		 
		 UsedCar used1 = new UsedCar(2500, 100000);
		 UsedCar used2 = new UsedCar(2500, 100000);
		 
		 if (used1.equals(used2))//the equals method is overridden in the usedCar class
		 {
		 System.out.println(used1);
		 }

	}//end of main method

}//end of driver
