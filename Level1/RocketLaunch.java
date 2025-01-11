import java.util.Scanner;
//Create class RocketLaunch
public class RocketLaunch {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Count down will start in reverse 
        System.out.println("Enter the countdown start value: ");
        int counter = scanner.nextInt();

        // count down is always positive so check the value
        counter = Math.abs(counter);  
        
        // Countdown using a while loop
        while (counter >= 1) {
            System.out.println("Countdown: " + counter);
            System.out.println(counter);
			counter--; // Decrease the counter using post decrement operator
        }

        // Close the scanner
        scanner.close();
    }
}