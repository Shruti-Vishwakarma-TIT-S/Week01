import java.util.Scanner;
//create a class OTPGenerator
public class OTPGenerator {
    // Method to generate a 6-digit OTP number
    public static int generateOTP() {
        // Generate a random number between 100000 and 999999
        return (int) (Math.random() * 900000) + 100000;
    }
    // Method to check if the OTP numbers are unique
    public static boolean areUniqueOTPs(int[] otps) {
        // Loop through the array to check for duplicates
        for (int i = 0; i < otps.length; i++) {
            for (int j = i + 1; j < otps.length; j++) {
                if (otps[i] == otps[j]) { // If a duplicate is found
                    return false; // Return false
                }
            }
        }
        return true; // All OTPs are unique
    }
    public static void main(String[] args) {
        int[] otps = new int[10]; // Array to store 10 OTP numbers
        // Generate 10 OTP numbers
        for (int i = 0; i < 10; i++) {
            otps[i] = generateOTP(); // Generate and store OTP
        }
        // Display the generated OTPs
        System.out.println("Generated OTPs:");
        for (int otp : otps) {
            System.out.println(otp); // Print each OTP
        }
        // Check if the OTPs are unique
        boolean unique = areUniqueOTPs(otps);
        if (unique) {
            System.out.println("All OTPs are unique.");
        } else {
            System.out.println("There are duplicate OTPs.");
        }
    }
}