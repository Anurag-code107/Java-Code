import java.util.*;
public class LearnLinkedListQueue {
    public static void main(String[] args) {
        Queue<Integer> ql=new LinkedList<>();

        ql.offer(10);
        ql.offer(20);
        ql.offer(30);
        System.out.println(ql);

        System.out.println(ql.poll());//removes first head element in Queue
        System.out.println(ql);

        System.out.println(ql.peek());//gives first head element in Queue
    }
}
