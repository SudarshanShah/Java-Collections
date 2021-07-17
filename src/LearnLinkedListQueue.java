import java.util.LinkedList;
import java.util.Queue;

public class LearnLinkedListQueue {

    public static void main(String[] args) {

        // Queue is an interface which extends Collection interface.
        // It is based on the format first-in, first-out.
        // LinkedList class implements queue using linked list data structure.
        Queue<Integer> queue = new LinkedList<>();
        // putting elements in queue
        // add() puts element in queue, but throws Exception if not able to insert in queue.
        // offer() does same as add(), but returns False if not able to insert in queue.
        queue.offer(123);
        queue.offer(365);
        queue.offer(780);
        System.out.println("Queue = " + queue);

        // remove() removes the first inserted element and returns it, but throws Exception if queue is empty.
        // poll()  does same as remove(), but returns NULL if queue is empty.
        System.out.println("Element removed : " + queue.poll());
        System.out.println("Queue after poll() is = " + queue);

        // element() gives the element which is next to be removed or in front of queue, but throws Exception
        // if queue is empty.
        // peek() does same as element(), but returns NULL if queue is empty.
        System.out.println("Peek element : " + queue.peek());
    }
}
