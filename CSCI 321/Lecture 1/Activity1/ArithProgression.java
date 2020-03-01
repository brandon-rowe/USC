import java.util.*;
import java.lang.*;
import java.io.*;

public class ArithProgression extends Progression{
   protected long d;
   ArithProgression(){
      this(1,1);
   }
   ArithProgression(int a, int inc){
      first=cur=a;
      d=inc;
   }
   protected long nextValue(){
      cur += d;
      return cur;
   }

}