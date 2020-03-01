// ******************************************************
//   Numbers.java
//
//   Demonstrates selectionSort on an array of integers.
// ******************************************************

import java.util.Scanner;

public class Numbers
{
    // --------------------------------------------
    //  Reads in an array of integers, sorts them,
    //  then prints them in sorted order.
    // --------------------------------------------
    public static void main (String[] args)
    {
   	Integer[] intList;
   	int size;
   
   	Scanner scan = new Scanner (System.in);
   
   	System.out.print ("\nNumber of Ints to sort: ");
   	size = scan.nextInt();
   	intList = new Integer[size];
   
   	System.out.println ("\nEnter Ints:");
   	for (int i = 0; i < size; i++)
   	    intList[i] = scan.nextInt();
   
   	Sorting.insertionSort(intList);
   
   	System.out.println ("\nSorted Ints:");
   	for (int i = 0; i < size; i++)
   	    System.out.print(intList[i] + "  ");
   	System.out.println ();
    }
}

