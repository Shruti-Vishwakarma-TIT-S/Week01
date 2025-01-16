import java.util.Scanner;
//create a class Quadratic
public class Quadratic {
	public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        // Enter value for coefficients a, b, and c
        System.out.print("Enter coefficient a, b, c: ");
        double a = scanner.nextDouble();
        double b = scanner.nextDouble();
        double c = scanner.nextDouble();
        // Finding the roots
        double[] roots = findRoots(a, b, c);
        // Displaying the results
        if (roots.length == 0) {
            System.out.println("The equation has no real roots.");
        } 
		//if condition fails then else-if condition will get checked
		else if (roots.length == 1) {
            System.out.println("The equation has one root: x = "+ roots[0]);
        } 
		//else at last else condition will run if above cases fail
		else {
            System.out.println("The equation has two roots: "+ roots[0] +" "+roots[1]);
        }
        scanner.close(); 	
    }
    // Method to find the roots of the quadratic equation
    public static double[] findRoots(double a, double b, double c) {
        double delta = Math.pow(b, 2) - 4 * a * c; // Calculate the discriminant
        if (delta > 0) {
            // Two distinct roots
            double root1 = (-b + Math.sqrt(delta)) / (2 * a);
            double root2 = (-b - Math.sqrt(delta)) / (2 * a);
			// Return the roots in an array
            return new double[]{root1, root2}; 
			
        } 
		else if (delta == 0) {
            // One root
            double root = -b / (2 * a);
			// Return the single root in an array
            return new double[]{root}; 
        } 
		else {
            // No real roots return an empty array
            return new double[0]; 
        }
    } 
}