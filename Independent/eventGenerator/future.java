import java.io.*;
import java.lang.*;
import java.util.*;
import java.text.*;

public class future
{
   
   String[] months = {"January", "February", "March", "April", "May", "June", "July", "August", "September", "October", "November", "December"};
   public String upDate(String mm, int dd, int dINm)
   {
      System.out.println("Future class and upDate method working at entry");
      int count = 0;
      String event = "";
      int remaining = 0;
      Calendar cal = Calendar.getInstance();
      int year = cal.get(Calendar.YEAR);
      int month = 0;
      int day = dd;
      int daysInMonth = dINm;
      
      for (int i = 0; i < months.length; i++)
      {
         if (mm == months[i])
            month = i;
      }
      
      remaining = daysInMonth - day;
      if (remaining <=3)
         
      if (remaining <= 7)
         count = 1;
      else if (remaining > 7 && remaining <= 14)
         count = 2;
      else if (remaining > 14 && remaining <= 21)
         count = 3;
      else if (remaining > 21 && remaining <= 28)
         count = 4;
         
      cal.set(year, month, day);
      Date tmp = cal.getTime();
      SimpleDateFormat dateFormatter = new SimpleDateFormat("y-M-d");
      event = dateFormatter.format(tmp);
      System.out.println("Future class and upDate method working at end with output " + event);
      return event;
   }

}