import java.util.Scanner;

//this class is a subclass of salaried, which is a subclass of employee
public class SalariedPlusComission extends Salaried
{
	protected int weekSales;
	protected double commissionRate;
	
	//***************************************
	
	//this method takes the employee method of load, and the salaried version of load, and adds on to them, asking about more instance variables
	public void load() 
	{
		Scanner stdIn = new Scanner(System.in);
		super.load();
		System.out.println("weekly sales ");
		this.weekSales = stdIn.nextInt();
		System.out.println("weekly commission rate ");
		this.commissionRate = stdIn.nextInt();
		
	}
	//****************************************
	
	//this takes certain instance variables to create a earnings variable, which is returned
	
	public Double getEarnings() 
	{
		double earnings = weeklySalary + (weekSales * commissionRate);
		
		if (getBonus() == true) //if their birthday is this week they get +$100
		{
			earnings = earnings + BONUS;
		}
		
		if (earnings > MAX_PAYCHECK) //if their earnings are over $1000 then the earnings go back down to $1000
		{
			earnings = MAX_PAYCHECK;
		}
		
		return earnings;
	}//end of getEarnings
}//end of Salaried+commission class
