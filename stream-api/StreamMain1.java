package work;
import java.util.List;
import java.util.stream.Collector;
import java.util.stream.Collectors;

public class StreamMain1 {
    public static void main(String[] args) {
        List<Integer> l1 = List.of(2, 55, 8, 9, 10, 12, 15, 17, 18, 22);
        System.out.println("original List : "+ l1);

        List<Integer> evenList = l1.stream().filter(i -> i % 2 == 0).collect(Collectors.toList());
        System.out.println("Even no from list : "+ evenList);

        List<Integer> newlist = l1.stream().filter(i -> i > 15).collect(Collectors.toList());
        System.out.println("Numbers Greater than 15 from list : "+ newlist);
    }
}
