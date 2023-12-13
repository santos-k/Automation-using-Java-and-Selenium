import java.util.InputMismatchException;
import java.util.Scanner;

public class ExceptionHandling {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        try {
            System.out.print("Enter an integer: ");
            int num = scanner.nextInt();

            if (num == 0) {
                throw new ArithmeticException("Cannot divide by zero");
            }

            int result = 10 / num;
            System.out.println("Result: " + result);
        } catch (InputMismatchException e) {
            System.out.println("Input is not an integer");
        } catch (ArithmeticException e) {
            System.out.println("Arithmetic exception: " + e.getMessage());
        } finally {
            System.out.println("Finally block: This code always executes");
            scanner.close();
        }
    }
}
