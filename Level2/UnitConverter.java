import java.util.Scanner;
//create a class UnitConverter
public class UnitConverter {
    // Method to convert kilometers to miles
    public static double convertKmToMiles(double km) {
        double kmToMiles = 0.621371;
        return km * kmToMiles; // Convert kilometers to miles
    }
    // Method to convert miles to kilometers
    public static double convertMilesToKm(double miles) {
        double milesToKm = 1.60934;
        return miles * milesToKm; // Convert miles to kilometers
    }
    // Method to convert meters to feet
    public static double convertMetersToFeet(double meters) {
        double metersToFeet = 3.28084;
        return meters * metersToFeet; // Convert meters to feet
    }
    // Method to convert feet to meters
    public static double convertFeetToMeters(double feet) {
        double feetToMeters = 0.3048;
        return feet * feetToMeters; // Convert feet to meters
    }
    // Main method for testing the UnitConverter class
    public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
        // Test the conversion methods
		System.out.println("Enter kilometers ");
        double km = sc.nextDouble(); 
        double miles = convertKmToMiles(km);
        System.out.println(km+" kilometers is equal to "+ miles +" miles ");
		
		System.out.println("Enter miles ");
        double milesInput = sc.nextDouble();
        double kmFromMiles = convertMilesToKm(milesInput);
        System.out.println(milesInput+" miles is equal to "+ kmFromMiles +" kilometers ");
		
		System.out.println("Enter meters ");
        double meters = sc.nextDouble();
        double feet = convertMetersToFeet(meters);
        System.out.println(meters+ " meters is equal to "+feet+" feet");
		
		System.out.println("Enter feet ");
        double feetInput = sc.nextDouble();
        double metersFromFeet = convertFeetToMeters(feetInput);
        System.out.println(feetInput+ " feet is equal to "+metersFromFeet+" meters");
    }
}