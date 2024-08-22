import java.util.PriorityQueue;
import java.util.Queue;

public class PriorityQueueExample {
    public static void main(String[] args) {
        Queue<Integer> queue = new PriorityQueue<>();
        queue.add(10);
        queue.add(5);
        queue.add(15);

        System.out.println("PriorityQueue: " + queue);
        System.out.println("Peek: " + queue.peek());
        queue.poll();
        System.out.println("PriorityQueue after poll: " + queue);
    }
}
