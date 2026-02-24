
import java.util.Queue;
import java.util.LinkedList;
import java.util.Stack;

public class UseCase6PalindromeCheckerApp {

    /**
     * Application entry point for UC6.
     *
     * @param args Command-line arguments
     */
    public static void main(String[] args) {

        String input = "radar";

        System.out.println("Use Case 6: Queue + Stack Palindrome Check");
        System.out.println("Input String: " + input);

        Queue<Character> queue = new LinkedList<>();
        Stack<Character> stack = new Stack<>();

        // Insert characters into both Queue and Stack
        for (char c : input.toCharArray()) {
            queue.add(c);   // FIFO
            stack.push(c);  // LIFO
        }

        boolean isPalindrome = true;

        // Compare by removing from Queue and Stack
        while (!queue.isEmpty() && !stack.isEmpty()) {
            if (!queue.remove().equals(stack.pop())) {
                isPalindrome = false;
                break;
            }
        }

        // Display result
        if (isPalindrome) {
            System.out.println("Result: The string IS a palindrome.");
        } else {
            System.out.println("Result: The string is NOT a palindrome.");
        }

    }
}