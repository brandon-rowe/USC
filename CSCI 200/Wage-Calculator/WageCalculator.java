// WageCalculator.java           Author: B. Rowe
// Performs approximate calculations for pay based on 
// hourly wage and number of hours.
import java.util.*;

public class WageCalculator
{
   double hrlyWage = 0.00;
   double weeklyHours = 0.00;
   double weeklySalary = 0.00;
   final double fullTimeHours = 40;

   public WageCalculator(double wage, double hrs)
   {
      hrlyWage = wage;
      weeklyHours = hrs;
   }   
   
   public double wageCalc()
   {
      double result = 0.00;
      double OTHours = weeklyHours - fullTimeHours;
      double OTPayRate = hrlyWage * 1.5;
      double OTWage = OTHours * OTPayRate;
      double RegWage = fullTimeHours * hrlyWage;
      
      if (weeklyHours <= fullTimeHours)
      {
         result = hrlyWage * weeklyHours;
      }
      else
      {
         result = RegWage + OTWage;
      }
      return result;
   }
}