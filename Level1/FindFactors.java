import java.util.Scanner;
//create class FindFactors
public class FindFactors {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter a number to find its factors: ");
		//Enter a number to find its factors
        int number = scanner.nextInt();
		//length of array be 10 -> maxFactor
        int maxFactor = 10;
		//Declaration of Array
        int[] factors = new int[maxFactor];
        int index = 0;
        // Find factors using loop
        for (int i = 1; i <= number; i++) {
            if (number % i == 0) {
                if (index == maxFactor) {
                    // Resize the array if needed
                    maxFactor *= 2;
                    int[] temp = new int[maxFactor];
                    System.arraycopy(factors, 0, temp, 0, factors.length);
                    factors = temp;
                }
                factors[index++] = i; // Store the factor
            }
        }
        // Display factors
        System.out.println("Factors of " + number + ":");
        for (int i = 0; i < index; i++) {
            System.out.print(factors[i] + " ");
        }
        System.out.println();
       
    }
}