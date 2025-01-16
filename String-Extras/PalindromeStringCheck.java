import java.util.Scanner;
// Create class PalindromeStringCheck
public class PalindromeStringCheck {
    public static void main(String[] args) {
        // Create a scanner to get input
        Scanner sc = new Scanner(System.in);
        // Ask user to enter a string to check for palindrome
        System.out.print("Enter a string to check if it's a palindrome: ");
        String input = sc.nextLine();
        // Call method to check if the string is a palindrome
        boolean isPalindrome = checkPalindrome(input);
        // Print result whether the string is a palindrome
        if (isPalindrome) {
            System.out.println("The string is a palindrome.");
        } else {
            System.out.println("The string is not a palindrome.");
        }
        // Close scanner to avoid memory leak
        sc.close();
    }
    // Method to check if the string is a palindrome
    public static boolean checkPalindrome(String input) {
        // Convert input string to lowercase
        input = input.toLowerCase();
        // Loop through the string and check if characters are the same from both ends
        for (int i = 0; i < input.length() / 2; i++) {
            if (input.charAt(i) != input.charAt(input.length() - 1 - i)) {
                return false; // If characters don't match, return false
            }
        }
        // If all characters match, return true
        return true;
    }
}
