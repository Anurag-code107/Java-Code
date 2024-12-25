import java.util.*;
import java.util.HashSet;

public class CustomClassSet {
    public static void main(String[] args) {
        Set<Student> studentSet=new HashSet<>();
        studentSet.add(new Student("Anurag", 2));
        studentSet.add(new Student("Krishna", 3));
        studentSet.add(new Student("Balrama", 4));
        studentSet.add(new Student("Gauranga", 5));
        studentSet.add(new Student("Anurag", 5 ));

        System.out.println(studentSet);
    }

}
