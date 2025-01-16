import java.util.Scanner;
// create a class Trigonometric
public class Trigonometric {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        // enter input for the angle in degrees
        System.out.print("Enter the angle in degrees: ");
        double angle = scanner.nextDouble();
        // Calculating trigonometric functions
        double[] results = calculateTrigonometricFunctions(angle);
        // Displaying the results
        System.out.println("Sine of degrees: "+ angle + " " + results[0]);
        System.out.println("Cosine of degrees: "+ angle + " " +results[1]);
        System.out.println("Tangent of degrees: "+ angle + " " + results[2]);
        scanner.close();
    }

    public static double[] calculateTrigonometricFunctions(double angle) {
        // Convert angle from degrees to radians
        double radians = Math.toRadians(angle);
        // Calculate sine, cosine, and tangent
        double sine = Math.sin(radians);
        double cosine = Math.cos(radians);
        double tangent = Math.tan(radians);
        // Return the results in an array
        return new double[]{sine, cosine, tangent};
    }
}