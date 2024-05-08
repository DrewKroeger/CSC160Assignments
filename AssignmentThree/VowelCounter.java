
public class VowelCounter //this is the public class vowelCounter, it goes along with the VowelCounterDriver class. This class stores vowels input through a regular sentence/string from a user into a 2 dimensional array
{
	
	private static int [][] array = new int[5][2];  //array is private so only accessed by this class, static so an object is not needed to access. it is 5 by 2 so aeiou and AEIOU can have an element
	
	//*********************************************************************
	
	/*this is the process line method. It takes the response from the user as a string parameter and stores all the 
	 * uppercase and lowercase vowels into an array, each UC or LC letter has one element of the array 
	*/ 
	
	public static void processLine(String response) 
	{
		for (int i = 0; i<response.length();i++) //this for loop counts the vowels present in the response given in the main method/driver class
		{
			char charResponse = (response.charAt(i));  //this breaks down the response into individual characters
			
			if (charResponse == 'a')
			{
				array[0][0]++;
			}
			else if (charResponse == 'e')
			{
				array[1][0]++;
			}
			else if (charResponse == 'i')
			{
				array[2][0]++;
			}
			else if (charResponse == 'o')
			{
				array[3][0]++;
			}
			else if (charResponse == 'u')
			{
				array[4][0]++;
			}
			else if (charResponse == 'A')
			{
				array[0][1]++;
			}
			else if (charResponse == 'E')
			{
				array[1][1]++;
			}
			else if (charResponse == 'I')
			{
				array[2][1]++;
			}
			else if (charResponse == 'O')
			{
				array[3][1]++;
			}
			else if (charResponse == 'U')
			{
				array[4][1]++;
			}
			else 
			{
				
			}
			
			
			
		}//end of for loop
		
	}//end of method processLine
	
	//****************************************************************************
	
	//this method does a print summary, which means it takes all the previous entries in the run time and adds up all the individual vowel counts
	
	public static void printSummary() 
	{
		char[] vowels = {'A','E','I','O','U'};
		
		for(int i = 0;i<5;i++) 
		{
			int lowercaseCount = array[i][0];
			int uppercaseCount = array[i][1];
			int totalCount = lowercaseCount + uppercaseCount;
			System.out.println(vowels[i]+ ": " + lowercaseCount + " lowercase;" + uppercaseCount + " uppercase;" + totalCount + " total." );
		}
		
	}//end prinSummary method
	
}//end class
