/*
 * CSC160
 * Drew Kroeger- Assignment 3
 * I did use chatGpt after I was almost done with the assignment. 
 * It had mostly similar code although the print summary method I had was much less efficient than chatGPT's(i did change it). GPT also made an object for the array
 * in the main method and had a constructor in the VC class ,whereas I used static keywords in the VC class. And it used while loop, I used do while loop(in the main).
 */

import java.util.Scanner;

public class VowelCounterDriver //this is the VowelCounterDriver class/main method, which goes with the VowelCounterClass, this class takes the user input and sends it to the VowelCounter class to be 'analyzed'.
{
	
	
	public static void main(String[]args) 
	{
		Scanner stdIn = new Scanner(System.in);
		String response;
		
		do
		{
			
		System.out.println("Enter a line of text or press enter(by itself to quit)");
		response = stdIn.nextLine();
		VowelCounter.processLine(response);//the String response is sent to the other VC class to be analyzed in this line
		
		}while(!(response.equals("")));
		
		VowelCounter.printSummary();
	}//end of main method
}//end of class
