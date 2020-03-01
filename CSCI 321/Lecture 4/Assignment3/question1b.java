import java.util.*;

class question1b 
{
   public static void main(String[] args)
   {
      Scanner in = new Scanner(System.in);
      PriorityQueue<Task> test = new
      PriorityQueue<Task>(5, new TaskComparator());
         Task Task1 = new Task("Task1", 5);
         test.add(Task1);
         Task Task2 = new Task("Task2", 2);
         test.add(Task2);  
         Task Task3 = new Task("Task3", 1);
         test.add(Task3);
       
       System.out.println("Tasks served in their priority order");
       
       while (!test.isEmpty()) {
       System.out.println(test.poll().getName());
     }
   }
}

class TaskComparator implements Comparator<Task>
{
   public int compare(Task s1, Task s2) 
   {
       if (s1.priority < s2.priority)
         return 1;
       else if (s1.priority > s2.priority)
         return -1;
       return 0;
    }
 }

class Task 
{
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