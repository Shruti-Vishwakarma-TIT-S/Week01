import java.util.Scanner;
// Create class CountVowelsAndConsonants
public class CountVowelsAndConsonants {
    public static void main(String[] args) {
        // Create a scanner object to get user input
        Scanner sc = new Scanner(System.in);
        // Ask the user to enter a string
        System.out.print("Enter a string: ");
        String input = sc.nextLine();
        // Call method to count vowels and consonants
        countVowelsAndConsonants(input);
        // Close the scanner to avoid memory leaks
        sc.close();
    }
    // This method counts the vowels and consonants in a string
    public static void countVowelsAndConsonants(String input) {
        // Convert input to lowercase for easier checking
        input = input.toLowerCase();
        // Initialize counts for vowels and consonants
        int vowelCount = 0, consonantCount = 0;
        // Loop through each character of the string
        for (int i = 0; i < input.length(); i++) {
            char ch = input.charAt(i);
            // Check if the character is a vowel
            if (ch == 'a' || ch == 'e' || ch == 'i' || ch == 'o' || ch == 'u') {
                vowelCount++;
            }
            // Check if the character is a consonant
            else if (ch >= 'a' && ch <= 'z') {
                consonantCount++;
            }
        }
        // Show the result of vowel and consonant counts
        System.out.println("Vowels: " + vowelCount);
        System.out.println("Consonants: " + consonantCount);
    }
}
