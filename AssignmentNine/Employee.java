import java.util.Scanner;
import java.util.Calendar;//this imports the calendar
//***********************************************
//this is the abstract employee superclass- it is the superclass for hourly,salaried,and salaried+commission
public abstract class Employee 
{
	protected String name;
	protected String SSN;
	protected int birthMonth;
	protected int birthWeek;
	protected final double MAX_PAYCHECK= 1000;// these constants are since we cannot use magic numbers, although there are magic numbers in the if statements(in bonus method) as I did not want to make a bunch more variables for 0,7,14,21,etc
	protected final double OVERTIME_MULTIPLIER = 1.5;
	protected final double MAX_HOURS = 40;
	protected final double BONUS = 100;
	
	//****************************************************
	
	//this is the superclass load method, all other subclasses use this and then some more
	//this method asks for variables and takes the inputs
	
	public void load() 
	{
		Scanner stdIn = new Scanner(System.in);
		System.out.println("Name: ");
		this.name = stdIn.next();
		System.out.println("Social Security Number: ");
		this.SSN = stdIn.next();
		System.out.println("Birthday month(1-12): ");//this determines if bonus class returns true or false
		this.birthMonth = stdIn.nextInt();
		System.out.println("Birthday week(1-4): ");//this also determines if bonus class returns true or false
		this.birthWeek = stdIn.nextInt();	
	}
	//****************************************************
	
	//this takes the object and turns the address into the variables
	
	public String toString() 
	{
		return "Employee: " +  name + "\n" + "Social Security Number: " + SSN + "\n" + "Paycheck: $" + getEarnings(); 	
	}	
	//*************************************************
	
	//this class is abstract, the subclasses each have their own method of this
	public abstract Double getEarnings();
	
	//****************************************************
	
	//this determines if the employee gets a birthday bonus or not by matching the user input birthday to the current calendar on the computer
	
	public boolean getBonus() 
	{
		boolean bool = false;//this boolean value is not necessarily needed as the return can return true or false in the if statements, but I was having issues with that
		
		Calendar time = Calendar.getInstance();//this takes the the full time in the Gregorian calendar
		int month = time.get(Calendar.MONTH)+1;//the month January starts at 0, so +1 must be added for user input
		int day = time.get(Calendar.DATE);//day starts at 1 so we do not need a +1
		
		if(this.birthMonth == month) //if the birth month entered the same as the current month it will then check if the week is the same, although I think weeks as a whole could be compared instead of individual days
		{
			if ((day >0 && day <=7) && this.birthWeek ==1)//if the current day in the calendar lines up with the birthweek entered than we get a true
			{
				return bool = true;
			}
			if ((day >7 && day <=14) && this.birthWeek ==2) 
			{
				return bool = true;
			}
			if ((day >14 && day <=21) && this.birthWeek ==3) 
			{
				return bool = true;
			}
			if ((day >21 && day <=31) && this.birthWeek ==4) //since there are not an even 4 weeks in a month i put the rest of the days in week 4
			{
				return bool = true;
			}
			else 
			{
				return bool;
			}
		}//end of nested if statements
		
		else 
		{
			return bool;
		}//end of all if statements
		
	}//end of getBonus method
	
}//end of Employee


