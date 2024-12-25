package work;
import java.util.List;
import java.util.stream.Collector;
import java.util.stream.Collectors;

public class Methods {
    public static void main(String[] args) {
        //filter()
        List<String> names= List.of("Anurag", "Amit", "Rahul", "Aman", "Ashutosh");
        List<String> nameStream = names.stream().filter(e -> e.startsWith("A")).collect(Collectors.toList());
        nameStream.forEach(System.out::println);

        //map()
        System.out.println("numbers List: ");
        List<Integer> numbers=List.of(2,10,12,5,8);
        List<Integer> numberStream= numbers.stream().map(i->i*i).collect(Collectors.toList());
        numberStream.forEach(System.out::println);

        //sorted
        System.out.println("Sorted numbers List");
        numbers.stream().sorted().forEach(System.out::println);

        //min
        System.out.println("Minimum in numbers: ");
        Integer n1=numbers.stream().min((x,y) -> x.compareTo(y)).get();
        System.out.println(n1);

        //max
        System.out.println("Maximum in numbers: ");
        Integer n2 = numbers.stream().max((x, y) -> x.compareTo(y)).get();
        System.out.println(n2);
    }
}
