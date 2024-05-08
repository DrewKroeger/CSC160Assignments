/*********************************
 * CSC 160- Assignment 9
 * Drew Kroeger
 * I used stack overflow to understand the calendar tools needed in the getBonus method.
 **********************************/
//this is the driver for the Employee,Hourly,Salaried,SalariedPlusComission classes.


import java.util.Scanner;

public class Driver 
{
	/*********************************************/
	
	//this is the main in the driver
	public static void main(String[] args) 
	{
		Scanner stdIn = new Scanner(System.in);
		System.out.println("Number of Employees:");
		int numOfEmployees = stdIn.nextInt();
		Employee [] arr = new Employee[numOfEmployees];//an array is used to store employee objects
		
		
		for (int i=0;i<numOfEmployees;i++) //this for loop is to create the employee subclass objects
		{
			System.out.println("Enter 1 for Hourly, 2 for salaried, 3 for salary and commission:");//this is where the polymorphism comes in when creating different employee subclass objects
			int temp = stdIn.nextInt();
			
			System.out.println("PROFILE FOR EMPLOYEE#" + (i+1));//we want it to say employee 1, not zero, that is why we +1
			
			
			
			if(temp == 1) //when temp equals a 1,2,3 it creates a hourly,salaried,or salaried+comission object
			{
				arr [i] = new Hourly(); 
				arr[i].load(); //these load methods ask all the respective questions to fill the instance variables for that object
			}
			else if (temp == 2) {
				arr[i] = new Salaried();
				arr[i].load();
			}
			else if (temp ==3) {
				arr[i] = new SalariedPlusComission();
				arr[i].load();
			}
			else 
			{
				System.out.println("Redo the number- 1,2, or 3");// if the user does not enter 1,2,3 it cannot create a new object
			}//end of if statements
		}//end of for loop
		
		System.out.println("PAYCHECK REPORT");
		for (int i=0;i<numOfEmployees;i++) //this prints out the Name,SSN, and paycheck of the employees
		{
			  System.out.println(arr[i].toString());
			  System.out.println();
		}
	}//end of main
}//end of assignment 9(Employee paycheck) class
