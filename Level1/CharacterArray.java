import java.util.Scanner;
//create a class CharacterArray
public class CharacterArray {
    // Method to return characters in a string without using toCharArray()
    public static char[] getCharacters(String str) {
        char[] characters = new char[str.length()];
        for (int i = 0; i < str.length(); i++) {
            characters[i] = str.charAt(i);
        }
        return characters;
    }
    // Method to compare two character arrays
    public static boolean compareCharArrays(char[] array1, char[] array2) {
        if (array1.length != array2.length) {
            return false; // If lengths are not equal, return false
        }
        for (int i = 0; i < array1.length; i++) {
            if (array1[i] != array2[i]) {
                return false; // Return false if any character does not match
            }
        }
        return true; // Return true if all characters match
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);  
        // Taking user input
        System.out.println("Enter a string: ");
        String inputString = sc.nextLine(); 
        // Get characters using user-defined method
        char[] userDefinedArray = getCharacters(inputString);
        // Get characters using built-in toCharArray() method
        char[] builtInArray = inputString.toCharArray(); 
        // Compare the two character arrays
        boolean areEqual = compareCharArrays(userDefinedArray, builtInArray);
        
        
        // Display the result
        if (areEqual) {
            System.out.println("Both character arrays are equal.");
        } else {
            System.out.println("Both character arrays are not equal.");
        }
        
        sc.close(); // Close the scanner
    }
}