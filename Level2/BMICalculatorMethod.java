import java.util.Scanner;
//create a class BMICalculatorMethod
public class BMICalculatorMethod {
    // Method to calculate BMI for each person and populate the array
    public static void calculateBMI(double[][] data) {
        for (int i = 0; i < data.length; i++) {
			// Weight in kg
            double weight = data[i][0]; 
            double heightInMeters = data[i][1] / 100; 
			// Convert height from cm to meters
            double bmi = weight / (heightInMeters * heightInMeters); 
			// Calculate BMI
            data[i][2] = bmi; 
        }
    }
    // Method to determine BMI status for each person
    public static String[] determineBMIStatus(double[][] data) {
        String[] status = new String[data.length]; 
        for (int i = 0; i < data.length; i++) {
			//calculate BMI using if else
            double bmi = data[i][2]; 
            if (bmi <= 18.4) {
                status[i] = "Underweight";
            } 
			else if (bmi >= 18.5 && bmi <= 24.9) {
                status[i] = "Normal";
            } 
			else if (bmi >= 25.0 && bmi <= 39.9) {
                status[i] = "Overweight";
            } 
			else {
                status[i] = "Obese";
            }
        }
		// Return the array of BMI statuses
        return status; 
    }
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
		//2D array initialized
        double[][] data = new double[10][3]; 
        //taking user input for weight and height
        for (int i = 0; i < data.length; i++) {
            System.out.print("Enter weight (in kg) for person " + (i + 1) + ": ");
			//store weight in the first column
            data[i][0] = scanner.nextDouble(); 
            System.out.print("Enter height (in cm) for person " + (i + 1) + ": ");
			//store height in the second column
            data[i][1] = scanner.nextDouble(); 
        }
        // Calculate BMI for each person
        calculateBMI(data);
        // Determine BMI status for each person
        String[] bmiStatus = determineBMIStatus(data);
        // Display the results
        System.out.println("\nBMI Results:");
        for (int i = 0; i < data.length; i++) {
            System.out.println(" Weight "+ data[i][0] + " Height "+  data[i][1] + " BMI "+ data[i][2] + " Status "+ bmiStatus[i]);
        }
        scanner.close(); // Close the scanner
    }
}