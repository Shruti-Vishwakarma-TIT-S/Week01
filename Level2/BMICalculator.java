import java.util.Scanner;
//class BMICalculator
public class BMICalculator {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        //Enter input for the number of persons
        System.out.println("Enter the number of persons: ");
        int numberOfPersons = scanner.nextInt();
        // Create arrays to store weight, height, BMI, and weight status
        double[] weights = new double[numberOfPersons];
        double[] heights = new double[numberOfPersons];
        double[] bmiValues = new double[numberOfPersons];
        String[] weightStatus = new String[numberOfPersons];
        // Take input for weight and height of each person
        for (int i = 0; i < numberOfPersons; i++) {
            System.out.print("Enter weight (in kg) for person " + (i + 1) + ": ");
            weights[i] = scanner.nextDouble();
            System.out.print("Enter height (in meters) for person " + (i + 1) + ": ");
            heights[i] = scanner.nextDouble();
            // Calculate BMI
            bmiValues[i] = weights[i] / (heights[i] * heights[i]);
            // Determine weight status based on BMI
            if (bmiValues[i] <= 18.4) {
                weightStatus[i] = "Underweight";
            } else if (bmiValues[i] >= 18.5 && bmiValues[i] <= 24.9) {
                weightStatus[i] = "Normal";
            } else if (bmiValues[i] >= 25.0 && bmiValues[i] <= 39.9) {
                weightStatus[i] = "Overweight";
            } else {
                weightStatus[i] = "Obese";
            }
        }
        System.out.println("Height, Weight, BMI, Weight Status");
        for (int i = 0; i < numberOfPersons; i++) {
            System.out.println(heights[i]+", "+ weights[i]+", "+ bmiValues[i]+", "+ weightStatus[i]);
        }
        // Close the scanner
        scanner.close();
    }
}