import java.util.Scanner;

//this class deals with Hourly objects of employee type
public class Hourly extends Employee
{
	private double hourlyPay;
	private double hoursWorked;
	
	//***************************************
	
	//this method takes the employee method of load and adds on to it, asking about more instance variables
	public void load() 
	{
		super.load();//this part goes to the employee method of load
		Scanner stdIn = new Scanner(System.in);
		System.out.println("Hourly Pay: ");
		this.hourlyPay = stdIn.nextDouble();
		System.out.println("Hours Worked: ");
		this.hoursWorked = stdIn.nextDouble();
	}

	//****************************************
	
	//this takes certain instance variables to create a earnings variable, which is returned
	
	public Double getEarnings() 
	{
		double overPay = 0.0;
		double earnings = hoursWorked * hourlyPay;//in this method earnings is hours* hourly pay
		if (hoursWorked > MAX_HOURS) //if hours worked is over 40 hours they get time and a half for each hour over that
		{
			double overTimeHours = (hoursWorked - MAX_HOURS);
			overPay = overTimeHours * (hourlyPay * OVERTIME_MULTIPLIER); 
			earnings = earnings + overPay;
		}//end of if
		
		if (getBonus() == true) //if their birthday is this week they get +$100
		{
			earnings = earnings + BONUS;
		}//end of if
		
		 if (earnings > MAX_PAYCHECK) //if their earnings are over $1000 then the earnings go back down to $1000
			{
				earnings =  MAX_PAYCHECK;
			}
		return earnings;
	}//end of getEarnings method
}//end of Hourly class
