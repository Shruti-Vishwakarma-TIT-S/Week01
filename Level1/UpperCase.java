import java.util.Scanner;
//Create a class UpperCase
public class UpperCase {
    // Method to convert text to uppercase using charAt() and ASCII values
    public static String convertToUpperCase(String text) {
        StringBuilder upperCaseText = new StringBuilder();       
        for (int i = 0; i < text.length(); i++) {
            char currentChar = text.charAt(i);
            // Check if the character is lowercase
            if (currentChar >= 'a' && currentChar <= 'z') {
                // Convert to uppercase by adjusting ASCII value
                char upperChar = (char) (currentChar - 32);
                upperCaseText.append(upperChar);
            } 
			else {
                // If not lowercase, append the character as is
                upperCaseText.append(currentChar);
            }
        }
        
        return upperCaseText.toString();
    }
    // Method to compare two strings using charAt() and return a boolean result
    public static boolean compareStrings(String str1, String str2) {
        if (str1.length() != str2.length()) {
            return false; // If lengths are not equal, return false
        }
        for (int i = 0; i < str1.length(); i++) {
            if (str1.charAt(i) != str2.charAt(i)) {
                return false; // Return false if any character does not match
            }
        }
        return true; // Return true if all characters match
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);        
        // Taking user input
        System.out.println("Enter the complete text: ");
        String inputText = sc.nextLine();        
        // Convert to uppercase using the custom method
        String customUpperCaseText = convertToUpperCase(inputText);       
        // Convert to uppercase using the built-in method
        String builtInUpperCaseText = inputText.toUpperCase();        
        // Compare the two strings
        boolean areEqual = compareStrings(customUpperCaseText, builtInUpperCaseText);       
        // Display the results
        System.out.println("Custom Uppercase Text: " + customUpperCaseText);
        System.out.println("Built-in Uppercase Text: " + builtInUpperCaseText);        
        if (areEqual) {
            System.out.println("Both methods produce the same uppercase text.");
        } else {
            System.out.println("The methods produce different uppercase texts.");
        }       
        sc.close(); // Close the scanner
    }
}