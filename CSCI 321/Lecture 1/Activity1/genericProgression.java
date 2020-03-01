import java.util.*;
import java.lang.*;
import java.io.*;

public class genericProgression<K>{
   protected K first;
   protected K cur;
   genericProgression(){
      first = cur;
   }
   protected K firstValue(){
      cur = first;
      return cur;
   }
   protected K nextValue(){
      return ++cur;
   }
   protected K printProgression(int n){
      System.out.println(firstValue());
      for(int i = 2; i<=n; i++)
         System.out.println(nextValue());
      System.out.println();
   }
}