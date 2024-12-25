import java.util.*;
public class LearnPriorityQueue {
    public static void main(String[] args) {
        Queue<Integer> pq=new PriorityQueue<>(Comparator.reverseOrder());//max priority Queue
        pq.offer(50);
        pq.offer(10);
        pq.offer(20);
        pq.offer(30);
        pq.offer(40);
        System.out.println(pq);

        System.out.println(pq.poll());
        System.out.println(pq);

        System.out.println(pq.peek());
    }
}
