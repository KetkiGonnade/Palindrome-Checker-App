
import java.util.Stack;

public class UseCase5PalindromeCheckerApp {

    /**
     * Application entry point for UC5.
     *
     * @param args Command-line arguments
     */
    public static void main(String[] args) {

        String input = "deified";

        System.out.println("Use Case 5: Stack Based Palindrome Check");
        System.out.println("Input String: " + input);

        Stack<Character> stack = new Stack<>();

        // Push all characters to stack
        for (char c : input.toCharArray()) {
            stack.push(c);
        }

        // Build reversed string by popping stack
        String reversed = "";
        while (!stack.isEmpty()) {
            reversed += stack.pop();
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