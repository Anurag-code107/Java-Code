package work;

import java.util.Arrays;
import java.util.List;
import java.util.stream.IntStream;
import java.util.stream.Stream;

public class StreamObject {
    public static void main(String[] args) {
        //1. Blank Stream
        Stream<Object> emptyStream = Stream.empty(); //Stream of type object.

        //2. Array, Object, Collection
        String names[]= {"Anurag", "Krishna", "Gauranga", "Nityananda"};
        Stream<String> names1 = Stream.of(names);
        names1.forEach(e->{
            System.out.println(e);
        });

        //3.
        Stream<Object> build = Stream.builder().build();

        //4.
        IntStream st=Arrays.stream(new int[] {2,4,6,8,10});
        st.forEach(System.out::println);

        //5.List, Set
        List<Integer> l1 = List.of(2, 55, 8, 9, 10, 12, 15, 17, 18, 22);
        Stream<Integer> st2=l1.stream();
        st2.forEach(e->{
            System.out.println(e);
        });

    }
}
