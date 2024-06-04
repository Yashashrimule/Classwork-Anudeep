import java.util.LinkedList;
import java.util.Queue;
public class QueueExample
{
  public static void main(String args[])
  {
    Queue<String>queue=new LinkedList<>();
    queue.add("Apple");
    queue.add("Banana");
    queue.add("Cherry");
    queue.add("Pear");
    System.out.println(queue);

    
    String first=queue.poll();
    System.out.println(first);
    System.out.println(queue);
   }
 }