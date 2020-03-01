import java.util.*;
import java.util.Scanner;
import java.io.*; 
import java.lang.*;

public class PrefixAverage1{

   public int[] testArray(int [] in){
      int X [] = new int[5];
      int A [] = new int[5];
      
      for(int k=0; k<in.length; k++){
         X[k] = in[k];
      }
      
      
      for(int i=0; i<X.length; i++){
         int a = 0; 
         for(int j=0; j<=i; j++){ 
            a += X[j];
         }
         A[i] += (a/(i+1));
      } 
      
      return A;
   }
}