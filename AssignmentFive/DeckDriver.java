
/*************************************************************
* DeckDriver.java
* Drew Kroeger- assignment 5
* This class tests the Deck class. I did use chatGpt just after I was done to see how it would write it, which was a lot different than mine 
* for the most part. It used append a lot.
*************************************************************/
public class DeckDriver
{
	public static void main(String[] args)
	{
		Deck deck = new Deck();
		System.out.println(deck.dealCard());
		System.out.println(deck.dealCard());
		System.out.println();
		System.out.println(deck);
	} // end main
} // end DeckDriver class