import java.util.*;
// craete a class UnitConverter1
 public class UnitConverter1 {
    // Method to convert yards to feet
    public static double convertYardsToFeet(double yards) {
        double yardsToFeet = 3.0; // 1 yard = 3 feet
        return yards * yardsToFeet; // Convert yards to feet
    }
    // Method to convert feet to yards
    public static double convertFeetToYards(double feet) {
        double feetToYards = 0.333333; // 1 foot = 1/3 yard
        return feet * feetToYards; // Convert feet to yards
    }
    // Method to convert meters to inches
    public static double convertMetersToInches(double meters) {
        double metersToInches = 39.3701; // 1 meter = 39.3701 inches
        return meters * metersToInches; // Convert meters to inches
    }
    // Method to convert inches to meters
    public static double convertInchesToMeters(double inches) {
        double inchesToMeters = 0.0254; // 1 inch = 0.0254 meters
        return inches * inchesToMeters; // Convert inches to meters
    }
    // Method to convert inches to centimeters
    public static double convertInchesToCentimeters(double inches) {
        double inchesToCm = 2.54; // 1 inch = 2.54 centimeters
        return inches * inchesToCm; // Convert inches to centimeters
    }
    // Main method for testing the UnitConverter class
    public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
        // Test the conversion methods
		System.out.println("Enter yards ");
        double yards = scanner.nextDouble();
        double feet = convertYardsToFeet(yards);
        System.out.println(yards+" yards is equal to "+ feet +" feet ");
		
		System.out.println("Enter feet ");
        double feetInput = scanner.nextDouble();
        double yardsFromFeet = convertFeetToYards(feetInput);
        System.out.println(feetInput+" feet is equal to "+ yardsFromFeet +" yards ");

        System.out.println("Enter meters ");
		double meters = scanner.nextDouble();
        double inches = convertMetersToInches(meters);
        System.out.println(meters+" meters is equal to "+ inches +" inches ");

        System.out.println("Enter inches ");
		double inchesInput = scanner.nextDouble();
        double metersFromInches = convertInchesToMeters(inchesInput);
        System.out.println(inchesInput+" inches is equal to "+ metersFromInches +" meters ");

        System.out.println("Enter inches ");
		double inchesForCm = scanner.nextDouble();
        double centimeters = convertInchesToCentimeters(inchesForCm);
        System.out.println(inchesForCm+" inches is equal to "+ centimeters +" centimeters ");
    }
}