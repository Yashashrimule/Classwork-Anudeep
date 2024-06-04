import java.util.PriorityQueue;
import java.util.Queue;
public class PriorityQueueExample
{
  public static void main(String args[])
  {
    Queue<Integer>priorityQueue=new PriorityQueue<>();
   
    priorityQueue.offer(5);
    priorityQueue.offer(1);
    priorityQueue.offer(3);

 
    Integer highestPriority=priorityQueue.poll();
    System.out.println(highestPriority);

   }
 }