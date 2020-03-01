import java.io.*;
import java.math.*;
import java.util.*;

public class GenericGeo extends Progression<k>{
   protected k r;
   GenericGeo(){
      this(1,1);
   }
   GenericGeo(k a, k base){
      first = a;
      r = base;
   }
   protected K nextValue(){
      return (first*r);
   }      
}