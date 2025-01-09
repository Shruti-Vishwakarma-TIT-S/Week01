import java.util.Scanner;
//Create class name as BasicCalculator
public class BasicCalculator {
    public static void main(String[] args) {
        // Create a Scanner object 
        Scanner scanner = new Scanner(System.in);

        // Take two nos from user
        System.out.print("Enter the first number : ");
        double number1 = scanner.nextDouble();
        System.out.print("Enter the second number : ");
        double number2 = scanner.nextDouble();

        // Do arithmetic operations like addition, subtraction, multiplication and division
        double addition = number1 + number2;
        double subtraction = number1 - number2;
        double multiplication = number1 * number2;
        double division = number1 / number2;

        // Print the output be like
        System.out.println("The addition, subtraction, multiplication and division value of 2 numbers " + number1 + " and "+ number2 +" is " + addition + ", "+ subtraction+", "+ multiplication+", "+ division);
      
        // Close the scanner
        scanner.close();
    }
}