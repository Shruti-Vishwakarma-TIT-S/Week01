import java.util.Scanner;
// Create class FactorialUsingRecursion
public class FactorialUsingRecursion { 
    public static void main(String[] args) { 
        // Create scanner object for user input
        Scanner sc = new Scanner(System.in); 
        // Get the number from the user
        System.out.print("Enter a number to calculate its factorial: "); 
        int number = sc.nextInt(); 
        // Call method to calculate the factorial
        int result = calculateFactorial(number); 
        // Display the result
        System.out.println("The factorial of " + number + " is: " + result); 
        // Close the scanner object
        sc.close(); 
    }
    // Method to calculate the factorial of a number using recursion
    public static int calculateFactorial(int n) { 
        if (n == 0 || n == 1) { 
            return 1; 
        } 
        return n * calculateFactorial(n - 1); 
    }
}
