
import java.util.*;

class question1 {
   public static void main(String[] args)
   {
      Scanner in = new Scanner(System.in);  
      PriorityQueue<Integer> test =new PriorityQueue<Integer>(5) ;
      Task Task1 = new Task("Task1", 5);
      test.add(Task1.priority);
      Task Task2 = new Task("Task2", 2);
      test.add(Task2.priority);  
      Task Task3 = new Task("Task3", 1);
      test.add(Task3.priority);
       
       System.out.println("Tasks served in their priority order");
       
       while (!test.isEmpty()) {
       System.out.println(test.poll());
     }
   }
}


class Task {
   public String name;
   public int priority;
   
   public Task(String name, int priority) 
   {   
     this.name = name;
     this.priority = priority;
   }
   
   public String getName() 
   {
     return name;
   }
}