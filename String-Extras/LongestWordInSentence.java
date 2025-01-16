import java.util.Scanner;
// Create class LongestWordInSentence
public class LongestWordInSentence {
    public static void main(String[] args) {
        // Create scanner to get input from the user
        Scanner sc = new Scanner(System.in);
        // Ask user to enter a sentence
        System.out.print("Enter a sentence: ");
        String input = sc.nextLine();
        // Call method to find the longest word
        String longestWord = findLongestWord(input);
        // Print the longest word in the sentence
        System.out.println("The longest word is: " + longestWord);
        // Close the scanner object to avoid memory leaks
        sc.close();
    }
    // Method to find the longest word in the sentence
    public static String findLongestWord(String sentence) {
        // Split the sentence into words
        String[] words = sentence.split(" ");
        // Initialize variable to store the longest word
        String longestWord = "";
        // Loop through the words and find the longest one
        for (String word : words) {
            if (word.length() > longestWord.length()) {
                longestWord = word; // Update longestWord if the current word is longer
            }
        }
        // Return the longest word
        return longestWord;
    }
}
