import java.util.*;
import java.io.*;
import java.lang.*;

public class test{
   public static void main(String[] args){
         int X [] = new int[1000];
         int n = X.length;
         int A [] = new int[n];
         Random rand = new Random();
         long startTime = 0;
         long endTime = 0;
         long time = 0;
         
         System.out.println("Creating random array for int X [].");
         startTime = System.nanoTime();
         System.out.print("Start time in nanoseconds = ");
         System.out.println(startTime);
         for(int i=0; i<n; i++){
            X[i] = rand.nextInt(100);
         }
         endTime = System.nanoTime();
         System.out.print("End time in nanoseconds = ");
         System.out.println(endTime);
         time = endTime - startTime;
         System.out.print("Runtime in nanoseconds = ");
         System.out.println(time);
         System.out.println();
         
         System.out.println("Creating average array for int A [].");
         startTime = System.nanoTime();
         System.out.print("Start time in nanoseconds = ");
         System.out.println(startTime);
         for(int i=0; i<n; i++){
            int a = 0; 
            for(int j=0; j<=i; j++){ 
               a += X[j];
            }
            A[i] += (a/(i+1));
         }
         endTime = System.nanoTime();
         System.out.print("End time in nanoseconds = ");
         System.out.println(endTime);
         time = endTime - startTime;
         System.out.print("Runtime in nanoseconds = ");
         System.out.println(time);
         System.out.println();
         
         /* Print out arrays for testing.
         System.out.println("Print random array.");
         for(int i=0; i<n; i++){
            System.out.print(X[i] + ", ");
         }
         System.out.println("End of printing random array.");
         System.out.println();
        
         System.out.println("Print Avg array.");
         for(int i=0; i<n; i++){
            System.out.print(A[i] + ", ");
         }
         System.out.println("End of printing Avg array.");*/
      
  }

}