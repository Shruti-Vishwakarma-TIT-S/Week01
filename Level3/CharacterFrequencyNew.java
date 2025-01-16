import java.util.Scanner;
//create a class CharacterFrequencyNew
public class CharacterFrequencyNew {
    // Method to find the frequency of characters in a string
    public static String[] findCharacterFrequency(String str) {
		// Convert string to character array
        char[] characters = str.toCharArray(); 
		// Array to store frequency of each character
        int[] frequency = new int[characters.length]; 
		// Array to store characters and their frequencies
        String[] result = new String[characters.length]; 
        // Loop through each character in the text
        for (int i = 0; i < characters.length; i++) {
            // Initialize frequency for the current character
            if (frequency[i] == 0) {
                frequency[i] = 1; // Set initial frequency to 1
                // Inner loop to check for duplicates
                for (int j = i + 1; j < characters.length; j++) {
                    if (characters[i] == characters[j]) {
						// Increment frequency
                        frequency[i]++; 
						// Set duplicate character frequency to 0
                        frequency[j] = 0; 
                    }
                }
            }
        }
        // Prepare the result array with characters and their frequencies
        int index = 0; // Index for the result array
        for (int i = 0; i < characters.length; i++) {
            if (frequency[i] > 0) { 
				// Only consider characters with frequency > 0
				// Store character and frequency
                result[index] = characters[i] + ": " + frequency[i]; 
                index++;
            }
        }
        // Resize the result array to the actual number of unique characters
        String[] finalResult = new String[index];
        for (int i = 0; i < index; i++) {
            finalResult[i] = result[i];
        }
		// Return the array of characters and their frequencies
        return finalResult; 
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        // Taking user input
        System.out.println("Enter a string: ");
		// Read the complete line of text
        String inputString = sc.nextLine(); 
        // Find the character frequencies
        String[] frequencies = findCharacterFrequency(inputString);
        // Display the results
        System.out.println("Character Frequency:");
        System.out.println("--------------------");
        for (String entry : frequencies) {
			// Print character and its frequency
            System.out.println(entry); 
        }
        // Close the scanner
        sc.close(); 
    }
}