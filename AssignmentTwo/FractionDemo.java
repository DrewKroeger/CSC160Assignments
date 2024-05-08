/* Drew Kroeger
 * CSC160-Assignment 2- Fraction Project
 * I did use chatgpt because i was thinking that you could only use what was stated in the assignment( so no instance variables) so I typed the assignment into chatgpt and realized 
 * that that would not be realistic. I tried to not look at the code until I was done.When I was done, it did help me understand some spots that I missed or was a little confused about initially, and now I understand them
 */
import java.util.Scanner;

public class FractionDemo 
{
	public static void main(String[] args)
	 {
	 Scanner stdIn = new Scanner(System.in);
	 Fraction c, d, x; // Fraction objects
	 
	 System.out.println("Enter numerator; then denominator.");
	 c = new Fraction(stdIn.nextInt(), stdIn.nextInt());
	 c.print();
	 
	 System.out.println("Enter numerator; then denominator.");
	 d = new Fraction(stdIn.nextInt(), stdIn.nextInt());
	 d.print();
	 
	 x = new Fraction(); // create a fraction for number 0. this makes x = 0/1, so c and d can properly be added together
	 
	 System.out.println("Sum:");
	 x.add(c).add(d);  //make method add not void but rather Fraction
	 x.print();
	 x.printAsDouble();
	 
	 x = new Fraction(1, 1); // create a fraction for number 1, this is so c and d can properly be multiplied together
	 System.out.println("Product:");
	 x.multiply(c).multiply(d);
	 x.print();
	 x.printAsDouble();
	 
	 System.out.println("Enter numerator; then denominator.");
	 x = new Fraction(stdIn.nextInt(), stdIn.nextInt());
	 x.printAsDouble();
	 } // end main
}//end class
