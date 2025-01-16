import java.util.Scanner;
// Create class ReverseString
public class ReverseString {
    public static void main(String[] args) {
        // Create scanner object to take input from user
        Scanner sc = new Scanner(System.in);
        // Ask user to enter a string to reverse
        System.out.print("Enter a string to reverse: ");
        String input = sc.nextLine();
        // Call method to reverse the string
        String reversedString = reverseString(input);
        // Print the reversed string
        System.out.println("Reversed String: " + reversedString);
        // Close scanner after use
        sc.close();
    }
    // Method to reverse the string
    public static String reverseString(String input) {
        // Create an empty string to store the reversed string
        String reversed = "";
        // Loop through the string in reverse order and add each character to reversed
        for (int i = input.length() - 1; i >= 0; i--) {
            reversed += input.charAt(i);
        }
        // Return the reversed string
        return reversed;
    }
}
