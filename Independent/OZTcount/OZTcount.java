import java.util.*;
import java.lang.*;
import java.io.*;

public class OZTcount{
   public static void main(String[] args){
      float weight;
      float price;
      float currentPrice= 0.1f;
      String metalType;
      OZTcount ozt = new OZTcount();
      Scanner scan = new Scanner(System.in);
      
      
      System.out.println("What is the current weight of the metal in OZT: ");
      weight = scan.nextFloat();
      System.out.println("What is the current spot price of the metal per OZT: ");
      price = scan.nextFloat();
      
      System.out.println("What is the type of the metal: ");
      metalType = scan.nextLine();
      if (metalType == "gold")
            {currentPrice = ozt.goldPrice(weight, price);}
      else if (metalType == "silver")
            {currentPrice = ozt.silverPrice(weight, price);}
      else if (metalType == "platinum")
            {currentPrice = ozt.platinumPrice(weight, price);}
      else  
         {
            System.out.println("Please enter a valid metal."); 
            System.exit(0);
         }
      System.out.println("The current value of your " + metalType + " is: $" + currentPrice);
   }
   
   public float goldPrice(float weight, float price){
      return weight * price;
   }
   
   public float silverPrice(float weight, float price){
      return weight * price;
   }
   
   public float platinumPrice(float weight, float price){
      return weight * price;
   }

}