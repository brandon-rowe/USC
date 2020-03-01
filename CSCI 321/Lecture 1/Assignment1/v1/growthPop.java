import java.util.*;

public class growthPop
{
   public static void main(String[] args)
   {
      //initialization
      int population = 0;
      int years = 0;
      int generation = 0;
      Scanner scan = new Scanner(System.in);
      
      //set variables
      try
      {
         System.out.println("Please enter the initial population.");
         population = scan.nextInt();
         System.out.println("Please enter the years.");
         years = scan.nextInt();
         
         System.out.println(population);
         System.out.println(years);
      }
      catch (Exception e)
      {
           //error handling code
           System.out.println("Please enter valid variables.");
      }
      
      //perform calculations & return results
      System.out.println("Population after generations.");
      years = years/30;
      for (int i=0; i<years; i++)
      {
         population = population*2;
         System.out.println("Generation " + (i+1) + ": " + population);
      }
       
   }
}