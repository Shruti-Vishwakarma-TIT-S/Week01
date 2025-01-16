import java.util.Scanner;
//create a class WordLengthArray
public class WordLengthArray {
    // Method to find the length of a String without using length() method
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
			// Return the count of characters
            return count; 
        }
    }

    // Method to split the text into words without using split() method
    public static String[] customSplit(String text) {
        // Count the number of words
        int wordCount = 0;
        for (int i = 0; i < findStringLength(text); i++) {
            if (text.charAt(i) == ' ') {
				// Increment for each space
                wordCount++; 
            }
        }
		// For the last word
        wordCount++; 
        // Create an array to store the words
        String[] words = new String[wordCount];
        int startIndex = 0;
        int wordIndex = 0;
        for (int i = 0; i < findStringLength(text); i++) {
            if (text.charAt(i) == ' ' || i == findStringLength(text) - 1) {
                // If it's a space or the end of the string
                if (i == findStringLength(text) - 1) {
					// Include the last character if it's not a space
                    i++; 
                }
				// Extract the word
                words[wordIndex] = text.substring(startIndex, i).trim(); 
                wordIndex++;
				// Move to the next word
                startIndex = i + 1; 
            }
        }
		// Return the array of words
        return words; 
    }
    // Method to create a 2D array of words and their lengths
    public static String[][] createWordLengthArray(String[] words) {
		// 2D array for words and lengths
        String[][] wordLengthArray = new String[words.length][2]; 
        for (int i = 0; i < words.length; i++) {
            wordLengthArray[i][0] = words[i]; // Store the word
			// Store the length as String
            wordLengthArray[i][1] = String.valueOf(findStringLength(words[i])); 
        }
        return wordLengthArray; // Return the 2D array
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);       
        // Taking user input
        System.out.println("Enter a text: ");
		// Read the complete line of text  
        String inputText = sc.nextLine();     
        // Call the user-defined method to split the text into words
        String[] words = customSplit(inputText);
        // Create a 2D array of words and their lengths
        String[][] wordLengthArray = createWordLengthArray(words);
        // Display the results in a tabular format
		// Header
        System.out.printf("%-15s %s%n", "Word", "Length"); 
        System.out.println("---------------------");
        for (int i = 0; i < wordLengthArray.length; i++) {
			// Display word and length
            System.out.printf("%-15s %d%n", wordLengthArray[i][0], Integer.parseInt(wordLengthArray[i][1])); 
        }
        
        sc.close(); // Close the scanner
    }
}