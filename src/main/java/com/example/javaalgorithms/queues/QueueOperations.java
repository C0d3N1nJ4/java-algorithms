package queues;

import java.util.LinkedList;
import java.util.Queue;

public class QueueOperations {

  public static void main(String[] args) {
    Queue queue = new LinkedList<>();
    queue.add(1);
    queue.add(2);
    queue.add(3);
    queue.add(4);
    queue.add(5);
    System.out.println(queue);

    int removeItem = (int) queue.remove();
    System.out.println(removeItem);
    System.out.println("Remove item : " + queue.remove());
    System.out.println("Peek at queue : " + queue.peek());

    while (!queue.isEmpty()) {
      System.out.println(
          "If not empty, remove another one and display what is remaining: " + queue.remove());
    }
  }
}
