import java.util.Scanner;
// create a class AnagramChecker
public class AnagramChecker {
    // Method to check if two texts are anagrams
    public static boolean areAnagrams(String str1, String str2) {
        // Check if lengths are equal
        if (str1.length() != str2.length()) {
			// Not anagrams if lengths differ
            return false; 
        }
        // Create an array to store the frequency of characters
		// Assuming ASCII characters
        int[] frequency = new int[256]; 
        // Find the frequency of characters in the first string
        for (int i = 0; i < str1.length(); i++) {
			// Increment frequency for str1
            frequency[str1.charAt(i)]++; 
			// Decrement frequency for str2
            frequency[str2.charAt(i)]--; 
        }
        // Check if all frequencies are zero
        for (int count : frequency) {
            if (count != 0) {
				// Not anagrams if any frequency is not zero
                return false; 
            }
        }
		// Strings are anagrams
		 return true; 
    }
       

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        // Taking user input for two strings
        System.out.println("Enter the first string: ");
		// Read the first string
        String firstString = sc.nextLine(); 
        System.out.println("Enter the second string: ");
		// Read the second string
        String secondString = sc.nextLine(); 
        // Check if the two strings are anagrams
        boolean result = areAnagrams(firstString, secondString);
        // Display the result
        if (result) {
            System.out.println("The two strings are anagrams.");
        } 
		else {
            System.out.println("The two strings are not anagrams.");
        }
        // Close the scanner
        sc.close(); 
    }
}