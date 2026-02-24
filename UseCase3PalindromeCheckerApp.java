
public class UseCase3PalindromeCheckerApp {

    /**
     * Application entry point for UC3.
     *
     * @param args Command-line arguments
     */
    public static void main(String[] args) {

        String input = "racecar";
        String reversed = "";

        System.out.println("Use Case 3: Reverse String Palindrome Check");
        System.out.println("Input String: " + input);

        // Build reversed string
        for (int i = input.length() - 1; i >= 0; i--) {
            reversed += input.charAt(i);
        }

        // Compare original and reversed
        if (input.equals(reversed)) {
            System.out.println("Result: The string IS a palindrome.");
        } else {
            System.out.println("Result: The string is NOT a palindrome.");
        }

        System.out.println("Reversed String: " + reversed);
    }
}