import java.util.Scanner;
//create a class VowelAndConsonant
public class VowelAndConsonant {
    // Method to check if a character is a vowel, consonant, or not a letter
    public static String checkCharacter(char ch) {
        // Convert to lowercase if it's an uppercase letter
        if (ch >= 'A' && ch <= 'Z') {
			// Convert to lowercase using ASCII
            ch = (char) (ch + 32); 
        }
        // Check if the character is a vowel
        if (ch >= 'a' && ch <= 'z') { 
		// Check if it's a letter
            if (ch == 'a' || ch == 'e' || ch == 'i' || ch == 'o' || ch == 'u') {
                return "Vowel";
            } 
			else {
                return "Consonant";
            }
        }
        return "Not a Letter"; // Return if it's not a letter
    }
    // Method to find vowels and consonants in a string
    public static int[] countVowelsAndConsonants(String str) {
        int vowelCount = 0;
        int consonantCount = 0;
        for (int i = 0; i < str.length(); i++) {
            char currentChar = str.charAt(i); // Get the character at the current index
            String result = checkCharacter(currentChar); // Check if it's a vowel or consonant
            // Increment counts based on the result
            if (result.equals("Vowel")) {
                vowelCount++;
            } else if (result.equals("Consonant")) {
                consonantCount++;
            }
        }
        return new int[]{vowelCount, consonantCount}; // Return counts in an array
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        // Taking user input
        System.out.println("Enter a string: ");
        String inputString = sc.nextLine(); // Read the complete line of text
        // Call the method to count vowels and consonants
        int[] counts = countVowelsAndConsonants(inputString);
        // Display the results
        System.out.println("Number of Vowels: " + counts[0]);
        System.out.println("Number of Consonants: " + counts[1]);
        sc.close(); // Close the scanner
    }
}