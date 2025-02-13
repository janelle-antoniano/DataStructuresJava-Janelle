import java.util.PriorityQueue;

public class HeapExample {
    public static void main(String[] args) {
        PriorityQueue<Integer> minHeap = new PriorityQueue<>();
        minHeap.add(5);
        minHeap.add(1);
        minHeap.add(10);
        System.out.println(minHeap.poll());  // Removes the smallest element
    }
}
