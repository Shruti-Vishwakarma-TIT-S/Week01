import java.util.Scanner;
//create a class NonRepeatingCharacter
public class NonRepeatingCharacter {
    // Method to find the first non-repeating character in a string
    public static char findFirstNonRepeatingCharacter(String str) {
		// Array to store frequency of characters
        int[] frequency = new int[256]; 
        // Loop through the string to find the frequency of each character
        for (int i = 0; i < str.length(); i++) {
            char currentChar = str.charAt(i);
			// Increment the frequency count
            frequency[currentChar]++; 
        }
        // Loop through the string again to find the first non-repeating character
        for (int i = 0; i < str.length(); i++) {
            char currentChar = str.charAt(i);
            if (frequency[currentChar] == 1) {
				// Return the first non-repeating character
                return currentChar; 
            }
        }
		// Return null character if no non-repeating character is found
        return '\0'; 
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        // Taking user input
        System.out.println("Enter a string: ");
        String inputString = sc.nextLine(); 
        // Find the first non-repeating character
        char result = findFirstNonRepeatingCharacter(inputString);
        // Display the result
        if (result != '\0') {
            System.out.println("The first non-repeating character is: " + result);
        } else {
            System.out.println("There are no non-repeating characters in the string.");
        }
        // Close the scanner
        sc.close(); 
    }
}