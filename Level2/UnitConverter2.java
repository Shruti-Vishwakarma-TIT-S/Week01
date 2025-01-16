import java.util.*;
// create a class UnitConverter2
public class UnitConverter2 {
    // Method to convert Fahrenheit to Celsius
    public static double convertFahrenheitToCelsius(double fahrenheit) {
        return (fahrenheit - 32) * 5 / 9; // Convert Fahrenheit to Celsius
    }
    // Method to convert Celsius to Fahrenheit
    public static double convertCelsiusToFahrenheit(double celsius) {
        return (celsius * 9 / 5) + 32; // Convert Celsius to Fahrenheit
    }
    // Method to convert pounds to kilograms
    public static double convertPoundsToKilograms(double pounds) {
        double poundsToKilograms = 0.453592; // 1 pound = 0.453592 kilograms
        return pounds * poundsToKilograms; // Convert pounds to kilograms
    }
    // Method to convert kilograms to pounds
    public static double convertKilogramsToPounds(double kilograms) {
        double kilogramsToPounds = 2.20462; // 1 kilogram = 2.20462 pounds
        return kilograms * kilogramsToPounds; // Convert kilograms to pounds
    }
    // Method to convert gallons to liters
    public static double convertGallonsToLiters(double gallons) {
        double gallonsToLiters = 3.78541; // 1 gallon = 3.78541 liters
        return gallons * gallonsToLiters; // Convert gallons to liters
    }
    // Method to convert liters to gallons
    public static double convertLitersToGallons(double liters) {
        double litersToGallons = 0.264172; // 1 liter = 0.264172 gallons
        return liters * litersToGallons; // Convert liters to gallons
    }
    // Main method for testing the UnitConverter class
    public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
        // Test the conversion methods
		System.out.println("Enter temperature in fahrenheit ");
        double fahrenheit = sc.nextDouble();
        double celsius = convertFahrenheitToCelsius(fahrenheit);
        System.out.println(fahrenheit+" F is equal to "+ celsius +" C ");
		
		System.out.println("Enter temperature in celsius ");
        double celsiusInput = sc.nextDouble();
        double fahrenheitFromCelsius = convertCelsiusToFahrenheit(celsiusInput);
        System.out.println(celsiusInput+" C is equal to "+ fahrenheitFromCelsius +" F ");

        System.out.println("Enter pounds ");
		double pounds = sc.nextDouble();
        double kilograms = convertPoundsToKilograms(pounds);
        System.out.println(pounds+" pounds is equal to "+ kilograms +" kilograms ");

        System.out.println("Enter kilograms ");
		double kilogramsInput = sc.nextDouble();
        double poundsFromKilograms = convertKilogramsToPounds(kilogramsInput);
        System.out.println(kilogramsInput+" kilograms is equal to "+ poundsFromKilograms +" pounds ");

        System.out.println("Enter gallons ");
		double gallons = sc.nextDouble();
        double liters = convertGallonsToLiters(gallons);
        System.out.println(gallons+" gallons is equal to "+ liters +" liters ");

        System.out.println("Enter litersInput ");
		double litersInput = sc.nextDouble();
        double gallonsFromLiters = convertLitersToGallons(litersInput);
        System.out.println(litersInput+" liters is equal to "+ gallonsFromLiters +" gallonsFromLiters ");
    }
}