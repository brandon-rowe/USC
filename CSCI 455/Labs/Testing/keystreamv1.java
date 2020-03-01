// Lab 3
// Computer Security
// CSCI 455
// AES Encryption Seed
// Create seed with currentTimeMillis()
// Use seed to generate keystream of 128 bits
// Char are ints from 0 to 9

import java.util.*;
import java.lang.*;


public class keystreamv1
{
	public static void main(String[] args)
	{
      // Get the current Sys time used as seed for PRG
      // Divide currentTimeMillis by 100 to get seconds
      long time = System.currentTimeMillis();
      long seed = time/1000; //Time in secs becomes seed
      Random generator = new Random(seed);
      String num = Double.toString(generator.nextDouble());
      
		System.out.println("Current Mills Time: " + time);
      System.out.println("Current Mills Time in seconds: " + seed);
      System.out.println("Your Pseudo Random Number is :" + num);  
	}
   
   public String conversion(String str)
   {
      String[] num = str.split("");
      for (int i=0; i<num.length(); i++)
      {
         if (num[i] == ".")
         {
            Random rand = new Random();
            num[i] = rand.nextInt(10);
         }
      }
   }
}