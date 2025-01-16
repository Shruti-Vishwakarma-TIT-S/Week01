import java.util.Scanner;
//create a class BodyMassIndex
public class BodyMassIndex {
    // Method to find the BMI and status of every person
    public static String[][] calculateBMI(double[][] weightHeight) {
		// 2D array for height, weight, BMI, and status
        String[][] bmiResults = new String[weightHeight.length][4]; 
        for (int i = 0; i < weightHeight.length; i++) {
            double weight = weightHeight[i][0]; // Weight in kg
			// Convert height from cm to meters
            double heightInMeters = weightHeight[i][1] / 100; 
			// Calculate BMI
            double bmi = weight / (heightInMeters * heightInMeters); 
            // Determine BMI status
            String status;
            if (bmi <= 18.4) {
                status = "Underweight";
            } else if (bmi >= 18.5 && bmi <= 24.9) {
                status = "Normal";
            } else if (bmi >= 25.0 && bmi <= 39.9) {
                status = "Overweight";
            } else {
                status = "Obese";
            }
            // Store results in the array
			// Height
            bmiResults[i][0] = String.valueOf(weightHeight[i][1]); 
			// Weight
            bmiResults[i][1] = String.valueOf(weightHeight[i][0]);
			// BMI rounded to 2 decimal places
            bmiResults[i][2] = String.format("%.2f", bmi);
            bmiResults[i][3] = status; // Status
        }
        return bmiResults; // Return the 2D array of results
    }
    // Method to display the results in a tabular format
    public static void displayResults(String[][] bmiResults) {
        System.out.println("Height (cm)  Weight (kg)  BMI      Status");
        System.out.println("------------------------------------------");
        for (String[] row : bmiResults) {
            System.out.println(row[0] + "           " + row[1] + "          " + row[2] + "      " + row[3]);
        }
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        double[][] weightHeight = new double[10][2]; // 2D array for weight and height
        // Taking user input for weight and height
        for (int i = 0; i < 10; i++) {
            System.out.println("Enter weight (in kg) for person " + (i + 1) + ": ");
            weightHeight[i][0] = sc.nextDouble(); // Weight
            System.out.println("Enter height (in cm) for person " + (i + 1) + ": ");
            weightHeight[i][1] = sc.nextDouble(); // Height
        }
        // Calculate BMI and status
        String[][] bmiResults = calculateBMI(weightHeight);
        // Display the results
        displayResults(bmiResults);
        // Close the scanner
        sc.close();
    }
}