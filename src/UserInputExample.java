import java.util.Scanner;

public class UserInputExample {
    public static void main(String[] args) {
        // Creating a Scanner object to read input from the console
        Scanner scanner = new Scanner(System.in);

        // Example 1: Reading an integer
        System.out.print("Enter an integer: ");
        int userInt = scanner.nextInt();
        System.out.println("You entered: " + userInt);

        // Example 2: Reading a double
        System.out.print("Enter a double: ");
        double userDouble = scanner.nextDouble();
        System.out.println("You entered: " + userDouble);

        // Example 3: Reading a string
        scanner.nextLine(); // Consume the newline character left by nextInt or nextDouble
        System.out.print("Enter a string: ");
        String userString = scanner.nextLine();
        System.out.println("You entered: " + userString);

        // Example 4: Reading a character
        System.out.print("Enter a single character: ");
        char userChar = scanner.next().charAt(0);
        System.out.println("You entered: " + userChar);

        // Closing the Scanner to prevent resource leak
        scanner.close();
    }
}