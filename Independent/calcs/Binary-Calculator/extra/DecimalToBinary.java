//package decimaltobinary;

import java.util.Scanner;

public class DecimalToBinary
{
   public static void main(String[] args)
   {
      Boolean quit = false;
      
      do
      {
         
         int number, i=0;
         int binary[] = new int[100];
         String inputStr = "";
         Scanner input = new Scanner(System.in);
         System.out.print("Enter decimal number: ");
         number = input.nextInt();
         
         while(number != 0)
         {
            binary[i] = number%2;
            number = number/2;
            i++;
         }
         
         System.out.print("Binary value is: ");
         for(int j =i-1; j>=0; j--)
         {
            System.out.println(""+binary[j]);
         }
         
         System.out.println("Would you like to do it again? ");
         inputStr = input.nextLine();
         if (inputStr == "yes" || inputStr == "Yes")
         {
           quit = false;
         }
         else
         {
               //System.exit();
            quit = true;
         }
      }
      while(quit = false);
   }
}
