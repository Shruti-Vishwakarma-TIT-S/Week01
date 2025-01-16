import java.util.Scanner;
// create a class CollinearPoints
public class CollinearPoints {
    // Method to check if three points are collinear using the slope formula
    public static boolean areCollinearBySlope(double x1, double y1, double x2, double y2, double x3, double y3) {
        // Calculate slopes
        double slopeAB = (y2 - y1) / (x2 - x1);
        double slopeBC = (y3 - y2) / (x3 - x2);
        double slopeAC = (y3 - y1) / (x3 - x1);
        // Check if slopes are equal
        return (slopeAB == slopeBC) && (slopeAB == slopeAC);
    }
    // Method to check if three points are collinear using the area of the triangle formula
    public static boolean areCollinearByArea(double x1, double y1, double x2, double y2, double x3, double y3) {
        // Calculate the area of the triangle
        double area = 0.5 * (x1 * (y2 - y3) + x2 * (y3 - y1) + x3 * (y1 - y2));
        // Points are collinear if the area is 0
        return area == 0;
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
        // Input for the third point
        System.out.print("Enter x3: ");
        double x3 = scanner.nextDouble();
        System.out.print("Enter y3: ");
        double y3 = scanner.nextDouble();
        // Check if the points are collinear using slope
        boolean collinearBySlope = areCollinearBySlope(x1, y1, x2, y2, x3, y3);
        if (collinearBySlope) {
            System.out.println("The points are collinear (using slope).");
        } else {
            System.out.println("The points are not collinear (using slope).");
        }
        // Check if the points are collinear using area
        boolean collinearByArea = areCollinearByArea(x1, y1, x2, y2, x3, y3);
        if (collinearByArea) {
            System.out.println("The points are collinear (using area).");
        } else {
            System.out.println("The points are not collinear (using area).");
        }
        // Sample check for points A(2, 4), B(4, 6), C(6, 8)
        double sampleX1 = 2, sampleY1 = 4;
        double sampleX2 = 4, sampleY2 = 6;
        double sampleX3 = 6, sampleY3 = 8;
        boolean sampleCollinearBySlope = areCollinearBySlope(sampleX1, sampleY1, sampleX2, sampleY2, sampleX3, sampleY3);
        boolean sampleCollinearByArea = areCollinearByArea(sampleX1, sampleY1, sampleX2, sampleY2, sampleX3, sampleY3);
        if (sampleCollinearBySlope && sampleCollinearByArea) {
            System.out.println("The sample points A(2, 4), B(4, 6), C(6, 8) are collinear.");
        } else {
            System.out.println("The sample points A(2, 4), B(4, 6), C(6, 8) are not collinear.");
        }
        scanner.close(); // Close the scanner
    }
}