/*************************************************************
* CircularQueue.java
* Drew Kroeger
*
* This class implements a queue with a circular array.
*************************************************************/
public class CircularQueue
{
 private String[] queue; // array that implements a circular queue
 private int length = 0; // number of filled elements
 private int capacity; // size of array
 private int front = 0; // index of first item in queue
 private int rear = 0; // one past the index of the last item
 //**********************************************************
 // Instantiate the queue's array with the given capacity.

	 public CircularQueue(int capacity)
	{
		 queue = new String[capacity];
		 this.capacity = capacity;
	 } // end constructor
	 //**********************************************************
	 public boolean isEmpty()
	 {
		 return length == 0;
	 } // end isEmpty
	//**********************************************************
	 public boolean isFull()
	 {
		 return length==capacity;
	 } // end isFull
	 //**********************************************************
	 public int length()
	 {
		 return length;
	 } // end length
	 //**********************************************************
	// Add a value to the rear of the queue by using the rear's
	 // current position and then incrementing rear.
	
	 public boolean add(String name)
	 {
		 	if (isFull())//if length ==0; return false; else 
		 	{
		 		return false;
		 	}
		 	else
		 	{
		 		queue[rear++] = name;
		 		rear %= capacity; // if rear gets too big, assign it to 0
		 		length++;
		 		return true;
		 	}
	 } // end add
	 //**********************************************************
	 // Remove the value at the front of the queue and then increment
	 // front.
	
	 public String remove()
	 {
		 if (isEmpty())
		 {
			 return null;
		 }
		// else
		// {
		//	 length--;
		//	 return queue[(front = ++front % capacity) == 0 ? capacity-1 : front-1];
		// }
		 else 
		 {
			String removedQ = queue[front];
			front = (front + 1) % capacity;
			length--;
			return removedQ;
		 }
	 } // end remove
	 
	 //**********************************************************
	 // Display the queue's contents in front-to-rear order.
	
	 public void showQueue()
	 {
		 int current; // used for walking through the queue
		 current = front;
		// if (!(isEmpty()))
		// {
		//	 do
		//	 {
		//		 System.out.println(queue[current]);
		//	 } while ((current = ++current % capacity) != rear);
		 if(!(isEmpty())) 
		 {
			 do 
			 {
				 System.out.println(queue[current]);
				 current = (current+1) % capacity;
			 }while(current != rear);
		 }
	 } // end showQueue
} // end CircularQueue class
