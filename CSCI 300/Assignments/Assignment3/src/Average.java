//******************************************************************
//  Average.java
//
//  Finds the average of the integer arguments in the command line.
//******************************************************************

public class Average
{
    //---------------------------------------------------
    // Finds the average of the arguments passed to main
    // in the command line.
    //---------------------------------------------------
    public static void main (String[] args)
    {

     	int numArgs = args.length;
     	int sum = 0;

     	for (int i = 0; i < numArgs; i++)
     	    sum += Integer.parseInt(args[i]);

     	if (numArgs > 0)
     	    System.out.println ("The average of the arguments is " +  (double)sum/numArgs);
     	else
     	    System.out.println ("No arguments passed to main.");

     }
}
