import java.util.Scanner;
//create a class WindChillCalculator
public class WindChillCalculator {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        // Taking user input for temperature and wind speed
        System.out.println("Enter the temperature in Fahrenheit: ");
        double temperature = scanner.nextDouble();      
        System.out.println("Enter the wind speed in miles per hour: ");
        double windSpeed = scanner.nextDouble();
        // Calculating wind chill temperature
        double windChill = calculateWindChill(temperature, windSpeed);
        // Displaying the result
        System.out.println("The wind chill temperature is: "+ windChill);
        scanner.close();
    }
    public static double calculateWindChill(double temperature, double windSpeed) {
        // Wind chill formula
        return 35.74 + 0.6215 * temperature + (0.4275 * temperature - 35.75) * Math.pow(windSpeed, 0.16);
    }
}