// WageCalculator.java           Author: B. Rowe
// Performs approximate calculations for pay based on 
// hourly wage and number of hours.
import java.util.*;

public class WageCalculator
{
   public static void main(String[] args)
   {
      double hrlyWage = 0.00;
      double weeklyHours = 0.00;
      double weeklySalary = 0.00;
      
      Scanner scan = new Scanner(System.in);
      System.out.println("Please enter your hourly wage: ");
      hrlyWage = scan.nextDouble();
      System.out.println("Please enter the number of hours for this week: ");
      weeklyHours = scan.nextDouble();
      
      weeklySalary = WageCalculator.wageCalc(hrlyWage, weeklyHours);
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
         result = WageCalculator.OTwageCalc(wage, hrs);
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