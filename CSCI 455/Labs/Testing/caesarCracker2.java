import java.util.Scanner;

public class caesarCracker
{
   public static void main(String[] args)
   {
      char[] letters = {'a', 'b', 'c', 'd', 'e', 'f', 'g', 'h', 'i', 
      'j', 'k', 'l', 'm', 'n', 'o', 'p', 'q', 'r', 's', 't', 'u', 'v', 
      'w', 'x', 'y', 'z'};
      
      
      
      String encoded;
      String decoded;
      System.out.println("Please enter the encoded Caesar Cipher message.");
      Scanner scan = new Scanner(System.in);
      encoded = scan.nextLine();
      char[] decodedMsg = encoded.toCharArray();
      
      for(int m=0; m<letters.length; m++)
      {
         for(int n=0; n<decodedMsg.length; n++)
         {
            if (letters[m] == decodedMsg[n])
            decoded += m;
         }
      }
      
      /*char[] charArray = encoded.toCharArray();
      for(int i=0; i<key.length; i++)
      {
      
         for(int j = 0; j< decodedMsg.length; j++)
         {
            
         }
         
      }
      
      int[] key = new int[27];
      //load the key values (1-26)
      for(int i=1; i<key.length; i++)
      {
         key[i] = i;
         System.out.println(key[i]);
      }*/
      
      
   }
}