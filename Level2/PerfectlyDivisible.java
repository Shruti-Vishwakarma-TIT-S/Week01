import java.util.Scanner;
//create class called PerfectlyDivisible
public class PerfectlyDivisible {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);

        //take input as number
        System.out.println("Enter a number: ");
        int number = s.nextInt();

        // Run a for loop to find factors
        for (int i = 1; i <=  number; i++) {
            // Check if the number is perfectly divisible by i
            if (number % i == 0) {
                System.out.println(i); // Print the factor
            }
        }
       

        // Close the scanner
        s.close();
    }
}