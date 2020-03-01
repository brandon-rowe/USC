import java.io.*;
import java.math.*;
import java.util.*;

public class Progression {

   protected long first;
   protected long cur;
   Progression(){
      first = cur = 1; //Constructor
   }
   protected long firstValue(){
      cur = first;
      return cur;
      //reset cur
   }
   protected long nextValue(){
      //cur = cur + 1 // return cur
      return ++cur;
   }
   
   protected long void printProgression(int n)
   {
      System.out.Println(n);
   }
    
}