import java.util.ArrayDeque;

public class LearnArrayDeque {

    public static void main(String[] args) {

        // ArrayDeque is an array implementation of double-ended queue.
        // Here, elements can be added and removed from both sides.
        ArrayDeque<Integer> adq = new ArrayDeque<>();
        // adding elements in ArrayDeque.
        // offer() & offerLast() both put elements at last
        // offerFirst() put element at head of queue.
        adq.offer(45);
        adq.offerFirst(67);
        adq.offerLast(21);
        adq.offer(34);

        System.out.println("ArrayDeque = " + adq);

        System.out.println("Peek : " + adq.peek());
        System.out.println("Peek First : " + adq.peekFirst());
        System.out.println("Peek Last : " + adq.peekLast());

        System.out.println("Poll : " + adq.poll());
        System.out.println("ArrayDeque = " + adq);

        System.out.println("Poll First : " + adq.pollFirst());
        System.out.println("ArrayDeque = " + adq);

        System.out.println("Poll Last : " + adq.pollLast());
        System.out.println("ArrayDeque = " + adq);

    }
}
