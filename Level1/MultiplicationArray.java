import java.util.Scanner;
//create a class MultiplicationArray
public class MultiplicationArray {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        // Enter input from the user
        System.out.println("Enter a number:  ");
        int number = scanner.nextInt();
        // Define an array to store the multiplication results for 6, 7, 8, and 9
        int[] multiplicationResult = new int[4];  
        // Calculate the multiplication table from 6 to 9
        for (int i = 6; i <= 9; i++) {
            multiplicationResult[i - 6] = number * i; 
        }
        // print the results
        for (int i = 6; i <= 9; i++) {
            System.out.println(number + " * " + i + " = " + multiplicationResult[i - 6]);
        }

        // Close the scanner
        scanner.close();
    }
}