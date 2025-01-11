import java.util.Scanner;
//create a class LargestAndSecondLargest
public class LargestAndSecondLargest {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);      
        // Take user input for the number
        System.out.print("Enter a number: ");
        int number = scanner.nextInt();
        // Define an array to store the digits
        int maxDigits = 10;
        int[] digits = new int[maxDigits];
        int index = 0;
        // Extract digits and store them in the array
        while (number != 0) {
            if (index < maxDigits) {
                digits[index] = number % 10; 
                number /= 10; 
                index++;
            } else {
                break; 
            }
        }
        // Variables to store the largest and second largest digits
        int largest = -1;
        int secondLargest = -1;
        // Loop through the array to find the largest and second largest digits
        for (int i = 0; i < index; i++) {
            if (digits[i] > largest) {
                secondLargest = largest; // Update second largest
                largest = digits[i]; // Update largest
            } else if (digits[i] > secondLargest && digits[i] != largest) {
                secondLargest = digits[i]; // Update second largest
            }
        }
        // Display the results
        if (largest != -1) {
            System.out.println("Largest digit: " + largest);
        } else {
            System.out.println("No digits found.");
        }
        if (secondLargest != -1) {
            System.out.println("Second largest digit: " + secondLargest);
        } else {
            System.out.println("No second largest digit found.");
        }
        
	}	
}