import java.util.Scanner;
//create class StoreValues
public class StoreValues {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        double[] numbers = new double[10];
        double total = 0.0;
        int index = 0;

        // Infinite loop to take user input
        while (true) {
            if (index >= 10) {
                System.out.println("Maximum limit of 10 numbers reached.");
                break;
            }
            System.out.print("Enter a number : ");
            double input = scanner.nextDouble();
            if (input <= 0) {
                break; 
            }
			// Store the number in the array
            numbers[index] = input;
			//Add to total
            total += input; 
			// Increment index
            index++; 
        }
        // Display all numbers and the total
        System.out.println("Numbers entered:");
        for (int i = 0; i < index; i++) {
            System.out.println(numbers[i]);
        }
        System.out.println("Total: " + total);

        scanner.close();
    }
}