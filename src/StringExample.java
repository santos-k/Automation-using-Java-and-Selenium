public class StringExample {
    public static void main(String[] args) {
        // String initialization
        String str1 = "Hello";
        String str2 = new String("World");

        // Concatenation
        String concatenated = str1 + ", " + str2;
        System.out.println("Concatenated String: " + concatenated);

        // Length
        int length = concatenated.length();
        System.out.println("Length of the String: " + length);

        // Character at a specific index
        char charAtIndex = concatenated.charAt(7);
        System.out.println("Character at index 7: " + charAtIndex);

        // Substring
        String substring = concatenated.substring(0, 5);
        System.out.println("Substring from index 0 to 4: " + substring);

        // Uppercase and lowercase
        String uppercase = concatenated.toUpperCase();
        String lowercase = concatenated.toLowerCase();
        System.out.println("Uppercase: " + uppercase);
        System.out.println("Lowercase: " + lowercase);

        // Equality check
        boolean isEqual = str1.equals(str2);
        System.out.println("Are str1 and str2 equal? " + isEqual);

        // Index of substring
        int indexOfWorld = concatenated.indexOf("World");
        System.out.println("Index of 'World': " + indexOfWorld);

        // Replace
        String replacedString = concatenated.replace("Hello", "Greetings");
        System.out.println("After replacing 'Hello' with 'Greetings': " + replacedString);

        // StartsWith and EndsWith
        boolean startsWithHello = concatenated.startsWith("Hello");
        boolean endsWithWorld = concatenated.endsWith("World");
        System.out.println("Starts with 'Hello'? " + startsWithHello);
        System.out.println("Ends with 'World'? " + endsWithWorld);

        // Comparison
        String anotherString = "hello, world";
        int compareToResult = concatenated.compareTo(anotherString);
        System.out.println("Comparison result with 'hello, world': " + compareToResult);

        // Trim
        String stringWithSpaces = "   Spaces around   ";
        String trimmedString = stringWithSpaces.trim();
        System.out.println("Trimmed String: '" + trimmedString + "'");
    }
}
