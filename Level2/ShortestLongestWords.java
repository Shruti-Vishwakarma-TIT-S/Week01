import java.util.Scanner;
//create a class ShortestLongestWords
public class ShortestLongestWords {
    // Method to find the length of a String without using length() method
    public static int findStringLength(String str) {
        int count = 0;
        try {
            while (true) {
                str.charAt(count); // Access each character
                count++; // Increment count
            }
        } catch (StringIndexOutOfBoundsException e) {
            return count; // Return the count of characters
        }
    }
    // Method to split the text into words without using split() method
    public static String[] customSplit(String text) {
        // Count the number of words
        int wordCount = 0;
        for (int i = 0; i < findStringLength(text); i++) {
            if (text.charAt(i) == ' ') {
                wordCount++; // Increment for each space
            }
        }
        wordCount++; // For the last word
        // Create an array to store the words
        String[] words = new String[wordCount];
        int startIndex = 0;
        int wordIndex = 0;
        for (int i = 0; i < findStringLength(text); i++) {
            if (text.charAt(i) == ' ' || i == findStringLength(text) - 1) {
                // If it's a space or the end of the string
                if (i == findStringLength(text) - 1) {
                    i++; // Include the last character if it's not a space
                }
                words[wordIndex] = text.substring(startIndex, i).trim(); // Extract the word
                wordIndex++;
                startIndex = i + 1; // Move to the next word
            }
        }
        return words; // Return the array of words
    }
    // Method to find the shortest and longest words
    public static String[] findShortestAndLongest(String[] words) {
        String shortest = words[0];
        String longest = words[0];
        for (String word : words) {
            if (findStringLength(word) < findStringLength(shortest)) {
                shortest = word; // Update shortest word
            }
            if (findStringLength(word) > findStringLength(longest)) {
                longest = word; // Update longest word
            }
        }
        return new String[]{shortest, longest}; // Return shortest and longest words
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        // Taking user input
        System.out.println("Enter a text: ");
        String inputText = sc.nextLine(); // Read the complete line of text
        // Split the text into words
        String[] words = customSplit(inputText);
        // Find the shortest and longest words
        String[] result = findShortestAndLongest(words);
        // Display the results
        System.out.println("Shortest Word: " + result[0] + " (Length: " + findStringLength(result[0]) + ")");
        System.out.println("Longest Word: " + result[1] + " (Length: " + findStringLength(result[1]) + ")");
        sc.close(); // Close the scanner
    }
}