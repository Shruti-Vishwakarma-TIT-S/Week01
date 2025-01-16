import java.util.Scanner;
//create a class ArrayIndexOutOfBoundsExceptionNew
public class ArrayIndexOutOfBoundsExceptionNew {
    // Method to generate ArrayIndexOutOfBoundsException
    public static void generateArrayIndexOutOfBoundsException(String[] names) {
        // Attempting to access an index larger than the length of the array
        System.out.println("Generating ArrayIndexOutOfBoundsException:");
		// This will throw ArrayIndexOutOfBoundsException
        System.out.println("Accessing index " + names.length + ": " + names[names.length]); 
    }
    // Method to demonstrate handling of ArrayIndexOutOfBoundsException
    public static void handleArrayIndexOutOfBoundsException(String[] names) {
        try {
            // Attempting to access an index larger than the length of the array
            System.out.println("Handling ArrayIndexOutOfBoundsException:");
			// This will throw ArrayIndexOutOfBoundsException
            System.out.println("Accessing index " + names.length + ": " + names[names.length]); 
        } catch (ArrayIndexOutOfBoundsException e) {
            // Handle the ArrayIndexOutOfBoundsException
            System.out.println("Caught an ArrayIndexOutOfBoundsException: " + e.getMessage());
        } catch (RuntimeException e) {
            // Handle any other RuntimeException
            System.out.println("Caught a RuntimeException: " + e.getMessage());
        }
    }
	//main method
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);        
        // Taking user input for the array size
        System.out.println("Enter the number of names: ");
        int size = sc.nextInt();
        sc.nextLine(); 
        String[] names = new String[size];
        // Taking user input for names
        for (int i = 0; i < size; i++) {
            System.out.println("Enter name " + (i + 1) + ": ");
            names[i] = sc.nextLine();
        }
        // Call the method to generate the exception
        System.out.println("Demonstrating ArrayIndexOutOfBoundsException:");
        try {
			// This will cause the program to crash
            generateArrayIndexOutOfBoundsException(names); 
        } catch (ArrayIndexOutOfBoundsException e) {
            System.out.println("Caught an ArrayIndexOutOfBoundsException during demonstration: " + e.getMessage());
        } catch (RuntimeException e) {
            System.out.println("Caught a RuntimeException during demonstration: " + e.getMessage());
        }
        // Call the method to handle the exception
        System.out.println("\nHandling ArrayIndexOutOfBoundsException:");
		// This will catch the exception and handle it
        handleArrayIndexOutOfBoundsException(names); 
        sc.close(); // Close the scanner
    }
}