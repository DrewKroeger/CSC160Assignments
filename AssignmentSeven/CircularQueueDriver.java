/*Drew Kroeger- CSC160
 * Assignment 7/Lab 8- Circular Queue method
 * At first I did not use chatGPT, but I was running the code and it was giving me syntax errors when I did not know why. I changed the code 
 *many different times and kept getting little errors, so I went to completely redo it and got this
 ****************************/

//this is the main method for the Circular queue 

public class CircularQueueDriver 
{

	public static void main(String[] args) 
	{
		CircularQueue queue = new CircularQueue(4);
		String[] monssieur = {"Monsieur A", "Monsieur B", "Monsieur C","Monsieur D"};//this array can be added to when someone joins the queue, although queue also will have to go up by one	
		int i = 0; //a for loop by itself would not follow the instructions properly- I tried do while and for loop initially, but that had a lot of issues, you could change variables from private and make it easier, but thats bad
		while(i< monssieur.length)
		{
				queue.add((monssieur[i]));// we add a monsieur to the loop
				i++;//we make I go up so we can put someone in the next spot when necessary
		}
		
		queue.showQueue();
		
		String remove= queue.remove();
		while (remove != null) //as long as somebody is in the queue, they can be removed
		{
			System.out.println("Removed: " + remove);
			remove = queue.remove();//this removes the first person in the queue
		}
	}

}
