import java.util.Arrays;
public class LearnArrayClass {
    public static void main(String[] args) {
        int[] numbers= {2,4,6,8,10,12,14,16,18,20};
        int index=Arrays.binarySearch(numbers, 12);
        System.out.println(index);

        int[] n= {9,6,12,15,3,18,21};
        Arrays.sort(n);
        for (int i:n){
            System.out.print(i+" ");
        }

        System.out.println();

        Arrays.fill(n, 12); // gives array with all values : 12
        for (int i:n){
            System.out.print(i+" ");
        }
    }
}
