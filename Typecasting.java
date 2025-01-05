public class Typecasting {
    public static void main(String[] args) {
        // Implicit Typecasting (Widening)
        int intValue = 100;
        double doubleValue = intValue;  // int is automatically converted to double
        System.out.println("Implicit Typecasting: int to double: " + doubleValue);

        // Explicit Typecasting (Narrowing)
        double originalDoubleValue = 99.99;
        int convertedIntValue = (int) originalDoubleValue;  // manually casting double to int
        System.out.println("Explicit Typecasting: double to int: " + convertedIntValue);

        // Typecasting with objects (using inheritance)
        Animal animal = new Dog();  // Implicit casting 
        Dog dog = (Dog) animal;     // Explicit casting 
        dog.bark(); // calling method from Dog class
    }
}

class Animal {
    void eat() {
        System.out.println("Animal is eating");
    }
}

class Dog extends Animal {
    void bark() {
        System.out.println("Dog is barking");
    }
}
