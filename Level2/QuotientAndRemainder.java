import java.util.Scanner;
//create a class name QuotientAndRemainder
public class QuotientAndRemainder {
    public static void main(String[] args) {
		//Initializing object of Scanner Class
        Scanner sc = new Scanner(System.in);

        // Enter two numbers as input
        System.out.print("Enter two numbers: ");
        int numberOne = sc.nextInt();
        int numberTwo = sc.nextInt();

        // Calculating the quotient and remainder
        int quotientOfNumbers = numberOne / numberTwo;
        int remainderOfNumbers = numberOne % numberTwo;

        // Printing the result be like
        System.out.println("The Quotient is " + quotientOfNumbers + " and Reminder is " + remainderOfNumbers + 
                           " of two number " + numberOne + " and " + numberTwo);
		sc.close();  
    }
}
