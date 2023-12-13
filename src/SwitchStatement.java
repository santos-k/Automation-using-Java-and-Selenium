import java.util.Scanner;

public class SwitchStatement {
    public static void main(String[] args) {
        // Creating a Scanner object to read input from the console
        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter a day of the week (1-7): ");
        int day = scanner.nextInt();

        // Switch statement to determine the day of the week
        switch (day) {
            case 1:
                System.out.println("It's Monday");
                break;
            case 2:
                System.out.println("It's Tuesday");
                break;
            case 3:
                System.out.println("It's Wednesday");
                break;
            case 4:
                System.out.println("It's Thursday");
                break;
            case 5:
                System.out.println("It's Friday");
                break;
            case 6:
                System.out.println("It's Saturday");
                break;
            case 7:
                System.out.println("It's Sunday");
                break;
            default:
                System.out.println("Invalid day");
        }

        // Closing the Scanner to prevent resource leak
        scanner.close();
    }
}
