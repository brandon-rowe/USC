// ****************************************************************
// SortedIntList.java
//
// An sorted integer list class that extends IntList.
//          
// ****************************************************************
public class SortedIntList extends IntList
{

    //------------------------------------------------------------- 
    // Constructor -- creates an integer list of a given size.
    //------------------------------------------------------------- 
    public SortedIntList(int size)
    {
	   super(size);
    }

    //------------------------------------------------------------- 
    // Adds an integer to the list -- just put it in as before and use 
    // insertion sort to resort.
    //------------------------------------------------------------- 
    public void add(int value)
    {
   	if (numElements == list.length)
   	    System.out.println("Can't add, list is full");
   	else
   	    {
   		//find slot where value should go
   		int loc = 0;
   		while (loc < numElements && list[loc] < value)
   		    loc++;
   
   		//move everything to the right of it over
   		for (int i = numElements; i>loc; i--)
   		    list[i] = list[i-1];
   
   		//put it in its place
   		list[loc] = value;
   		
   		numElements++;
	    }
    }
}


