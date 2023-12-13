import java.util.Arrays;

public class variables {
    public static void main(String[] args) {
        // Primitive data types
        int age = 25;
        double salary = 50000.50;
        char grade = 'A';
        boolean isJavaFun = true;

        // Reference data types
        String greeting = "Hello, Java!";
        int[] numbers = {1, 2, 3, 4, 5};

        // User-defined class
        class Person {
            String name;
            int age;
        }

        // Creating an instance of the class
        Person person = new Person();
        person.name = "John";
        person.age = 30;

        // Printing all variables in a single line
        System.out.println("age: " + age +
                           ", salary: " + salary +
                           ", grade: " + grade +
                           ", isJavaFun: " + isJavaFun +
                           ", greeting: " + greeting +
                           ", numbers: " + Arrays.toString(numbers) +
                           ", person.name: " + person.name +
                           ", person.age: " + person.age);
    }
}
