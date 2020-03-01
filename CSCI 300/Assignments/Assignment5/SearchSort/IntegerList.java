


public class IntegerList
{
    int[] list; //values in the list

    //-------------------------------------------------------
    //create a list of the given size
    //-------------------------------------------------------
    public IntegerList(int size)
    {
	   list = new int[size];
    }


    //-------------------------------------------------------
    //fill array with integers between 1 and 100, inclusive
    //-------------------------------------------------------
    public void randomize()
    {
   	for (int i=0; i<list.length; i++)
   	    list[i] = (int)(Math.random() * 100) + 1;
    }


    public void print()
    {
   	for (int i=0; i<list.length; i++)
   	    System.out.println(i + ":\t" + list[i]);
    }


    public int search(int target)
    {
   	int location = -1;
   	for (int i=0; i<list.length && location == -1; i++)
   	    if (list[i] == target)
   		location = i;
   	return location;
    }


    //-----------------------------------------------------------------------
    //Sort the list into ascending order using the selection sort algorithm
    //-----------------------------------------------------------------------
    public void selectionSort()
    {
   	int minIndex;
   	for (int i=0; i < list.length-1; i++)
   	    {
      		//find smallest element in list starting at location i
      		minIndex = i;
      		for (int j = i+1; j < list.length; j++)
      		    if (list[j] < list[minIndex])
      			    minIndex = j;
      
      		//swap list[i] with smallest element
      		int temp = list[i];
      		list[i] = list[minIndex];
      		list[minIndex] = temp;
   	    }
    }

    //-----------------------------------------------------------------------
    //Sort the list into descending order using the selection sort algorithm
    //-----------------------------------------------------------------------
    public void sortDecreasing()
    {
   	int maxIndex;
   	for (int i=0; i < list.length-1; i++)
   	    {
   		//find largest element in list starting at location i
   		maxIndex = i;
   		for (int j = i+1; j < list.length; j++)
   		    if (list[j] > list[maxIndex])
   			    maxIndex = j;
   
   		//swap list[i] with largest element
   		int temp = list[i];
   		list[i] = list[maxIndex];
   		list[maxIndex] = temp;
   	    }
    }


    public void replaceFirst(int oldVal, int newVal)
    {
   	int location = search(oldVal);
   	if (location != -1)
   	    list[location] = newVal;
    }

    public void replaceAll(int oldVal, int newVal)
    {
   	for (int i = 0; i < list.length; i++)
   	    if (list[i] == oldVal)
   		list[i] = newVal;
    }
    public int binarySearchD(int target)
    {
   	int min = 0;
   	int max = list.length-1;
   	int mid = 0;
   	boolean found = false;
   
   	while (!found && min <= max)
   	    {
   		mid = (min + max) / 2;
   
   		if (list[mid] == target)
   		    found = true;
   		else
   		    if (target > list[mid])
       			max = mid - 1;
   		    else
   			min = mid + 1;
   	    }
   
   	if (found)
   	    return mid;
   	else
   	    return -1;
       }
}

