// recursion.java
import java.util.*;

public class recursion
{
   public static void main(String[] args)
   {
      int input;
      Scanner scan = new Scanner(System.in);
      input = scan.nextInt();
      System.out.println(sum(input));
   }
   
   private static int sum(int num)
   {
      int result;
      if(num != 0)
         result = num * sum(num-1);
      else
         result = 1;
      return result;
   }
}