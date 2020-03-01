
import java.util.Scanner;

public class Palindrome
{
    public static void main(String[] args)
    {
   	String string;
   	Scanner scan = new Scanner (System.in);
   
   	System.out.print("Enter a string: ");
   	string = scan.nextLine();
   	if (palindrome(string))
   	    System.out.println("It's a palindrome!");
   	else
   	    System.out.println("It's not a palindrome.");
    }


    private static boolean palindrome(String s)
    {
   	int length = s.length();
   	return 
   	    (s.length() <= 1) ||
   	    (s.charAt(0) == s.charAt(length-1) &&
   	     palindrome(s.substring(1,length-1)));
    }
}

















