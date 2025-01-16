import java.util.Scanner;
// Create class TemperatureConverter
public class TemperatureConverter { 
    public static void main(String[] args) { 
        // Create scanner object for user input
        Scanner sc = new Scanner(System.in); 
        // Ask user to choose the conversion direction
        System.out.print("Enter 1 to convert Fahrenheit to Celsius or 2 for Celsius to Fahrenheit: "); 
        int choice = sc.nextInt(); 
        // Based on user choice, call the appropriate conversion method
        if (choice == 1) { 
            System.out.print("Enter temperature in Fahrenheit: "); 
            double fahrenheit = sc.nextDouble(); 
            double celsius = fahrenheitToCelsius(fahrenheit); 
            System.out.println(fahrenheit + "°F is equal to " + celsius + "°C"); 
        } else if (choice == 2) { 
            System.out.print("Enter temperature in Celsius: "); 
            double celsius = sc.nextDouble(); 
            double fahrenheit = celsiusToFahrenheit(celsius); 
            System.out.println(celsius + "°C is equal to " + fahrenheit + "°F"); 
        } else { 
            System.out.println("Invalid choice!"); 
        } 
        // Close the scanner object
        sc.close(); 
    }

    // Method to convert Fahrenheit to Celsius
    public static double fahrenheitToCelsius(double fahrenheit) { 
        return (fahrenheit - 32) * 5 / 9; 
    }

    // Method to convert Celsius to Fahrenheit
    public static double celsiusToFahrenheit(double celsius) { 
        return (celsius * 9 / 5) + 32; 
    }
}
