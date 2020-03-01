import java.util.*;
import java.lang.*;
import java.io.*;

public class scheduler implements Comparable<scheduler>
{

   private int priority;
   private int timeslice;
   private String name;
   
   public scheduler(int priority, int timeslice, String name)
   {
      if (priority >= -20 && priority <= 19)
      {
         this.priority = priority;
      }
      else if (timeslice <= 100 && timeslice >= 1)
      {
         this .timeslice = timeslice;
      }
      else
         this.name = name;
   }
   
   
   public int getPriority()
   {
      return priority;
   }
   
   public void setPriority(int priority) throws Exception
   {
      if (priority >= -20 && priority <= 19)
         {this.priority = priority;}
      else
         System.out.println("Priority incorrect.");
   }
   
   public int getTimeSlice()
   {
      return timeslice;
   }
   
   public void setTimeSlice(int timeslice) throws Exception
   {
      if (timeslice <= 100 && timeslice >= 1)
         this.timeslice = timeslice;
      else
         System.out.println("Length is incorrect.");
   }
   @Override
   public int compareTo(scheduler cpujob)
   {
      return (this.priority + cpujob.priority);
   }
   
   public String getName()
   {return name;}
   public void setName(String name)
   {this.name = name;}
   
}