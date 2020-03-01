import java.util.PriorityQueue;

public class driver
{
   private PriorityQueue<scheduler> pq = new PriorityQueue<>();
   private scheduler current = null;
   
   public void addJobs(scheduler cpujob)
   {
      this.pq.add(cpujob);
   }
   
   public void startCPU()
   {
      while (!pq.isEmpty())
      {
         current = pq.remove();
         System.out.println("add " + current.getName() + "with time slice "
          + current.getTimeSlice() + " and priority " + current.getPriority());
          for (int i = 1; i < current.getTimeSlice() ; i++)
            System.out.println("No new job");
      }
   }
   
   public static void main(String[] args) throws Exception
   {
      driver pqs = new driver();
      scheduler job1 = new scheduler(0, 3, "Job1");
      scheduler job2 = new scheduler(-3, 2, "Job2");
      scheduler job3 = new scheduler(3, 1, "Job3");
      pqs.addJobs(job1);
      pqs.addJobs(job2);
      pqs.addJobs(job3);
      pqs.startCPU();
      
   }

}