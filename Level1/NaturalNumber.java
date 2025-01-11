import java.util.Scanner;
//craete a class name NaturalNumber
public class NaturalNumber {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        // Take a number from the user
        System.out.println("Enter a natural number: ");
        double number = sc.nextDouble();

        //if the number is a natural number
        if (number > 0 && number % 1 == 0) {
			
            // Calculate the sum of n natural numbers
			//Convert floating point values in integer
            int n = (int) number;
            int sum = n * (n + 1) / 2;

            // Output the result for if statement if it is true
            System.out.println("The sum of " + number + " natural numbers is " + sum);
        } 
		else {
            // Output this value if, if statement condition is false
            System.out.println("The number " + number + " is not a natural number");
        }

        // Close the scanner
        sc.close();
    }
}