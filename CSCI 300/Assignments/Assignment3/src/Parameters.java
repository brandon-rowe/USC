//********************************************************
//  Parameters.java
//
//  Illustrates the concept of a variable parameter list.
//********************************************************

import java.util.Scanner;

public class Parameters
{
    //-----------------------------------------------
    //  Calls the average and minimum methods with
    //  different numbers of parameters.
    //-----------------------------------------------
    public static void main(String[] args)
    {

     	double mean1, mean2, mean3, mean4;
     	int min1, min2, min3, min4;
     	Scanner scan = new Scanner (System.in);

     	mean1 = average(42, 69, 37);
     	mean2 = average(35, 43, 93, 23, 40, 21, 75);
     	mean3 = average(13);
     	mean4 = average();

     	min1 = maximum(42, 69, 37);
     	min2 = maximum(35, 43, 93, 23, 40, 21, 75);
     	min3 = maximum(13);
     	min4 = maximum();

     	System.out.println ("mean1 = " + mean1 + " and min1 = " + min1);
     	System.out.println ("mean2 = " + mean2 + " and min2 = " + min2);
     	System.out.println ("mean3 = " + mean3 + " and min3 = " + min3);
     	System.out.println ("Return value of average for an empty parameter list is " + mean4);
     	System.out.println ("Return value of minimum is " + min4);


    }

    //----------------------------------------------
    //  Returns the average of its parameters.
    //----------------------------------------------
    public static double average (int ... list)
    {

     	double result = 0.0;

     	if (list.length != 0)
     	   {
        		int sum = 0;
        		for (int num: list)
        		    sum += num;
        		result = (double)sum / list.length;
     	   }

     	return result;
    }

    //-----------------------------------------
    // Returns the minimum of its parameters.
    //-----------------------------------------
    public static int maximum (int ... list)
    {

     	int max = Integer.MIN_VALUE;
     	for (int num: list)
     	    if (num > max)
     		   max = num;

     	return max;
    }
}
