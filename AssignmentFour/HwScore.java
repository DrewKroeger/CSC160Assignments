
public class HwScore 
{
	private double earnedPoints, possiblePoints;
	final static private double A = .9, B = .8, C = .7, D = .6; //the letter variables are static because the printOverallGrade method is also static, and does not work if they are not static, we could make both non static, but then any object can call the printOverallGrade method
	private static double totalEarnedPoints = 0 , totalPossiblePoints = 0; // these are static variables- they are used by each HwScore object
	
	
	
	/***********************************************************/
	
	// this is the HwScore constructor, it takes two double variables as inputs for each object
	public HwScore(double earnedPoints,double possiblePoints) 
	{
		this.earnedPoints = earnedPoints;
		this.possiblePoints = possiblePoints;
		totalEarnedPoints = this.earnedPoints + totalEarnedPoints;
		totalPossiblePoints = this.possiblePoints + totalPossiblePoints;
		
	}//end  HwScore constructor
	
	/*****************************************************/
	
	//this is the printGrade Method, it takes the earned points and possible points variables and divides the two to, it then compares that result to the letter instance variables to get the individual hw grade
	
	
	public void printGrade() 
	{
		double Grade = this.earnedPoints / this.possiblePoints;
		char charGrade = 'z';
		if (Grade>=A) 
		{
			charGrade = 'A';
		}
		else if (Grade>=B) 
		{
			charGrade = 'B';
		}
		else if (Grade>=C) 
		{
			charGrade = 'C';
		}
		else if (Grade>=D) 
		{
			charGrade = 'D';
		}
		else if (Grade>=0) 
		{
			charGrade = 'F';
		}
		System.out.println("On this homework, you earned " +  this.earnedPoints + " out of " + this.possiblePoints + " possible points: " + charGrade);
	}// end printGrade method
	
	
	/***********************************************************/
	
	////this is the printOverallGrade Method, it takes the total earned points and  total possible points variables and divides the two to, it then compares that result to the letter instance variables to get the overall hw object grade
	
	public static void printOverallGrade() 
	{
		double Grade = totalEarnedPoints / totalPossiblePoints;
		char charGrade = 'z';
		if (Grade>=A) 
		{
			charGrade = 'A';
		}
		else if (Grade>=B) 
		{
			charGrade = 'B';
		}
		else if (Grade>=C) 
		{
			charGrade = 'C';
		}
		else if (Grade>=D) 
		{
			charGrade = 'D';
		}
		else if (Grade>=0) 
		{
			charGrade = 'F';
		}
		System.out.println("On all homework you earned " + totalEarnedPoints + " out of " + totalPossiblePoints + " possible points: " + charGrade );
	}//end printOverallGrade method

}// end class
