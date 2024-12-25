import java.util.*;
public class LearnSet {
    public static void main(String[] args) {
//        Set<Integer> st=new HashSet<>();   // unordered
//        Set<Integer> st=new LinkedHashSet<>(); // ordered as insetred
        Set<Integer> st=new TreeSet<>(); // ordered as in binary Search - min to max.
        st.add(20);
        st.add(30);
        st.add(10);
        st.add(40);
        st.add(30);
        System.out.println(st);

        System.out.println(st.contains(40));
        System.out.println(st.isEmpty());
        System.out.println(st.size());
        st.clear();
        System.out.println(st);
    }
}
