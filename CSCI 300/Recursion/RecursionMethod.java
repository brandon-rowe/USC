//RecursionMethod.java
//Connects to recursion.java
public class RecursionMethod
{
  public int sum(int num)
   {
      int result;
      
      if(num == 1)
         result = 1;
      else
         result = num + sum(num-1);
         
      return result;
   }
}