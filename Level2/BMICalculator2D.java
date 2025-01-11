import java.util.Scanner;
public class BMICalculator2D {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        // Take input for the number of persons
        System.out.print("Enter the number of persons: ");
        int numberOfPersons = scanner.nextInt();
        // Create a multi-dimensional array to store weight, height, and BMI
        double[][] personData = new double[numberOfPersons][3]; // [][0] = weight, [][1] = height, [][2] = BMI
        String[] weightStatus = new String[numberOfPersons];
        // Take input for weight and height of each person
        for (int i = 0; i < numberOfPersons; i++) {
            // Input weight
            double weight;
            do {
                System.out.print("Enter weight (in kg) for person " + (i + 1) + ": ");
                weight = scanner.nextDouble();
                if (weight < 0) {
                    System.out.println("Please enter a positive value for weight.");
                }
            } while (weight < 0);
            personData[i][0] = weight; // Store weight
            // Input height
            double height;
            do {
                System.out.print("Enter height (in meters) for person " + (i + 1) + ": ");
                height = scanner.nextDouble();
                if (height < 0) {
                    System.out.println("Please enter a positive value for height.");
                }
            } while (height < 0);
            personData[i][1] = height; // Store height
            // Calculate BMI
            personData[i][2] = weight / (height * height); // BMI = weight / (height^2)
            // Determine weight status based on BMI
            if (personData[i][2] <= 18.4) {
                weightStatus[i] = "Underweight";
            } else if (personData[i][2] >= 18.5 && personData[i][2] <= 24.9) {
                weightStatus[i] = "Normal";
            } else if (personData[i][2] >= 25.0 && personData[i][2] <= 39.9) {
                weightStatus[i] = "Overweight";
            } else {
                weightStatus[i] = "Obese";
            }
        }
        for (int i = 0; i < numberOfPersons; i++) {
            System.out.println(personData[i][1]+", "+ personData[i][0]+", "+ personData[i][2]+", "+weightStatus[i]);
        }
        // Close the scanner
        scanner.close();
    }
}