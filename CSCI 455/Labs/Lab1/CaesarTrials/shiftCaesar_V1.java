import java.util.*;

public class shiftCaesar
{
   public static void main(String[] args)
   {
      int n;
      String msg;
      String encode;
      char[] letters = {'a','b','c','d','e','f','g','h','i','j','k','l','m','n','o','p','q','r','s','t','u','v','w','x','y','z'};
      
      Scanner scan = new Scanner(System.in);
      System.out.println("Please enter the message to encode");
      msg = scan.nextLine();
      n = msg.length();
      encode = msg;
      
      char[] msgAA = new char[n+1];
      char[] encodeAA = new char[n+1];
      msgAA = msg.toCharArray();
      encodeAA = encode.toCharArray();
      
      for (int i=0; i<n; i++)
      {
         //Random key = new Random(26);
         for (int j=0; j<letters.length-1; j++)
         {
            if(msgAA[i] == letters[j])
               encodeAA[i] += j;
         }
         
      }
      for(int i=0; i<n; i++)
      {
         System.out.println(encodeAA[i]);
      }
   }
}