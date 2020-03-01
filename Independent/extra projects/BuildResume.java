import java.util.*;
import java.lang.*;

public class BuildResume
{
   public static void main(String[] args)
   {
      Scanner scan = new Scanner(System.in);
      System.out.println("Please enter your name");
      String owner = scan.nextLine();
      System.out.println("Please enter your degree");
      String degree = scan.nextLine();
      Resume me = new Resume(owner, degree);
      System.out.println(me);
   }
}