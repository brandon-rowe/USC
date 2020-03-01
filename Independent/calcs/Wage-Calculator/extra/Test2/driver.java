//driver.java
//Driving the wageCalc2 class

public class driver
{
   public static void main(String[] args)
   {
      double weeklyHours = 0.00;
      double hourlyRate = 0.00;
      Scanner scan = new Scanner(System.in);
      System.out.println("Please enter your hours this week: ");
      weeklyHours = scan.nextDouble();
      System.out.println("Please enter your hourly pay rate: ");
      hourlyRate = scan.nextDouble();
      
      WageCalculator2 calc = new WageCalculator2(hourlyRate, weeklyHours);
      System.out.println(calc.)
   }
}