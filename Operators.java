public class Operators {
    public static void main(String[] args) {
        // Arithmetic Operators
        int a = 10, b = 5;
        System.out.println("Arithmetic Operators:");
        System.out.println("Addition (a + b): " + (a + b));
        System.out.println("Subtraction (a - b): " + (a - b));
        System.out.println("Multiplication (a * b): " + (a * b));
        System.out.println("Division (a / b): " + (a / b));
        System.out.println("Modulus (a % b): " + (a % b));

        // Relational Operators
        System.out.println("\nRelational Operators:");
        System.out.println("a == b: " + (a == b));
        System.out.println("a != b: " + (a != b));
        System.out.println("a > b: " + (a > b));
        System.out.println("a < b: " + (a < b));

        // Logical Operators
        boolean x = true, y = false;
        System.out.println("\nLogical Operators:");
        System.out.println("x && y: " + (x && y));
        System.out.println("x || y: " + (x || y));
        System.out.println("!x: " + (!x));

        // Bitwise Operators
        int c = 2, d = 3;
        System.out.println("\nBitwise Operators:");
        System.out.println("c & d: " + (c & d));
        System.out.println("c | d: " + (c | d));
        System.out.println("c ^ d: " + (c ^ d));
        System.out.println("~c: " + (~c));
        System.out.println("c << 1: " + (c << 1));
        System.out.println("d >> 1: " + (d >> 1));

        // Assignment Operators
        int e = 10;
        System.out.println("\nAssignment Operators:");
        e += 5; // e = e + 5
        System.out.println("e += 5: " + e);

        // Unary Operators
        System.out.println("\nUnary Operators:");
        System.out.println("++a: " + (++a)); // Pre-increment
        System.out.println("b--: " + (b--)); // Post-decrement
        System.out.println("Updated b: " + b);

        // Ternary Operator
        System.out.println("\nTernary Operator:");
        int max = (a > b) ? a : b;
        System.out.println("Max of a and b: " + max);
    }
}
