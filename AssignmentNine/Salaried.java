import java.util.Scanner;

//this is a subclass of the employee class. This class takes salaried objects
public class Salaried extends Employee
{
	protected double weeklySalary;

	//***************************************
	
	//this method takes the employee method of load and adds on to it, asking about more instance variables
	
	public void load() 
	{
		Scanner stdIn = new Scanner(System.in);
		super.load();
		System.out.println("weekly Salary ");
		this.weeklySalary = stdIn.nextDouble();
	}
	//****************************************
	
	//this takes certain instance variables to create a earnings variable, which is returned
	
	public Double getEarnings() 
	{
		double earnings = weeklySalary;
		if (getBonus() == true) //if their birthday is this week they get +$100
		{
			earnings = earnings + BONUS;
		}
		
		if (earnings> MAX_PAYCHECK) //if their earnings are over $1000 then the earnings go back down to $1000
		{
			earnings = MAX_PAYCHECK;
		}
		
		return earnings;
	}//end of getEarnings
	
	
}//end of Salaried
