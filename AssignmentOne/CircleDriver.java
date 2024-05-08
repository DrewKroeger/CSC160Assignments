/*************************************
 * CSC160
 * Assignment 1-Drew Kroeger
 * This is the driver for the circle class
 * I did not use any outside resources
 *************************************/
//this is the driver for the circle class, which gives the diameter,circumference, and area for a circle based on the radius/input

public class CircleDriver 
{

	public static void main(String[] args) 
	{
	
	Circle circle;
	circle = new Circle();
	
	circle.initialize();
	circle.printCircleData();
	circle.setRadius(5);
	circle.printCircleData();
	
	}//end main
	
}//end Class CircleDriver
