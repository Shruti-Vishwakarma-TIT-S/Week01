import java.util.Scanner;
//create class VowelConsonantChecker
public class VowelConsonantChecker {
    // Method to check if a character is a vowel, consonant, or not a letter
    public static String[] checkCharacter(char ch) {
        // Convert to lowercase if it's an uppercase letter
        if (ch >= 'A' && ch <= 'Z') {
			// Convert to lowercase using ASCII
            ch = (char) (ch + 32); 
        }
        // Check if the character is a letter
        if (ch >= 'a' && ch <= 'z') {
            if (ch == 'a' || ch == 'e' || ch == 'i' || ch == 'o' || ch == 'u') {
				// Return character and type
                return new String[]{String.valueOf(ch), "Vowel"}; 
            } 
			else {
				// Return character and type
                return new String[]{String.valueOf(ch), "Consonant"}; 
            }
        }
		// Return if it's not a letter
        return new String[]{String.valueOf(ch), "Not a Letter"}; 
    }

    // Method to find vowels and consonants in a string
    public static String[][] findVowelsAndConsonants(String str) {
        int length = str.length();
		// 2D array for character and type
        String[][] result = new String[length][2]; 
        for (int i = 0; i < length; i++) {
			// Get the character at the current index
            char currentChar = str.charAt(i); 
			// Check character type
            result[i] = checkCharacter(currentChar); 
        }
		// Return the 2D array
        return result; 
    }
    // Method to display the 2D array in a tabular format
    public static void displayResult(String[][] result) {
         System.out.println("Character             Type");
        System.out.println("--------------------");
        for (String[] row : result) {
			// Display character and type
            System.out.printf("%-10s %-10s%n", row[0], row[1]); 
        }
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        // Taking user input
        System.out.println("Enter a string: ");
		// Read the complete line of text
        String inputString = sc.nextLine(); 
        // Find vowels and consonants
        String[][] result = findVowelsAndConsonants(inputString);
        // Display the results
        displayResult(result);
		// Close the scanner
        sc.close(); 
    }
}