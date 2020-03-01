import java.util.Scanner;

public class caesarCracker
{
   public static void main(String[] args)
   {
      String encoded;
      String decoded;
      int[] key = new int[27];
      for(int i=1; i<key.length; i++)
      {
         key[i] = i;
         System.out.println(key[i]);
      }
      
      System.out.println("Please enter the encoded Caesar Cipher message.");
      Scanner scan = new Scanner(System.in);
      encoded = scan.nextLine();
      
      char[] charArray = encoded.toCharArray();
      //Character[] charObjectArray = ArrayUtils.toObject(charArray);
      for(int i=0; i<charArray.length; i++)
      {
         System.out.println(charArray[i]);
      }
   }
}