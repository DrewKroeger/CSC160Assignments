/*
 * Assignment 5- Drew Kroeger
 * Deck class
 * This class creates card objects and puts them into an array list(creates a deck of cards)
 */

import java.util.ArrayList;
public class Deck 
{	
	ArrayList <Card> cardList;
	
	/****************************************************************************/
	
	//this constructor instantiates the array list with card objects using for loops, it could also be done with a more complex for loop and a small array but this way made more sense to me
	
	public Deck() 
	{
		cardList = new ArrayList<>(52);
		for (int i = 0; i<13 ; i++)
		{
			cardList.add(new Card(((i)+1),'C'));
		}
		
		for (int i = 0; i<13 ; i++)
		{
			cardList.add(new Card(((i)+1),'D'));
		}
		
		for (int i = 0; i<13 ; i++)
		{
			cardList.add(new Card(((i)+1),'H'));
		}
		
		for (int i = 0; i<13 ; i++)
		{
			cardList.add(new Card(((i)+1),'S'));
		}
	}//end of deck constructor
	
	/*************************************************************/
	
	//this method returns the card at the end of the array list(in the last position) and also gets rid of it in the array list
	
	public Card dealCard() 
	{
		Card highCard = cardList.get(cardList.size()-1);
		cardList.remove(cardList.size()-1);
		return highCard;
	}//end of dealCard method
	
	/***************************************************************/
	
	//this method is taking the elements of the array list and putting it into a string and formatting the card list array list into 5 elements per row
	
	public String toString() 
	{
		String string = "";
		for(int i = 0; i<cardList.size();i++)
		{
			string += cardList.get(i).toString();
			if ((i+1)%5==0) 
			{
				string += "\n";
			}
			else 
			{
				string += " ";
			}
		}
		return string;
		
	}//end of toString method
}//end of Deck class
