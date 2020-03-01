import java.io.*;
import java.lang.*;
import java.util.*;
import java.text.*;

public class Wednesday extends schedule
{
   
   String[] days = {"Sun", "Mon", "Tues", "Wed", "Thurs", "Fri", "Sat"};
   String[] months = {"January", "February", "March", "April", "May", "June", "July", "August", "September", "October", "November", "December"};
   public String dayOfWeek()
   {
      String ret = "";
      Calendar cal = Calendar.getInstance();
      int day = cal.get(Calendar.DAY_OF_WEEK);
      
      for (int i = 0; i < days.length; i++)
      {
         if (day == i+1)
            ret = days[i];
      }
      return ret;
   }
   
   public int daysUntilFirstWednesday(String str)
   {
         int ret = 0;
         int tmp = 0;
         int endOfWeek = 0;
         String today = str;
         int todayLocation = 0;
         
         for (int i = 0; i < days.length; i++)
         {
            if (today == days[i])
               todayLocation = i;
         }
         if (todayLocation < 3)
            ret = 3 - todayLocation;
         else if (todayLocation > 3)
         {
            endOfWeek = days.length - todayLocation;
            ret = endOfWeek + 3;
         }  
         else if (todayLocation == 3)
         {
            System.out.println("Today is Wednesday");
            ret = 3;
         }
         return ret;
   }

   
   public int forFirstWed(int days)
   {
      int ret = 0;
      int daysUntilFirstWed = days;
      int day = 0;
      Date today = new Date();
      SimpleDateFormat dateFormatter = new SimpleDateFormat("d");
      day = Integer.parseInt(dateFormatter.format(today));
      ret = daysUntilFirstWed + day;
      return ret;
   }
   
   
   
   public String monthOfYear()
   {
      String ret = "";
      Calendar cal = Calendar.getInstance();
      int month = cal.get(Calendar.MONTH);
      
      for (int i = 0; i < months.length; i++)
      {
         if (month == i)
            ret = months[i];
      }
      
      return ret;
   }
   
   public int daysInMonth(String m)
   {
      int ret = 0;
      String month = m;
      if (month == "February")
         ret = 28;
      else
      {
         int index = 0;
         int tmp = 0;
         
         for (int i = 0; i < months.length; i++)
         {
            if (month == months[i])
               index = i+1;
         }
         tmp = index % 2;
         if (tmp == 0)
            ret = 30;
         else
            ret = 31;
        }
      return ret;
   }

}