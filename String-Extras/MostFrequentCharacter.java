import java.util.Scanner;
// Create class MostFrequentCharacter
public class MostFrequentCharacter { 
    public static void main(String[] args) { 
        // Create scanner object for user input
        Scanner sc = new Scanner(System.in); 
        // Ask user for input string
        System.out.print("Enter a string: "); 
        String input = sc.nextLine(); 
        // Call method to find the most frequent character
        char mostFrequentChar = findMostFrequentCharacter(input); 
        // Display the most frequent character
        System.out.println("Most Frequent Character: " + mostFrequentChar); 
        // Close the scanner object to prevent memory leaks
        sc.close(); 
    }
    // Method to find the most frequent character in the string
    public static char findMostFrequentCharacter(String input) { 
        // Array to store frequency of each character (ASCII size)
        int[] freq = new int[256]; 
        // Loop through the string and count frequency of each character
        for (int i = 0; i < input.length(); i++) { 
            freq[input.charAt(i)]++; 
        } 
        // Initialize variables to track the most frequent character
        int maxFreq = 0; 
        char mostFrequentChar = ' '; 
        // Loop through frequency array to find the most frequent character
        for (int i = 0; i < 256; i++) { 
            if (freq[i] > maxFreq) { 
                maxFreq = freq[i]; 
                mostFrequentChar = (char) i; 
            } 
        } 
        // Return the most frequent character
        return mostFrequentChar; 
    }
}
