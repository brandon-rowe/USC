import java.util.*;
import java.lang.*;
import java.io.*;

public class test5 {
   public static void main(String[] args)
   {
     String[] list = {"xyz","ijk","lmn","opq","rst","uvw","abc","def","ghi","jkl"}; 
     test5 test = new test5();
     test.selectionSort(list);
     for(int i = 0; i<list.length; i++)
          System.out.println(list[i]);
   }
   
   public static void selectionSort(String[] list)
   {
      int max;
      String temp;
      for (int index = 0; index < list.length-1; index++)
      {
         max = index;
         for (int scan = index+1; scan < list.length; scan++)
            if(list[scan].compareTo(list[max])>0)
               max = scan;
         temp = list[index];
         list[index] = list[max];
         list[max]  = temp;
      }
      
   }
}