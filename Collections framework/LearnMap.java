import java.util.*;
public class LearnMap {
    public static void main(String[] args) {
//      Map<String,Integer> mp=new HashMap<>(); //unsorted,O(1)
        Map<String,Integer> mp=new TreeMap<>(); //sorted,O(log n)
        mp.put("One", 1);
        mp.put("Two", 2);
        mp.put("Three", 3);
        mp.put("Four", 4);
        mp.putIfAbsent("Five", 7);
        mp.putIfAbsent("One", 101);
        System.out.println(mp);

        mp.remove("One");
        System.out.println(mp);

        //Iteration in Map :
        for(Map.Entry<String, Integer> e: mp.entrySet())
        {
            System.out.println(e);
            System.out.println(e.getKey());
            System.out.println(e.getValue());
        }

//        for (String key: mp.keySet())
//        {
//            System.out.println(key);
//
//        }
//        for (Integer value: mp.values())
//        {
//            System.out.println(value);
//        }
        System.out.println(mp.containsKey("B"));
        System.out.println(mp.containsValue(7));
        System.out.println(mp.isEmpty());
        mp.clear();
        System.out.println(mp);
    }
}
