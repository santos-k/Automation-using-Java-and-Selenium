import java.util.Scanner;

public class ConditionalExample {
    public static void main(String[] args) {
        // Example 1: if Statement
        int x = 10;

        if (x > 5) {
            System.out.println("Example 1: x is greater than 5");
        }

        // Example 2: if-else Statement
        int y = 3;

        if (y > 5) {
            System.out.println("Example 2: y is greater than 5");
        } else {
            System.out.println("Example 2: y is not greater than 5");
        }

        // Example 3: if-else if-else Statement
        int z = 7;

        if (z > 10) {
            System.out.println("Example 3: z is greater than 10");
        } else if (z > 5) {
            System.out.println("Example 3: z is greater than 5 but not greater than 10");
        } else {
            System.out.println("Example 3: z is less than or equal to 5");
        }

        // Example 4: Nested if Statements
        int a = 12;

        if (a > 10) {
            System.out.println("Example 4: a is greater than 10");

            if (a % 2 == 0) {
                System.out.println("Example 4: a is an even number");
            } else {
                System.out.println("Example 4: a is an odd number");
            }
        } else {
            System.out.println("Example 4: a is not greater than 10");
        }

        // Example 5: Ternary Operator
        Scanner scanner = new Scanner(System.in);
        System.out.print("Example 5: Enter a number: ");
        int num = scanner.nextInt();
        String result = (num % 2 == 0) ? "Even" : "Odd";
        System.out.println("Example 5: Number is " + result);

        scanner.close();
    }
}
