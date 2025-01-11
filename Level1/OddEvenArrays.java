import java.util.Scanner;
//create class OddEvenArrays
public class OddEvenArrays {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter a natural number: ");
        int number = scanner.nextInt();
        // to check for natural number
        if (number <= 0) {
            System.out.println("Error: Please enter a natural number.");
            return; // Exit the program
        }
        // Create arrays for odd and even numbers
        int[] oddNumbers = new int[number / 2 + 1];
        int[] evenNumbers = new int[number / 2 + 1];
        int oddIndex = 0, evenIndex = 0;
        // Differentiate odd and even arrays
        for (int i = 1; i <= number; i++) {
            if (i % 2 == 0) {
                evenNumbers[evenIndex++] = i; 
				// Save even number
            } else {
                oddNumbers[oddIndex++] = i; 
				// Save odd number
            }
        }
        // Print odd numbers using oddNumbers array 
        System.out.print("Odd numbers: ");
        for (int i = 0; i < oddIndex; i++) {
            System.out.print(oddNumbers[i] + " ");
        }
        System.out.println();

        // Print even numbers using evenNumbers array
        System.out.print("Even numbers: ");
        for (int i = 0; i < evenIndex; i++) {
            System.out.print(evenNumbers[i] + " ");
        }
        System.out.println();
    }
}