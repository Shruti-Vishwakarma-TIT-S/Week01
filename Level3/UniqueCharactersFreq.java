import java.util.Scanner;
//create a class UniqueCharactersFreq
public class UniqueCharactersFreq{
    // Method to find unique characters in a string
    public static char[] uniqueCharacters(String str) {
		// Array to store unique characters
        char[] uniqueChars = new char[str.length()]; 
        int uniqueCount = 0; 
		// Counter for unique characters
        for (int i = 0; i < str.length(); i++) {
            char currentChar = str.charAt(i);
            boolean isUnique = true;
            // Check if the character is already in the uniqueChars array
            for (int j = 0; j < uniqueCount; j++) {
                if (currentChar == uniqueChars[j]) {
					// Character is not unique
                    isUnique = false; 
                    break;
                }
            }
            // If the character is unique, add it to the uniqueChars array
            if (isUnique) {
                uniqueChars[uniqueCount] = currentChar;
                uniqueCount++;
            }
        }
        // Create a new array to store only the unique characters
        char[] result = new char[uniqueCount];
        for (int i = 0; i < uniqueCount; i++) {
            result[i] = uniqueChars[i];
        }
		// Return the array of unique characters
        return result; 
    }
    // Method to find the frequency of characters in a string
    public static String[][] findCharacterFrequency(String str) {
        int[] frequency = new int[256]; // Array to store frequency of characters
        // Loop through the string to find the frequency of each character
        for (int i = 0; i < str.length(); i++) {
            char currentChar = str.charAt(i);
			// Increment the frequency count
            frequency[currentChar]++; 
        }
        // Find unique characters
        char[] uniqueChars = uniqueCharacters(str);
        // Create a 2D array to store unique characters and their frequencies
		// 2D array for characters and frequencies
        String[][] result = new String[uniqueChars.length][2]; 
        // Loop through the unique characters to fill the result array
        for (int i = 0; i < uniqueChars.length; i++) {
			// Character
            result[i][0] = String.valueOf(uniqueChars[i]); 
			// Frequency
            result[i][1] = String.valueOf(frequency[uniqueChars[i]]); 
        }
		// Return the 2D array of characters and their frequencies
        return result; 
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        // Taking user input
        System.out.println("Enter a string: ");
		// Read the complete line of text
        String inputString = sc.nextLine(); 
        // Find the character frequencies
        String[][] frequencies = findCharacterFrequency(inputString);
        // Display the results
        System.out.println("Character Frequency:");
        System.out.println("--------------------");
        for (String[] row : frequencies) {
		 // Print character and its frequency
            System.out.println(row[0] + ": " + row[1]);
        }
        // Close the scanner
        sc.close(); 
    }
}