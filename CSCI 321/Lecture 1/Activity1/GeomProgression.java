import java.util.*;
import java.lang.*;
import java.io.*;

public class GeomProgression extends Progression{
   protected long r;
   GeomProgression(){
      this(1,1);
   }
   GeomProgression(int a, int base){
      first = a;
      r = base;
   }
   protected long nextValue(){
      cur *= r;
      return cur;
   }

}