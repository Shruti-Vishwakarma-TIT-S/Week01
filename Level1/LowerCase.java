import java.util.Scanner;
//create a class LowerCase
public class LowerCase {
    // Method to convert text to lowercase using charAt() and ASCII values
    public static String convertToLowerCase(String text) {
        StringBuilder lowerCaseText = new StringBuilder();       
        for (int i = 0; i < text.length(); i++) {
            char currentChar = text.charAt(i);
            // Check if the character is uppercase
            if (currentChar >= 'A' && currentChar <= 'Z') {
                // Convert to lowercase by adjusting ASCII value
                char lowerChar = (char) (currentChar + 32);
                lowerCaseText.append(lowerChar);
            } 
			else {
                // If not uppercase, append the character as is
                lowerCaseText.append(currentChar);
            }
        }
        
        return lowerCaseText.toString();
    }
    // Method to compare two strings using charAt() and return a boolean result
    public static boolean compareStrings(String str1, String str2) {
        if (str1.length() != str2.length()) {
			// If lengths are not equal, return false
            return false; 
        }
        for (int i = 0; i < str1.length(); i++) {
            if (str1.charAt(i) != str2.charAt(i)) {
				// Return false if any character does not match
                return false; 
            }
        }
		// Return true if all characters match
        return true; 
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);       
        // Taking user input
        System.out.println("Enter the complete text: ");
        String inputText = sc.nextLine();       
        // Convert to lowercase using the custom method
        String customLowerCaseText = convertToLowerCase(inputText);       
        // Convert to lowercase using the built-in method
        String builtInLowerCaseText = inputText.toLowerCase();       
        // Compare the two strings
        boolean areEqual = compareStrings(customLowerCaseText, builtInLowerCaseText);       
        // Display the results
        System.out.println("Custom Lowercase Text: " + customLowerCaseText);
        System.out.println("Built-in Lowercase Text: " + builtInLowerCaseText);       
        if (areEqual) {
            System.out.println("Both methods produce the same lowercase text.");
        } else {
            System.out.println("The methods produce different lowercase texts.");
        }       
        sc.close(); // Close the scanner
    }
}