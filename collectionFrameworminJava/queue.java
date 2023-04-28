package collectionFrameworminJava;
import java.util.*;
public class queue {
    public static void main(String[] args) {
        Queue<Integer> queue = new LinkedList<Integer>();
        queue.offer(25);
        queue.offer(14);
        queue.offer(90);
        System.out.println(queue);
        System.out.println(queue.poll());
        System.out.println(queue);
    }
}
