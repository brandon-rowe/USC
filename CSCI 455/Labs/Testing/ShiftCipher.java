//This class shows a standard shift cipher encryption scheme.
//This applies a key that is selected by the user. 
//This encryption is a 1 on 1-10 scale. Can be easily broken
//by brute force to check all chars to the keyspace.
//However, since it utilizes all ASCII chars, it key value
//array would be 128 instead of 26. Making brute force a 
//little less practical. Not impossible.

/* :Issues <<>> I need to solve the bruteForce method and
print all possible values of the msg without the key.
I need to fix the loops to read properly and increment
for all char in keyspace. <<>> Issues: */

import java.util.*;


public class ShiftCipher
{
	public ShiftCipher()
	{
		//this.msg = str;	
	}

	public String encrypt(String msg, int key)
   {
		int n = msg.length();
		String encoded = "";
      char tmp;
		for(int i=0; i<n; i++)
		{
			tmp = msg.charAt(i);
			int ascii = (int)tmp;
         ascii += key;
			encoded += (char)ascii;
		}
		return encoded;
	}
   
   public String decrypt(String msg, int key)
   {
		int n = msg.length();
		String decoded = "";
      char tmp;
		for(int i=0; i<n; i++)
		{
			tmp = msg.charAt(i);
			int ascii = (int)tmp;
         ascii -= key;
			decoded += (char)ascii;
		}
		return decoded;
	}
   
   public String bruteForce(String msg)
   {
		int n = msg.length();
		String decoded = "";
      char tmp;
		for(int i=0; i<n; i++)
		{
         for(int j=1; j<=26; j++)
         {
            decoded = "";
   			tmp = msg.charAt(i);
   			int ascii = (int)tmp;
            ascii -= j;
   			decoded += (char)ascii;
            System.out.println(decoded);
         }
         System.out.println(decoded);
		}
		return decoded;
	}
   
	public static void main(String[] args)
	{
		String text, encode, decode;
      int key;
		Scanner scan = new Scanner(System.in);
		System.out.println("Please enter a message to encode: ");
		text = scan.nextLine();
      System.out.println("Please enter a message key (1-128):  ");
		key = scan.nextInt();
		ShiftCipher shift = new ShiftCipher();
		encode = shift.encrypt(text, key);
		System.out.println("Your encoded message is: " + encode);
      decode = shift.decrypt(encode, key);
      System.out.println("Your decoded message is: " + decode);
      System.out.println("Brute Force");
      shift.bruteForce(encode);
      System.out.println("Brute Force End");
	}
}