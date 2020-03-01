import java.util.*;

public class caesar
{

   public static void main(String[] args)
   {
      String msg;
      String decode;
      
      Scanner scan = new Scanner(System.in);
      System.out.println("Enter text to encode.");
      msg = scan.nextLine();
      
      decode = decrypt(msg);
      System.out.println(decode);
      
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
          System.out.println("Option " + i + ": " + s + " " + " key " + i);
          
     }
     return "end";
   }
}


