import java.util.Scanner;
// Create class RemoveDuplicates
public class RemoveDuplicates {
    public static void main(String[] args) {
        // Create scanner to get input from user
        Scanner sc = new Scanner(System.in);
        // Ask the user to input a string
        System.out.print("Enter a string to remove duplicates: ");
        String input = sc.nextLine();
        // Call method to remove duplicates from the string
        String modifiedString = removeDuplicates(input);
        // Print the string after duplicates are removed
        System.out.println("Modified String (duplicates removed): " + modifiedString);
        // Close scanner to prevent memory leak
        sc.close();
    }
    // Method to remove duplicates from the string
    public static String removeDuplicates(String input) {
        // Create a StringBuilder to build the result
        StringBuilder result = new StringBuilder();
        // Loop through each character of the input string
        for (int i = 0; i < input.length(); i++) {
            char ch = input.charAt(i);
            // Check if the character is already in the result string
            if (result.indexOf(String.valueOf(ch)) == -1) {
                result.append(ch); // If not, add it to the result
            }
        }
        // Return the string with duplicates removed
        return result.toString();
    }
}
