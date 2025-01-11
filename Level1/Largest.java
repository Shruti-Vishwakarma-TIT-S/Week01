import java.util.Scanner;
//Create class Largest
public class Largest {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // User will input three numerical values 
        System.out.println("Enter three numbers: ");
        double number1 = scanner.nextDouble();
        double number2 = scanner.nextDouble();
        double number3 = scanner.nextDouble();

        /*to check which number is the largest we need to perform operations
		like logical AND */
		
        boolean isFirstLargest = number1 > number2 && number1 > number3;
        boolean isSecondLargest = number2 > number1 && number2 > number3;
        boolean isThirdLargest = number3 > number1 && number3 > number2;

        //check conditions using if-else statements
		
		//Here we need to print true or false for each number so we will simply print the statements like below
        System.out.println("Is the first number the largest? " + isFirstLargest);
        System.out.println("Is the second number the largest? " + isSecondLargest);
        System.out.println("Is the third number the largest? " + isThirdLargest);

        // Close the scanner
        scanner.close();
    }
}