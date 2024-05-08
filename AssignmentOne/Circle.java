import java.util.Scanner;

public class Circle                //this class goes with the CircleDriver class
{
	private int radius;            //this is the radius of the circle, it is an instance variable. It is the only variable that is input
	
	
	/*********************************************************/
	
	//This method allows the user to change the radius in the driver method without having to use the prompt(pass in)
	
	public void setRadius(int radius) 
	{
		 this.radius = radius;
	}
	
	/***********************************************************/
	
	//this method prompts the user for a radius value in the terminal/console
	
	public int initialize() 
	{
		Scanner stdIn = new Scanner(System.in);      //want this to be a local variable and not an instance variable because if it is instance variable you could do x.stdIn() and that would be bad 
		System.out.println("Please enter a radius value: ");
		radius = stdIn.nextInt();
		return radius;
	}
	
	/***********************************************************/
	
	//this method does the math and prints the diameter,circumference, and area of a circle based on what the radius input was.
	public void printCircleData() 
	{
		double diameter = radius * 2;
		double circumference = 2 * Math.PI * radius;
		double area = Math.PI * Math.pow(radius, 2);
		
		System.out.println("Radius = " + radius);
		System.out.println("Diameter = " + diameter);
		System.out.println("Circumference = " + circumference);
		System.out.println("Area = " + area);
	}
	
}//end circle class
