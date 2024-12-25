class Parent {
    static void staticMethod() {
        System.out.println("Parent static method");
    }
}

class Child extends Parent {
    static void staticMethod() {
        System.out.println("Child static method");
    }
}

public class Test {
    public static void main(String[] args) {
        Parent p = new Child();
        p.staticMethod(); // Outputs: Parent static method
    }
}
