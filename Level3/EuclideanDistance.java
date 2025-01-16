import java.util.Scanner;
//create class EuclideanDistance
public class EuclideanDistance {
    // Method to find the Euclidean distance between two points
    public static double calculateDistance(double x1, double y1, double x2, double y2) {
        return Math.sqrt(Math.pow(x2 - x1, 2) + Math.pow(y2 - y1, 2)); // Calculate distance
    }
    // Method to find the equation of a line given two points
    public static double[] findLineEquation(double x1, double y1, double x2, double y2) {
        double[] lineEquation = new double[2]; // Array to store slope and y-intercept
        double m; // Slope
        double b; // Y-intercept
        // Calculate slope (m)
        if (x2 - x1 != 0) { // Avoid division by zero
            m = (y2 - y1) / (x2 - x1);
        } else {
            m = Double.POSITIVE_INFINITY; // Vertical line
        }
        // Calculate y-intercept (b)
        b = y1 - m * x1;
        lineEquation[0] = m; // Store slope in the array
        lineEquation[1] = b; // Store y-intercept in the array
        return lineEquation; // Return the array containing slope and y-intercept
    }
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in); // Create a Scanner object
        // Input for the first point
        System.out.print("Enter x1: ");
        double x1 = scanner.nextDouble();
        System.out.print("Enter y1: ");
        double y1 = scanner.nextDouble();
        // Input for the second point
        System.out.print("Enter x2: ");
        double x2 = scanner.nextDouble();
        System.out.print("Enter y2: ");
        double y2 = scanner.nextDouble();
        // Calculate the Euclidean distance
        double distance = calculateDistance(x1, y1, x2, y2);
        System.out.printf("Euclidean Distance: %.2f\n", distance); // Print distance
        // Find the equation of the line
        double[] lineEquation = findLineEquation(x1, y1, x2, y2);
        double slope = lineEquation[0];
        double intercept = lineEquation[1];
        // Display the equation of the line
        if (slope == Double.POSITIVE_INFINITY) {
            System.out.println("The line is vertical.");
        } else {
            System.out.printf("Equation of the line: y = %.2fx + %.2f\n", slope, intercept); // Print equation
        }
        scanner.close(); // Close the scanner
    }
}