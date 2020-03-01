import java.util.*;
import java.io.*;
import java.lang.*;

public class javaSort{
   public static void main(String[] args){
         int X [] = new int[1000];
         int n = X.length;
         Random rand = new Random();
         long startTime = 0;
         long endTime = 0;
         long time = 0;
         
         System.out.println("Creating random array for int X [1000].");
         for(int i=0; i<n; i++){
            X[i] = rand.nextInt(100);
         }
         System.out.println();
         
         System.out.println("Sorting array for int X [].");
         startTime = System.nanoTime();
         System.out.print("Start time in nanoseconds = ");
         System.out.println(startTime);
         Arrays.sort(X);         
         endTime = System.nanoTime();
         System.out.print("End time in nanoseconds = ");
         System.out.println(endTime);
         time = endTime - startTime;
         System.out.print("Runtime in nanoseconds = ");
         System.out.println(time);
         System.out.println();
                  
         
         int Y [] = new int[5000];
         n = Y.length;
         System.out.println("Creating random array for int Y [5000].");
         for(int i=0; i<n; i++){
            Y[i] = rand.nextInt(100);
         }
         System.out.println();
         
         System.out.println("Sorting array for int Y [].");
         startTime = System.nanoTime();
         System.out.print("Start time in nanoseconds = ");
         System.out.println(startTime);
         Arrays.sort(Y);
         endTime = System.nanoTime();
         System.out.print("End time in nanoseconds = ");
         System.out.println(endTime);
         time = endTime - startTime;
         System.out.print("Runtime in nanoseconds = ");
         System.out.println(time);
         System.out.println();
         
         int Z [] = new int[10000];
         n = Z.length;
         System.out.println("Creating random array for int Z [10000].");
         for(int i=0; i<n; i++){
            Z[i] = rand.nextInt(100);
         }
         System.out.println();
         
         System.out.println("Sorting array for int Z [].");
         startTime = System.nanoTime();
         System.out.print("Start time in nanoseconds = ");
         System.out.println(startTime);
         Arrays.sort(Z);
         endTime = System.nanoTime();
         System.out.print("End time in nanoseconds = ");
         System.out.println(endTime);
         time = endTime - startTime;
         System.out.print("Runtime in nanoseconds = ");
         System.out.println(time);
         System.out.println();
         
         int A [] = new int[50000];
         n = A.length;
         System.out.println("Creating random array for int A [50000].");
         for(int i=0; i<n; i++){
            A[i] = rand.nextInt(100);
         }
         System.out.println();
         
         System.out.println("Sorting array for int A [].");
         startTime = System.nanoTime();
         System.out.print("Start time in nanoseconds = ");
         System.out.println(startTime);
         Arrays.sort(A);
         endTime = System.nanoTime();
         System.out.print("End time in nanoseconds = ");
         System.out.println(endTime);
         time = endTime - startTime;
         System.out.print("Runtime in nanoseconds = ");
         System.out.println(time);
         System.out.println();
         
         int B [] = new int[100000];
         n = B.length;
         System.out.println("Creating random array for int B [100000].");
         for(int i=0; i<n; i++){
            B[i] = rand.nextInt(100);
         }
         System.out.println();
         
         System.out.println("Sorting array for int B [].");
         startTime = System.nanoTime();
         System.out.print("Start time in nanoseconds = ");
         System.out.println(startTime);
         Arrays.sort(B);
         endTime = System.nanoTime();
         System.out.print("End time in nanoseconds = ");
         System.out.println(endTime);
         time = endTime - startTime;
         System.out.print("Runtime in nanoseconds = ");
         System.out.println(time);
         System.out.println();
         
         int C [] = new int[1000000];
         n = C.length;
         System.out.println("Creating random array for int C [1000000].");
         for(int i=0; i<n; i++){
            C[i] = rand.nextInt(100);
         }
         System.out.println();
         
         System.out.println("Sorting array for int C [].");
         startTime = System.nanoTime();
         System.out.print("Start time in nanoseconds = ");
         System.out.println(startTime);
         Arrays.sort(C);
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