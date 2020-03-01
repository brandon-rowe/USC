import java.util.*;
import java.io.*;
import java.lang.*;

public class PrefixAvg2{
   public static void main(String[] args){
         int X [] = new int[1000];
         int n = X.length;
         int A [] = new int[n];
         Random rand = new Random();
         long startTime = 0;
         long endTime = 0;
         long time = 0;
         
         System.out.println("Creating random array for int X [1000].");
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
         
         int a = 0; 
         for(int i=0; i<n; i++){ 
            a += X[i];
            A[i] = (a/(i+1));
         }
         
         endTime = System.nanoTime();
         System.out.print("End time in nanoseconds = ");
         System.out.println(endTime);
         time = endTime - startTime;
         System.out.print("Runtime in nanoseconds = ");
         System.out.println(time);
         System.out.println();
                  
         
         int Y [] = new int[5000];
         n = Y.length;
         int B [] = new int[n];
         System.out.println("Creating random array for int Y [5000].");
         startTime = System.nanoTime();
         System.out.print("Start time in nanoseconds = ");
         System.out.println(startTime);
         for(int i=0; i<n; i++){
            Y[i] = rand.nextInt(100);
         }
         endTime = System.nanoTime();
         System.out.print("End time in nanoseconds = ");
         System.out.println(endTime);
         time = endTime - startTime;
         System.out.print("Runtime in nanoseconds = ");
         System.out.println(time);
         System.out.println();
         
         System.out.println("Creating average array for int B [].");
         startTime = System.nanoTime();
         System.out.print("Start time in nanoseconds = ");
         System.out.println(startTime);
         a = 0; 
         for(int i=0; i<n; i++){ 
            a += Y[i];
            B[i] = (a/(i+1));
         }
         endTime = System.nanoTime();
         System.out.print("End time in nanoseconds = ");
         System.out.println(endTime);
         time = endTime - startTime;
         System.out.print("Runtime in nanoseconds = ");
         System.out.println(time);
         System.out.println();
         
         int Z [] = new int[10000];
         n = Z.length;
         int C [] = new int[n];
         System.out.println("Creating random array for int Z [10000].");
         startTime = System.nanoTime();
         System.out.print("Start time in nanoseconds = ");
         System.out.println(startTime);
         for(int i=0; i<n; i++){
            Z[i] = rand.nextInt(100);
         }
         endTime = System.nanoTime();
         System.out.print("End time in nanoseconds = ");
         System.out.println(endTime);
         time = endTime - startTime;
         System.out.print("Runtime in nanoseconds = ");
         System.out.println(time);
         System.out.println();
         
         System.out.println("Creating average array for int C [].");
         startTime = System.nanoTime();
         System.out.print("Start time in nanoseconds = ");
         System.out.println(startTime);
         a = 0; 
         for(int i=0; i<n; i++){ 
            a += Z[i];
            C[i] = (a/(i+1));
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