import java.util.ArrayList;

public class Hashable {
   public static void main(String[] args) 
   {
      Integer i = new Integer(2018);
      String str="2018";
      StringBuffer sb = new StringBuffer("2018");
      ArrayList al = new ArrayList();
      al.add(i);
      System.out.println(i.hashCode());
      System.out.println(str.hashCode());
      System.out.println(sb.hashCode());
      System.out.println(al.hashCode());
     
   }
}