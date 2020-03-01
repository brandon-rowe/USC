// WageCalculator2.java           Author: B. Rowe
// Performs approximate calculations for pay based on 
// hourly wage and number of hours.
import java.util.*;

public class WageCalculator2
{
   public void WageCalculator2(Double wage, double hrs)
   {
      double hrlyWage = 0.00;
      double weeklyHours = 0.00;
      double weeklySalary = 0.00;
      
      hrlyWage = wage;
      weeklyHours = hrs;
      
      weeklySalary = WageCalculator2.wageCalc(hrlyWage, weeklyHours);
      System.out.println("You're weekly salary is "+ weeklySalary + " hourly wage.");
   }
   
   
   public static double wageCalc(double wage, double hrs)
   {
      double result = 0.00;
      
      if (hrs <= 40)
      {
         result = wage * hrs;
      }
      else
      {
         result = WageCalculator2.OTwageCalc(wage, hrs);
      }
      return result;
   }
   
   public static double OTwageCalc(double wage, double hrs)
   {
      final double fullTimeHours = 40;
      double OTHours = hrs - fullTimeHours;
      double OTPayRate = wage * 1.5;
      double OTWage = OTHours * OTPayRate;
      double RegWage = fullTimeHours * wage;
      return RegWage + OTWage;
   }
}