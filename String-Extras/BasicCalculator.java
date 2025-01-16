import java.util.Scanner;
// Create class BasicCalculator
public class BasicCalculator { 
    public static void main(String[] args) { 
        // Create scanner object for user input
        Scanner sc = new Scanner(System.in); 
        // Prompt user to choose an operation
        System.out.println("Choose an operation: ");
        System.out.println("1. Addition");
        System.out.println("2. Subtraction");
        System.out.println("3. Multiplication");
        System.out.println("4. Division");
        System.out.print("Enter your choice (1-4): "); 
        int choice = sc.nextInt(); 
        // Get two numbers from the user
        System.out.print("Enter the first number: "); 
        double num1 = sc.nextDouble(); 
        System.out.print("Enter the second number: "); 
        double num2 = sc.nextDouble(); 
        double result = 0; 
        // Perform the selected operation
        switch (choice) { 
            case 1: 
                result = add(num1, num2); 
                break; 
            case 2: 
                result = subtract(num1, num2); 
                break; 
            case 3: 
                result = multiply(num1, num2); 
                break; 
            case 4: 
                if (num2 != 0) { 
                    result = divide(num1, num2); 
                } else { 
                    System.out.println("Error: Division by zero is not allowed."); 
                    return; 
                } 
                break; 
            default: 
                System.out.println("Invalid choice!"); 
                return; 
        } 
        // Display the result
        System.out.println("The result is: " + result); 
        // Close the scanner object
        sc.close(); 
    }

    // Method to add two numbers
    public static double add(double a, double b) { 
        return a + b; 
    }

    // Method to subtract two numbers
    public static double subtract(double a, double b) { 
        return a - b; 
    }

    // Method to multiply two numbers
    public static double multiply(double a, double b) { 
        return a * b; 
    }

    // Method to divide two numbers
    public static double divide(double a, double b) { 
        return a / b; 
    }
}
