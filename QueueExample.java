import java.util.LinkedList;
import java.util.Queue;

public class QueueExample {
    public static void main(String[] args) {
        Queue<Integer> queue = new LinkedList<>();
        queue.add(10);  // Enqueue
        queue.add(20);
        System.out.println(queue.remove());  // Dequeue
    }
}
