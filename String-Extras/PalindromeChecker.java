import java.util.Scanner;
// Create class PalindromeChecker
public class PalindromeChecker { 
    public static void main(String[] args) { 
        // Create scanner object for user input
        Scanner sc = new Scanner(System.in); 
        // Get a string input from the user
        System.out.print("Enter a string to check if it's a palindrome: "); 
        String input = sc.nextLine(); 
        // Call method to check if the string is a palindrome
        boolean isPalindrome = checkPalindrome(input); 
        // Display the result
        displayResult(isPalindrome); 
        // Close the scanner object
        sc.close(); 
    }

    // Method to check if a string is a palindrome
    public static boolean checkPalindrome(String str) { 
        // Remove spaces and convert to lowercase for accurate comparison
        str = str.replaceAll("\\s", "").toLowerCase(); 
        int left = 0, right = str.length() - 1; 
        // Compare characters from both ends
        while (left < right) { 
            if (str.charAt(left) != str.charAt(right)) { 
                return false; 
            } 
            left++; 
            right--; 
        } 
        return true; 
    }

    // Method to display the result based on palindrome check
    public static void displayResult(boolean isPalindrome) { 
        if (isPalindrome) { 
            System.out.println("The string is a palindrome."); 
        } else { 
            System.out.println("The string is not a palindrome."); 
        } 
    }
}
