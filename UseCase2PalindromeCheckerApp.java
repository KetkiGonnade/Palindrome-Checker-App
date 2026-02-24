
public class UseCase2PalindromeCheckerApp {
     
    public static void main(String[] args) {

        // Hardcoded string
        String input = "madam";

        System.out.println("Use Case 2: Hardcoded Palindrome Check");
        System.out.println("Input String: " + input);

        boolean isPalindrome = true;

        int left = 0;
        int right = input.length() - 1;

        // Compare characters from both ends
        while (left < right) {
            if (input.charAt(left) != input.charAt(right)) {
                isPalindrome = false;
                break;
            }
            left++;
            right--;
        }

        // Display result
        if (isPalindrome) {
            System.out.println("Result: The string IS a palindrome.");
        } else {
            System.out.println("Result: The string is NOT a palindrome.");
        }

        System.out.println("========================================");
    }
}