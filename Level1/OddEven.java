import java.util.Scanner;
//create class OddEven
public class OddEven {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Enter a number
        System.out.println("Enter a natural number: ");
        int number = scanner.nextInt();

        // Check if the user entered a natural number
        if (number < 1) {
            System.out.println("Please enter a natural number greater than 0.");
        } 
		else {
            // Iterate from 1 to the entered number
            for (int i = 1; i <= number; i++) {
                // Check if the number is odd or even
                if (i % 2 == 0) {
                    System.out.println(i + " is an even number.");
                } 
				else {
                    System.out.println(i + " is an odd number.");
                }
            }
        }

        // Close the scanner
        scanner.close();
    }
}