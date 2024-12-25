import java.util.*;
public class LearnStack
{
    public static void main(String[] args) {
        Stack  <String> s1=new Stack<>();
        s1.push("Cat");
        s1.push("Dog");
        s1.push("Lion");
        System.out.println(s1);

        System.out.println(s1.peek()); //gives topmost value in stack

        s1.pop();
        System.out.println(s1);

        System.out.println(s1.empty()); // gives tru or false in stack is empty or not
        System.out.println(s1.search("Dog")); // gives index of Dog

    }
}