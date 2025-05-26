package UserInput;

import java.util.Scanner;

public class UserInput {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter your name: ");
        String name = scanner.nextLine();

        System.out.print("Enter your age: ");
        int age = scanner.nextInt();

        System.out.print("Enter your GPA: ");
        float gpa = scanner.nextFloat();

        System.out.print("Are you a student? (true/false): ");
        boolean isStudent = scanner.nextBoolean();

        System.out.println("Hello " + name);
        System.out.println("Your age is " + age + " years old");
        System.out.println("Your GPA is " + gpa);
        if (isStudent) {
            System.out.println("You are enrolled as a student");
        } else {
            System.out.println("You are NOT enrolled");
        }

        scanner.close();
    }
}
