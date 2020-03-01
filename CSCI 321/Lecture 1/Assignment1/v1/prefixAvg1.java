import java.util.*;
//Not sure what I was even doing with this class
//But I fixed it.


public class prefixAvg1
{
   public static void main(String[] args)
   {
      //[2, 4, 6, 8, 10] [1, 3, 5, 7, 9] [3, 9, 6, 4, 1] 
      int[] X = new int[]{2, 4, 6, 8, 10};
      int[] Y = new int[]{10, 8, 6, 4, 2};
      int[] A = new int[X.length];
      int tmp;
      
      for(int i=0; i<X.length; i++)
      {
         tmp = X[i];
         A[i] = tmp/(i+1);
      }
      for (int i = 0; i<A.length; i++)
      {
         System.out.println(A[i]);
      }
      for(int i=0; i<Y.length; i++)
      {
         tmp = Y[i];
         A[i] = tmp/(i+1);
      }
      for (int i = 0; i<A.length; i++)
      {
         System.out.println(A[i]);
      }
   }
}