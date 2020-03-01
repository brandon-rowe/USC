//  DecodeMsg.java       Author: B. Rowe
//  Demonstrates the use of the String class and its methods.
//  This was a terrible method of solving the equation. 
//  But this was a first attempt in an intro class.
//  I should have used a loop to read through the string to decode the message.
import java.util.Scanner;

public class DecodeMsg0
{
    public static void main(String[] args)
    {
        String fullMsg;
        String concatDecode;
        int fullMsgCount;
        char char1, char2, char3, char4, char5, char6, char7, char8, char9, char10, char11;
        char char12, char13, char14, char15, char16, char17, char18, char19, char20, char21;

        Scanner scan = new Scanner(System.in);

        System.out.println("Please enter a message to decode: ");
        fullMsg = scan.nextLine();

        fullMsgCount = fullMsg.length();

        char1 = fullMsg.charAt(0);
        char2 = fullMsg.charAt(0);
        char3 = fullMsg.charAt(0);
        char4 = fullMsg.charAt(0);
        char5 = fullMsg.charAt(0);
        char6 = fullMsg.charAt(0);
        char7 = fullMsg.charAt(0);
        char8 = fullMsg.charAt(0);
        char9 = fullMsg.charAt(0);
        char10 = fullMsg.charAt(0);
        char11 = fullMsg.charAt(0);
        char12 = fullMsg.charAt(0);
        char13 = fullMsg.charAt(0);
        char14 = fullMsg.charAt(0);
        char15 = fullMsg.charAt(0);
        char16 = fullMsg.charAt(0);
        char17 = fullMsg.charAt(0);
        char18 = fullMsg.charAt(0);
        char19 = fullMsg.charAt(0);
        char20 = fullMsg.charAt(0);
        char21 = fullMsg.charAt(0);
        System.out.println("The string length is: " + fullMsgCount);
        System.out.println("The first character is : " + fullMsgCount);    
    }
}


/* String phrase = "Change is inevitable";
        String mutation1, mutation2, mutation3, mutation4;

        System.out.println("Original string: \"" + phrase + "\"");
        System.out.println("Length of string: " + phrase.length());

        mutation1 = phrase.concat(", except from vending machines.");
        mutation2 = mutation1.toUpperCase();
        mutation3 = mutation2.replace('E', 'X');
        mutation4 = mutation3.substring(3, 30);

        // Print each mutated string
        System.out.println("Mutation #1: " + mutation1);
        System.out.println("Mutation #2: " + mutation2);
        System.out.println("Mutation #3: " + mutation3);
        System.out.println("Mutation #4: " + mutation4);

        System.out.println("Mutated length: " + mutation4.length()); */
        
//char ch1 = 'B';
        //char ch2;
        //int x;

        //x = (int)ch1;
        //ch2 = (char)x + 5;
        //System.out.println(ch2)