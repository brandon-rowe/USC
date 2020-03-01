import java.util.*;
import java.io.*;

public class bulbTest{
   public static void main(String[] args){
      
      String checker = "";
      bulb one = new bulb();
      bulb two = new bulb();
      bulb three = new bulb();
      
      checker=one.checkLight();
      System.out.println(checker);
      two.checkLight();
      System.out.println(checker);
      three.checkLight();
      System.out.println(checker);
      
      one.lightOn();
      two.lightOn();
      three.lightOn();
      
      checker=one.checkLight();
      System.out.println(checker);
      two.checkLight();
      System.out.println(checker);
      three.checkLight();
      System.out.println(checker);
      
      one.lightOff();
      two.lightOff();
      three.lightOff();
      
      checker=one.checkLight();
      System.out.println(checker);
      two.checkLight();
      System.out.println(checker);
      three.checkLight();
      System.out.println(checker);
   }
}