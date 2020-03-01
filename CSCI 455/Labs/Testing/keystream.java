// Lab 3
// Computer Security
// CSCI 455
// AES Encryption

import java.util.*;
import java.lang.*;


public class keystream
{
   // Get the current Sys time used as seed for PRG
   // Divide currentTimeMillis by 100 to get seconds
   private long time = System.currentTimeMillis();
   private long seed = time/1000; //Time in secs becomes seed
   
   public keystream(long seed)
   {
      this.seed = seed;
   }

   public double randomGenerator(seed)
   {
      Random generator = new Random(seed);
      double num = generator.nextDouble()*(0.5);
      return num;
   }
   
   
	public static void main(String[] args)
	{
		System.out.println("Current Mills Time: " + time);
      System.out.println("Current Mills Time in seconds: " + seed);
      double randomNum = randomGenerator(seed);
      System.out.println("Your Pseudo Random Number is :" + randomNum);
      
	}

}