import java.util.Scanner;
// create a class PalindromeChecker
public class PalindromeChecker {
    // Logic 1: Iterative method to check if the text is a palindrome
    public static boolean isPalindromeIterative(String str) {
        int start = 0;
        int end = str.length() - 1;
        while (start < end) {
            if (str.charAt(start) != str.charAt(end)) {
				// Characters do not match
                return false; 
            }
            start++;
            end--;
        }
		// All characters matched
        return true; 
    }
    // Logic 2: Recursive method to check if the text is a palindrome
    public static boolean isPalindromeRecursive(String str, int start, int end) {
        if (start >= end) {
            return true; // Base case: all characters matched
        }
        if (str.charAt(start) != str.charAt(end)) {
            return false; // Characters do not match
        }
        return isPalindromeRecursive(str, start + 1, end - 1); // Recursive call
    }
    // Logic 3: Method to check if the text is a palindrome using character arrays
    public static boolean isPalindromeUsingCharArray(String str) {
        char[] originalArray = str.toCharArray(); // Convert string to character array
        char[] reverseArray = new char[originalArray.length];
        // Reverse the string using charAt()
        for (int i = 0; i < originalArray.length; i++) {
            reverseArray[i] = originalArray[originalArray.length - 1 - i];
        }
        // Compare original and reversed arrays
        for (int i = 0; i < originalArray.length; i++) {
            if (originalArray[i] != reverseArray[i]) {
                return false; // Characters do not match
            }
        }
        return true; // All characters matched
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        // Taking user input
        System.out.println("Enter a string: ");
        String inputString = sc.nextLine(); // Read the complete line of text
        // Check for palindrome using three methods
        boolean isPalindromeIterative = isPalindromeIterative(inputString);
        boolean isPalindromeRecursive = isPalindromeRecursive(inputString, 0, inputString.length() - 1);
        boolean isPalindromeCharArray = isPalindromeUsingCharArray(inputString);
        // Display results
        System.out.println("Palindrome Check Results:");
        System.out.println("Iterative Method: " + (isPalindromeIterative ? "Yes" : "No"));
        System.out.println("Recursive Method: " + (isPalindromeRecursive ? "Yes" : "No"));
        System.out.println("Character Array Method: " + (isPalindromeCharArray ? "Yes" : "No"));
        // Close the scanner
        sc.close(); 
    }
}