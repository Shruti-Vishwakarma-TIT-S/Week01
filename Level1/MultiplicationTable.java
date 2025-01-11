import java.util.Scanner;
//create class name MultiplicationTable 
public class MultiplicationTable {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Enter a number
        System.out.println("Enter a number to find its multiplication table from 6 to 9: ");
        int number = scanner.nextInt();

        // print the multiplication table from 6 to 9
        for (int i = 6; i <= 9; i++) {
            int result = number * i; // Calculate the multiplication
            System.out.println(number + " * " + i + " = " + result); // Print the result
        }

        // Close the scanner
        scanner.close();
    }
}