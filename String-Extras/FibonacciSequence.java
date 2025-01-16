import java.util.Scanner;
// Create class FibonacciSequence
public class FibonacciSequence { 
    public static void main(String[] args) { 
        // Create scanner object for user input
        Scanner sc = new Scanner(System.in); 
        // Get the number of terms from the user
        System.out.print("Enter the number of terms for the Fibonacci sequence: "); 
        int terms = sc.nextInt(); 
        // Call method to print the Fibonacci sequence
        printFibonacci(terms); 
        // Close the scanner object
        sc.close(); 
    }

    // Method to calculate and print the Fibonacci sequence up to n terms
    public static void printFibonacci(int n) { 
        int first = 0, second = 1; 
        System.out.print("Fibonacci Sequence: ");
        for (int i = 1; i <= n; i++) { 
            System.out.print(first + " "); 
            int next = first + second; 
            first = second; 
            second = next; 
        } 
        System.out.println(); 
    }
}
