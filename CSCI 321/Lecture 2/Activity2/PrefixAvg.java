import java.util.*;
import java.util.Scanner;
import java.io.*; 

public class PrefixAvg{

   public static void main(String[] args){
      //int X [] = {2, 4, 6, 8, 10};
      //int X [] = {1, 3, 5, 7, 9};
      int X [] = {3, 9, 6, 4, 1};
      int A [] = new int[5];
      
      
      for(int i=0; i<X.length; i++){
         int a = 0; 
         for(int j=0; j<=i; j++){ 
            a += X[j];
         }
         A[i] += (a/(i+1));
         System.out.println(A[i]);
      } 
   }
}