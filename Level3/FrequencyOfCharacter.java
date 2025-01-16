import java.util.Scanner;
//create a class FrequencyOfCharacter
public class FrequencyOfCharacter {
    // Method to find the frequency of characters in a string
    public static String[][] findCharacterFrequency(String str) {
		// Array to store frequency of characters
        int[] frequency = new int[256]; 
        // Loop through the string to find the frequency of each character
        for (int i = 0; i < str.length(); i++) {
            char currentChar = str.charAt(i);
			// Increment the frequency count
            frequency[currentChar]++; 
        }
        // Create a 2D array to store characters and their frequencies
        String[][] result = new String[256][2]; // 2D array for characters and frequencies
		// Index for the result array
        int index = 0; 
        // Loop through the frequency array to fill the result array
        for (int i = 0; i < frequency.length; i++) {
            if (frequency[i] > 0) { 
				// Only consider characters that appear in the string
                result[index][0] = String.valueOf((char) i); // Character
                result[index][1] = String.valueOf(frequency[i]); // Frequency
                index++;
            }
        }
        // Resize the result array to the actual number of unique characters
        String[][] finalResult = new String[index][2];
        for (int i = 0; i < index; i++) {
            finalResult[i] = result[i];
        }
		// Return the 2D array of characters and their frequencies
        return finalResult; 
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