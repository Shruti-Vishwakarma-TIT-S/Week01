import java.util.Scanner;
//create class TableMultiplication
public class TableMultiplication {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
		//Enter number to print it's multiplication table
        System.out.println("Enter a number to print its multiplication table: ");
        int number = scanner.nextInt();
        int[] multiplicationResults = new int[10];
		// Calculate multiplication table using for loop
        for (int i = 1; i <= 10; i++) {
            multiplicationResults[i - 1] = number * i;
        }

        // Display the multiplication table
        for (int i = 0; i < multiplicationResults.length; i++) {
            System.out.println(number + " * " + (i + 1) + " = " + multiplicationResults[i]);
        }

        scanner.close();
    }
}