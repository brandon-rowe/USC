import java.util.*;
import java.lang.*;
import java.io.*;

public class testGenericProgression{
   public static void main(String[] args){
      genericProgression pro;
      pro = new GeomDoubleProgression(100, 0.24);
      pro.printProgression(10);
   }
}