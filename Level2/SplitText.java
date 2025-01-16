import java.util.Scanner;
//create a class SplitText
public class SplitText {
    // Method to find the length of a String without using length() method
    public static int findStringLength(String str) {
        int count = str.length();
		return count;
    }
    // Method to split the text into words without using split() method
    public static String[] customSplit(String text) {
        // Count the number of words
        int wordCount = 0;
        for (int i = 0; i < findStringLength(text); i++) {
            if (text.charAt(i) == ' ') {
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
                // If it's a space or the end of the string, extract the word
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

        return words;
    }

    // Method to compare two String arrays
    public static boolean compareStringArrays(String[] array1, String[] array2) {
        if (array1.length != array2.length) {
			 // If lengths are not equal, return false
            return false;
        }
        for (int i = 0; i < array1.length; i++) {
            if (!array1[i].equals(array2[i])) {
				 // Return false if any word does not match
                return false;
            }
        }
		// Return true if all words match
        return true; 
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        
        // Taking user input
        System.out.println("Enter a text: ");
        String inputText = sc.nextLine();
        // Call the user-defined method to split the text
        String[] customWords = customSplit(inputText);
        // Call the built-in split() method to split the text
        String[] builtInWords = inputText.split(" ");
        // Compare the two string arrays
        boolean areEqual = compareStringArrays(customWords, builtInWords);
        // Display the results
        System.out.println("Custom Split Words: ");
        for (String word : customWords) {
            System.out.println(word);
        }
        System.out.println("Built-in Split Words: ");
        for (String word : builtInWords) {
            System.out.println(word);
        }
        if (areEqual) {
            System.out.println("Both methods produce the same words.");
        } else {
            System.out.println("The methods produce different words.");
        }
        sc.close(); // Close the scanner
    }
}