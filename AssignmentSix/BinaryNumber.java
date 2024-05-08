/*************************
 * Drew Kroeger- CSC160
 * Assignment 6- Bitwise Operations
 * I did use ChatGPT and my dad to do this assignment, as the explanation of bitwise operators didnt make since at first. I think now though I do have an ok overview of how they work
 *************************/
import java.util.Scanner;
public class BinaryNumber 
{
	/****************************************************/
	
	//this is the main method
	
	public static void main(String[] args) 
	{
		int number = 128;//this number is the range(127--128) that can fit in a byte
		while(number>=-128) 
		{
			display(number);//this takes one bit(since we start with 128) and puts it in binary
			number = (number>0) ? number >>1: (number == 0) ? ~number : number <<1;//this takes 128/number integer and then does something to that bit depending on what the number is, it updates the number variable
		}
		
		Scanner stdIn = new Scanner(System.in);
		System.out.println("Input any integer: ");
		int response = stdIn.nextInt();
		display(response);//this takes the user input value through the display method
	}
	
	/******************************************************/
	
	//This is the display method, this method is taking in the integer number variable and making the corresponding binary number to it.
	
	public static void display(int number) 
	{
		System.out.print(number  + "\t");				    //this is printing out the decimal number and making a tab for the binary number
		int mask = 1 << 31;								    //this is the mask integer- it is a 1 left shifted 31 times(to the very left column in the binary)
		for (int i = 0;i<32;i++)  						    //this for loop checks each bit to see if it is a one or zero
		{
			System.out.print((mask & number) != 0 ? 1 : 0);//this prints out the individual 1 or 0. if mask and number dont equal zero it prints 1, otherwise it is zero
			mask >>>=1;									   //this right shifts the 1 in mask by 1 
			if (i%4==3) 								   //this prints a space every four characters
			{
				System.out.print(" ");
			}
		}
		System.out.println();                             //this prints a new line for every new decimal number
	}
}
