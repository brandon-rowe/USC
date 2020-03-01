import java.util.*;

public class caesar_V2
{

   public static void main(String[] args)
   {
      String msg;
      //String encode;
      String decode;
      //int shift;
      
      Scanner scan = new Scanner(System.in);
      System.out.println("Enter text to encode.");
      msg = scan.nextLine();
      
      //System.out.println("Enter shift key value 1-25.");
      //shift = scan.nextInt();
      
      //encode = encrypt(msg, shift).toString(); 
      //System.out.println(encode);
      
      decode = decrypt(msg);
      System.out.println(decode);
      
   }

   public static String encrypt(String msg, int shift)
   {
       String s = "";
       int n = msg.length();
       
       for(int x = 0; x < n; x++){
           char c = (char)(msg.charAt(x) + shift);
           if (c > 'z')
               s += (char)(msg.charAt(x) - (26-shift));
           else
               s += (char)(msg.charAt(x) + shift);
       }
       return s;
   }
   
   public static String decrypt(String msg)
   {
      for(int i=1; i<=26; i++)
      {
          String s = "";
          int n = msg.length();
          
          for(int x = 0; x < n; x++)
          {
              char c = (char)(msg.charAt(x) + i);
              if (c > 'z')
                  s += (char)(msg.charAt(x) - (26-i));
              else
                  s += (char)(msg.charAt(x) + i);
          }
          System.out.println("Cipher: " + s + " " + " key " + i);
          
     }
     return "end";
   }
   
   
}


