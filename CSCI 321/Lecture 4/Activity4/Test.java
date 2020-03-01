// Test.java
import java.util.Comparator;
import java.util.PriorityQueue;

public class Test
{
    public static void main(String[] args)
    {
        Comparator<Integer> comparator = new IntegerComparator();
        PriorityQueue<Integer> queue = 
            new PriorityQueue<Integer>(10, comparator);
        queue.add(9);
        queue.add(12);
        queue.add(33);
        while (queue.size() != 0)
        {
            System.out.println(queue.remove());
        }
        
    }
}


