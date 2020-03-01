// Java program to demonstrate working of priority queue in Java 
import java.util.*; 

class Example 
{ 
	public static void main(String args[]) 
	{ 
		// Creating empty priority queue 
		PriorityQueue<String> pQueue = 
						new PriorityQueue<String>(); 

		// Adding items to the pQueue using add() 
		pQueue.add("C"); 
		pQueue.add("C++"); 
		pQueue.add("Java"); 
		pQueue.add("Python"); 

		// Printing the most priority element 
		System.out.println(pQueue.peek());

		// Printing all elements 
		System.out.println("The queue elements:"); 
		 Iterator i = pQueue.iterator();
       while (i.hasNext())
       System.out.println(i.next());

		// Removing the top priority element (or head) and 
		// printing the modified pQueue 
		pQueue.poll();
      System.out.println("After removing element" + "with poll function: ");
      Iterator<String> j = pQueue.iterator();
      while (j.hasNext())
      System.out.println(j.next());

		// Check if “C” is present 
		boolean b = pQueue.contains("C");
      System.out.println("Priority queue contains C " + "or not? " + b); 

	} 
}
