import java.util.Comparator;
import java.util.PriorityQueue;
import java.util.Queue;

public class LearnPriorityQueue {

    public static void main(String[] args) {

        // PriorityQueue implements Min-Heap data structure.
        // In this smallest value is at top of the queue.
        Queue<Integer> pq = new PriorityQueue<>();
        pq.offer(21);
        pq.offer(43);
        pq.offer(10);
        pq.offer(90);
        System.out.println("Priority Queue = " + pq);

        // poll() removes smallest element which is of highest priority assigned by default.
        // and queue redesigns to Min-Heap.
        pq.poll();
        System.out.println("Priority Queue after poll() = " + pq);

        // peek() gives element which is next to be removed
        System.out.println("Peek queue : " + pq.peek());


        // The constructor argument makes this Priority Queue as Max-Heap.
        // largest value will now be at the top of the queue.
        Queue<Integer> prq = new PriorityQueue<>(Comparator.reverseOrder());
        prq.offer(21);
        prq.offer(43);
        prq.offer(10);
        prq.offer(90);
        System.out.println("Priority Queue = " + prq);

        // poll() removes largest element which is of highest priority assigned by default.
        // and queue redesigns to Max-Heap.
        prq.poll();
        System.out.println("Priority Queue after poll() = " + prq);

        // peek() gives element which is next to be removed
        System.out.println("Peek queue : " + prq.peek());
    }
}
