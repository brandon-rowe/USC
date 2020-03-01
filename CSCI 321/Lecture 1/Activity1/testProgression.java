import java.util.*;
import java.lang.*;
import java.io.*;

public class testProgression{
   public static void main(String[] args){
      Progression pro;
      pro = new ArithProgression(1,2);
      pro.printProgression(10);
      pro = new GeomProgression(1,3);
      pro.printProgression(10);
      pro = new FiboProgression(3,4);
      pro.printProgression(10);
   }
}