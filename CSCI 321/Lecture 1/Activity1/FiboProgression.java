import java.util.*;
import java.lang.*;
import java.io.*;

public class FiboProgression extends Progression{
   protected long prev;
   FiboProgression(){
      this(1,2);
   }
   FiboProgression(long a0, long a1){
      first = a0;
      prev = a1-a0;
   }
   protected long nextValue(){
      long temp = prev;
      prev = cur;
      cur += temp;
      return cur;
   }

}