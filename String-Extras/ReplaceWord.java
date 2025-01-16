import java.util.Scanner;
// Create class ReplaceWord
public class ReplaceWord { 
    public static void main(String[] args) { 
        // Create scanner object for user input
        Scanner sc = new Scanner(System.in); 
        // Ask user for the sentence
        System.out.print("Enter a sentence: "); 
        String sentence = sc.nextLine(); 
        // Ask user for the word to replace
        System.out.print("Enter the word to replace: "); 
        String oldWord = sc.nextLine(); 
        // Ask user for the new word
        System.out.print("Enter the new word: "); 
        String newWord = sc.nextLine(); 
        // Call method to replace the word in the sentence
        String modifiedSentence = replaceWord(sentence, oldWord, newWord); 
        // Display the modified sentence
        System.out.println("Modified Sentence: " + modifiedSentence); 
        // Close the scanner object to avoid memory leaks
        sc.close(); 
    }
    // Method to replace old word with new word in the sentence
    public static String replaceWord(String sentence, String oldWord, String newWord) { 
        // Replace the old word with the new word
        return sentence.replace(oldWord, newWord); 
    }
}
