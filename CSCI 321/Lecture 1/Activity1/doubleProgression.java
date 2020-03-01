import java.util.*;
import java.lang.*;
import java.io.*;

public class doubleProgression{
   protected double first;
   protected double cur;
   doubleProgression(){
      first = cur = 1;
   }
   protected double firstValue(){
      cur = first;
      return cur;
   }
   protected double nextValue(){
      return ++cur;
   }
   protected void printProgression(int n){
      System.out.println(firstValue());
      for(int i = 2; i<=n; i++)
         System.out.println(nextValue());
      System.out.println();
   }
}