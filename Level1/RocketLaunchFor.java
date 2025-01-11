import java.util.Scanner;
//Create class RocketLaunchFor
public class RocketLaunchFor {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Count down will start in reverse 
        System.out.println("Enter the countdown start value: ");
        int counter = scanner.nextInt();

        // count down is always positive so check the value
        counter = Math.abs(counter);  
        
        // Countdown using a for loop
        for (int i = counter; i>=1; i--) {
            System.out.println("Countdown: " + counter);
            System.out.println(i);
        }

        // Close the scanner
        scanner.close();
    }
}