import java.util.Scanner;
//create a class SumUntilZero
public class SumUntilZero {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Initialize total value as 0.0 and take user input
        double total = 0.0;
		System.out.println("Enter number: ");
        double inputUser = scanner.nextDouble();

       // Use a while loop to continue until the user enters 0
        while (inputUser > 0) {
			
			// Add the user input to the total
            total += inputUser;
			
			System.out.println("Enter a number: ");
            inputUser = scanner.nextDouble();
			// Check if the user entered 0
            if (inputUser == 0) {
                break; // Exit the loop if the input is 0
            }
            
        }

        // Display the total value
        System.out.println("The total sum is: " + total);

        // Close the scanner
        scanner.close();
    }
}