import java.util.*;
import java.lang.*;
import java.io.*;

public class GeomDoubleProgression extends doubleProgression{
   protected double r;
   GeomDoubleProgression(){
      this(1.0,1.0);
   }
   GeomDoubleProgression(double a, double base){
      first = a;
      r = base;
   }
   protected double nextValue(){
      cur *= r;
      if(cur<0)
         throw new IllegalArgumentException("Negative Value!");
      return cur;
   }

}