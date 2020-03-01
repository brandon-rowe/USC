import java.io.*;
import java.lang.*;
import java.util.*;
import java.text.*;

public class schedule
{
   //Initiate events list
   List<String> events = new ArrayList<String>();
   String[] months = {"January", "February", "March", "April", "May", "June", "July", "August", "September", "October", "November", "December"};

   public static void main(String[] args) throws IOException, InputMismatchException 
   {
      try{
         schedule scd = new schedule();
         scd.process(); 
      }
      catch (IOException e){
         System.out.println("Please use an integer and try again.");
      }      
   }
   
   public static void process() throws IOException, InputMismatchException
   {  
      //Initiate vars for storing output
      String date;
      int numOfevents = 0;
      //Initiate class instance for static call
      schedule sch = new schedule();
      Wednesday wed = new Wednesday();
      future ftr = new future();
      
      System.out.println("Events are scheduled starting from the next immediate Wednesday date.");
      System.out.println("Each event is schedule consecutively on Wednesday");
      System.out.println("How many events would you like to schedule?");
      try
      {  
         //Initiate Scanner
         Scanner scan;
         scan = new Scanner(System.in);
         numOfevents = scan.nextInt(); 
         //Initiate and assign vars from methods
         String dayFromDates = wed.dayOfWeek();
         int firstWed = wed.daysUntilFirstWednesday(dayFromDates);
         int fWed = wed.forFirstWed(firstWed);
         String month = wed.monthOfYear();
         int daysInMonth = wed.daysInMonth(month);
         Scanner sc = new Scanner(System.in);
         //Loop to add events
         for (int i=1; i<=numOfevents; i++)
         {
            scan = new Scanner(System.in);
            System.out.println("Please enter the name for event " + i);
            if(scan.hasNext())
            {
               String name = scan.next();
               System.out.println("Please enter the time for event " + i + " ex: 4:00, 5:30, 6:00");
               String time = scan.next();
               if (i == 1)
               {
                  date = sch.upDate(month, fWed);
                  sch.storeEvent(i, date, name, time);
               }
               else
               {
                  date = ftr.upDate(month, fWed, daysInMonth);
                  sch.storeEvent(i, date, name, time);
               }
            }  
         }
         sch.title();
         sch.printEvents();
         scan.close();
    
      }
      catch (NumberFormatException e)
      {
         System.out.println("Please use an integer and try again.");
      }

   }
   
   
   public void title()
   {
      try {  
            BufferedWriter out = new BufferedWriter(new FileWriter("events.txt", true)); 
            out.newLine();
            out.write("Event Num \t\t Date      \t\t Event Name \t\t Time \n"); 
            out.write("--------- \t\t --------- \t\t ---------- \t\t ---- \n"); 
            out.close(); 
        } 
        catch (IOException e) { 
            System.out.println("exception occoured" + e); 
        } 
      System.out.println("Event Num \t\t Date      \t\t Event Name \t\t Time");
      System.out.println("--------- \t\t --------- \t\t ---------- \t\t ----");
   } 
   
   public String upDate(String mm, int dd)
   {
      String event = "";
      Calendar cal = Calendar.getInstance();
      int year = cal.get(Calendar.YEAR);
      int month = 0;
      int day = dd;
      
      for (int i = 0; i < months.length; i++)
      {
         if (mm == months[i])
            month = i;
      }
      cal.set(year, month, day);
      Date tmp = cal.getTime();
      SimpleDateFormat dateFormatter = new SimpleDateFormat("y-M-d");
      event = dateFormatter.format(tmp);
      
      return event;
   }
   
   
   public void printEvents()
   {
   
      try {  
            BufferedWriter out = new BufferedWriter(new FileWriter("events.txt", true));
            for(String event: events) {
               out.write(event);
            }
            out.close(); 
        } 
        catch (IOException e) { 
            System.out.println("exception occoured" + e); 
        } 
        
        events.forEach(System.out::println);
   }
   
   public void storeEvent(int evNum, String evDate, String evName, String evTime)
   {
      String eventNum = Integer.toString(evNum);
      String event = "Event " + eventNum + " \t\t " + evDate + " \t\t " + evName + "\t\t\t " + evTime + "\n";
      events.add(event);
   }

}












//Unused code from dayOfWeek

/*String ret = "";
      String today_ = "";
      Date today = new Date();
      SimpleDateFormat dateFormatter = new SimpleDateFormat("E");
      ret = dateFormatter.format(today);
      
      if (today_ == "Sun")
         ret = "Today is: " + dateFormatter.format(today);
      else
         ret = "Test failed";*/