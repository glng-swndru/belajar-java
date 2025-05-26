import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter your Name: ");
        String name = scanner.nextLine();

        System.out.println("Hello " + name);
        scanner.close();

    }
}