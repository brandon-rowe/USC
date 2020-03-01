//********************************************************************
//  Comparisons.java     
//
//  Tests the largest method of the Compare3 class using both Strings
//  and Integers.
//********************************************************************
import java.util.*;
public class Comparisons
{
    public static void main(String[] args)
    {
   	Scanner scan = new Scanner(System.in);
   	String s1, s2, s3;
   	System.out.println("\nEnter three strings, one per line");
   	s1 = scan.next();
   	s2 = scan.next();
   	s3 = scan.next();
   	System.out.println("The largest is " + Compare3.largest(s1, s2, s3));
   
   	Integer num1, num2, num3;
   	System.out.println("\nEnter three integers");
   	num1 = new Integer(scan.nextInt());
   	num2 = new Integer(scan.nextInt());
   	num3 = new Integer(scan.nextInt());
   	System.out.println("The largest is " + Compare3.largest(num1, num2, num3));
   
   	//autoboxing
   	System.out.println("The largest is " + Compare3.largest(1, 2, 3));
    }
}


	
	
