import java.util.Scanner;
//craete a class name NaturalNumberFor
public class NaturalNumberFor {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        // Take a number from the user
        System.out.println("Enter a natural number: ");
        double number = sc.nextDouble();
		double total = 0.0;
		double n = number;
		for(double i = number; number >= 1; number--) {
           total += number;
		  
        }
		double sum = n * (n + 1) / 2;
		
        //if the number is a natural number and sum = total
        if (sum == total){ 
            // Output the result for if statement if it is true
            System.out.println("The answer was correct sum of natural number would be "+ total);
        } 
		else {
            // Output this value if, if statement condition is false
            System.out.println("The answer was incorrect" );
        }

        // Close the scanner
        sc.close();
    }
}