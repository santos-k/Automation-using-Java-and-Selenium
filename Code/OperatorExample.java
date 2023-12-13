public class OperatorExample {
    public static void main(String[] args) {
        // Arithmetic Operators
        int a = 10, b = 3;
        int sum = a + b;
        int difference = a - b;
        int product = a * b;
        int quotient = a / b;
        int remainder = a % b;

        System.out.println("Arithmetic Operators:");
        System.out.println("Sum: " + sum);
        System.out.println("Difference: " + difference);
        System.out.println("Product: " + product);
        System.out.println("Quotient: " + quotient);
        System.out.println("Remainder: " + remainder);
        System.out.println();

        // Relational Operators
        boolean isEqual = (a == b);
        boolean isNotEqual = (a != b);
        boolean isGreaterThan = (a > b);
        boolean isLessThan = (a < b);
        boolean isGreaterOrEqual = (a >= b);
        boolean isLessOrEqual = (a <= b);

        System.out.println("Relational Operators:");
        System.out.println("Equal: " + isEqual);
        System.out.println("Not Equal: " + isNotEqual);
        System.out.println("Greater Than: " + isGreaterThan);
        System.out.println("Less Than: " + isLessThan);
        System.out.println("Greater or Equal: " + isGreaterOrEqual);
        System.out.println("Less or Equal: " + isLessOrEqual);
        System.out.println();

        // Logical Operators
        boolean x = true, y = false;
        boolean andResult = x && y;
        boolean orResult = x || y;
        boolean notResult = !x;

        System.out.println("Logical Operators:");
        System.out.println("Logical AND: " + andResult);
        System.out.println("Logical OR: " + orResult);
        System.out.println("Logical NOT: " + notResult);
        System.out.println();

        // Assignment Operators
        int c = 5;
        c += 3;  // Equivalent to c = c + 3;
        int d = 8;
        d -= 2;  // Equivalent to d = d - 2;

        System.out.println("Assignment Operators:");
        System.out.println("c after addition: " + c);
        System.out.println("d after subtraction: " + d);
        
        // Increment and Decrement Operators
        int num = 5;
        int prefixIncrement = ++num;
        int postfixIncrement = num++;
        int prefixDecrement = --num;
        int postfixDecrement = num--;

        System.out.println("Increment and Decrement Operators:");
        System.out.println("Prefix Increment: " + prefixIncrement);
        System.out.println("Postfix Increment: " + postfixIncrement);
        System.out.println("Prefix Decrement: " + prefixDecrement);
        System.out.println("Postfix Decrement: " + postfixDecrement);
        System.out.println();
    }
}
