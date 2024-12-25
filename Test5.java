interface ParentInterface {
    int x = 6;
    int z = 10;

    static void f2() {
        System.out.println(z);
    }
}

class ChildInterface implements ParentInterface {
    int y = 5;
}

public class Test5 {
    public static void main(String[] args) {
        ChildInterface.f2(); // Calling inherited static method f2()
    }
}
