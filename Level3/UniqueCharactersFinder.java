import java.util.Scanner;
//create a class UniqueCharactersFinder
public class UniqueCharactersFinder {
    // Method to find the length of a string without using length() method
    public static int findStringLength(String str) {
        int count = 0;
        try {
            while (true) {
				// Access each character
                str.charAt(count); 
				// Increment count
                count++; 
            }
        } catch (StringIndexOutOfBoundsException e) {
            return count; // Return the count of characters
        }
    }
    // Method to find unique characters in a string
    public static char[] findUniqueCharacters(String str) {
        int length = findStringLength(str);
		// Array to store unique characters
        char[] uniqueChars = new char[length]; 
		// Array to track if a character is unique
        boolean[] isUnique = new boolean[length]; 
        int uniqueCount = 0; // Counter for unique characters
        for (int i = 0; i < length; i++) {
            char currentChar = str.charAt(i);
            boolean found = false;
            // Check if the character is already found in the unique array
            for (int j = 0; j < uniqueCount; j++) {
                if (currentChar == uniqueChars[j]) {
                    found = true; // Character is not unique
                    break;
                }
            }
            // If the character is unique, add it to the uniqueChars array
            if (!found) {
                uniqueChars[uniqueCount] = currentChar;
                uniqueCount++;
            }
        }
        // Create a new array to store only the unique characters
        char[] result = new char[uniqueCount];
        for (int i = 0; i < uniqueCount; i++) {
            result[i] = uniqueChars[i];
        }

        return result; // Return the array of unique characters
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        // Taking user input
        System.out.println("Enter a string: ");
		// Read the complete line of text
        String inputString = sc.nextLine(); 
        // Find unique characters
        char[] uniqueCharacters = findUniqueCharacters(inputString);

        // Display the results
        System.out.print("Unique characters: ");
        for (char c : uniqueCharacters) {
		// Print each unique character
            System.out.print(c + " "); 
        }
        // Close the scanner
        sc.close(); 
    }
}