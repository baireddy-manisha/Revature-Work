package queue;
import java.util.*;
public class QueueExample {

  public static void main(String args[])
  {
      Queue<String> queue = new PriorityQueue<>();

      queue.add("Amit");  
      queue.add("Rahul");  
      queue.add("Zara");  
      queue.add("Jai");  
      queue.add("Hello");
      queue.add("Sara");  
      queue.add("Hey");  
      queue.add("Ramya");  
      queue.add("Karan");  
      queue.add("Vijay");
       
      System.out.println("Initial Queue " + queue);

      queue.remove("Hello");//removes the hello from queue;

      System.out.println("After Remove " + queue);

      System.out.println("Poll Method: " + queue.poll());//returns and removes the top element from queue

      System.out.println("head:"+queue.element());  //returns the top element
      
      System.out.println("peek:"+queue.peek());//same as element()
      
      System.out.println("Final Queue" + queue);
      
      
      
      System.out.println("iterating the queue elements:");  
      Iterator itr=queue.iterator();  
      while(itr.hasNext()){  
      System.out.println(itr.next());  
      
      }   
  }
}

