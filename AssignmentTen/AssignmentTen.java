/*****************************************
 * CSC160-Assignment 10
 * Drew Kroeger
 * I did not use any help for this assignment
 ******************************************/
//this class read a file and then splits every two words into pairs(aka prints two words per line)
import java.util.Scanner;
import java.nio.file.Paths;

public class AssignmentTen 
{
	public static void main(String[] args) 
	{
		String fileName;
		
		Scanner stdIn = new Scanner(System.in);
		System.out.println("Enter filename you want to access: ");//the scanner will read the filename and then look for it
		fileName = stdIn.next();
		try {
			Scanner fileScanner = new Scanner(Paths.get(fileName));//this scanner creates a path to the filename
			while(fileScanner.hasNext()) //while the scanner has another word in it(as long as the special character is not next) it will keep going
				{
				String firstWord = fileScanner.next();//this takes the odd word
				String lastWord = fileScanner.next();//this takes the even word
				System.out.println(firstWord + " " + lastWord);//this puts the odd and even word on a new line together
				}
			System.out.println("File processing completed");//when there is no words left it will print this
		} catch (Exception e) //if there is any type of error it will print error
		{
			System.out.println("Error");
			e.printStackTrace();
		}
	}//end of main

}//end of AssignmentTen(Recovered name) class
