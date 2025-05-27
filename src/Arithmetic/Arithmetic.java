package Arithmetic;

public class Arithmetic {
    public static void main(String[] args) {
        int a = 10;
        int b = 3;

        System.out.println("Addition: " + (a + b));       // 13
        System.out.println("Subtraction: " + (a - b));    // 7
        System.out.println("Multiplication: " + (a * b)); // 30
        System.out.println("Division: " + (a / b));       // 3
        System.out.println("Modulus: " + (a % b));        // 1

        // For floating-point division
        double c = 10;
        double d = 3;
        System.out.println("Floating Division: " + (c / d)); // 3.333...
    }
}
/*
Compound Assignment Operators
+= → a += b is same as a = a + b
-= → a -= b
*= → a *= b
= → a /= b
%= → a %= b
*/