class Parent {
    static int staticVar = 10;
}

class Child extends Parent {
    static int staticVar = 20; // This hides the static variable in Parent
}

public class Test1 {
    public static void main(String[] args) {
        System.out.println("Parent.staticVar: " + Parent.staticVar); // Outputs: 10
        System.out.println("Child.staticVar: " + Child.staticVar);   // Outputs: 20

        Parent p = new Parent();
        Child c = new Child();
        Parent pc = new Child();

        System.out.println("p.staticVar: " + p.staticVar);   // Outputs: 10
        System.out.println("c.staticVar: " + c.staticVar);   // Outputs: 20
        System.out.println("pc.staticVar: " + pc.staticVar); // Outputs: 10 (Reference type is Parent)
       
    }
}
