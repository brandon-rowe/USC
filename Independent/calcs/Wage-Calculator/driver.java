//driver.java           Author: B. Rowe
//driving the WageCalculator

public class driver
{
   public static void main(String[] args)
   {
      double result1 = 0.00;
      double result2 = 0.00;
      double result3 = 0.00;
      
      WageCalculator testing1 = new WageCalculator(10.00, 40);
      result1 = testing1.wageCalc();
      System.out.println(result1);
      WageCalculator testing2 = new WageCalculator(20.50, 40);
      result2 = testing2.wageCalc();
      System.out.println(result2);
      WageCalculator testing3 = new WageCalculator(10, 50);
      result3 = testing3.wageCalc();
      System.out.println(result3);
   }      
}

