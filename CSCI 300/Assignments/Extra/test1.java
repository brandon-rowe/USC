import java.util.*;
import java.lang.*;
import java.io.*;

public class test1{
   public static void main(String[] args){
      int[] list = {15, 25, 30, 22, 15, 22, 40, 30, 40, 10};
      int target = 40;
      int numElement = list.length;
      boolean check = false;
      test1 test = new test1();
      check = test.delete(list,numElement,target);
      System.out.println(check);
   
   }
   
   public boolean delete(int[] list, int numElement, int target){
      boolean check = false;
      for(int i=0; i<list.length; i++)
      {      
         if (list[i] == target)
            for (int j = i; j<list.length-1; j++)
            {
              list[j] = list[j+1];
              check = true; 
            }
         
      }
      for(int i = 0; i<list.length; i++)
         System.out.println(list[i]);
      return check;
   
   }

}
// Code below is first attempt using int prev, cur, next values.
// Current code is working but still faulty. 
// Need to revisit to perfect.

/*if (i+1 != list.length ){
            prev = cur;
            cur = list[i];
            next = list[i+1];
            
            if (cur == target)
            {
               list[i] = next;
               cur = next;
               check = true;
            }
         }
         else
         {
            prev = cur;
            cur = list[i];
            if (cur == target)
            {
               list[i] = 0;
            }
         }
*/