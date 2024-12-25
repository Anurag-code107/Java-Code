interface ParentInterface {
    // Static variable (constant)
    int staticVar = 100;

    // Static method
    static void staticMethod() {
        System.out.println("ParentInterface static method");
    }
}

interface ChildInterface extends ParentInterface {
    // Additional static variable
    int childStaticVar = 200;
    static void f1()
    {
       System.out.println("childStaticvar");
    }

    // Additional static method
    static void childStaticMethod() {
        System.out.println("ChildInterface static method");
    }
}

public class Test3 implements ChildInterface {
    public static void main(String[] args) {
       
        // Accessing static variables
        System.out.println("ParentInterface.staticVar: " + ParentInterface.staticVar); // Outputs: 100
        System.out.println("ChildInterface.childStaticVar: " + ChildInterface.childStaticVar); // Outputs: 200

        // Accessing static methods
        ParentInterface.staticMethod(); // Outputs: ParentInterface static method
        ChildInterface.childStaticMethod(); // Outputs: ChildInterface static method

        // Attempting to access static members through the implementing class - this will cause a compilation error
        // System.out.println("Test.staticVar: " + Test.staticVar); // Error
        // Test.staticMethod(); // Error
               
    }
}
