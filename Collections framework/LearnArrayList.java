import java.util.*;
public class LearnArrayList {
    public static void main(String[] args) {
        List <Integer> l1=new ArrayList(); //Integer type ArrayList
        l1.add(1);
        l1.add(2);
        l1.add(3); // add element at the last index of the list
        System.out.println(l1);

        l1.add(1, 5); //add element at specified index
        System.out.println(l1);

        List <Integer> newl1= new ArrayList();
        newl1.add(10);
        newl1.add(20);
        l1.addAll(newl1); // add new list in old list
        System.out.println(l1);

        System.out.println(l1.get(2)); //get indexed element

        l1.remove(1); // remove index 1 value
        System.out.println(l1);

        l1.remove(Integer.valueOf(20)); //remove specified value, here remove 20 from list
        System.out.println(l1);

        l1.set(3, 4); // replace value of index 3rd with integer 4
        System.out.println(l1);

        System.out.println(l1.contains(4));

        l1.clear(); //remove all elements from the list
        System.out.println(l1);


    }
}
