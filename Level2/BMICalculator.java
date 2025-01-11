import java.util.Scanner;
//create a class BMICalculator
public class BMICalculator {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        // Enter weight in kilograms and height in centimeters
        System.out.println("Enter your weight in kg and height in cm: ");
        double weight = sc.nextDouble();
        double heightCm = sc.nextDouble();

        //to convert height from cm to meters
        double heightMeters = heightCm / 100;

        // calculating BMI using the formula
        double bmi = weight / (heightMeters * heightMeters);

        //Determine weight status based on BMI
        String status;
        if (bmi <= 18.4) {
            status = "Underweight";
        } 
		else if (bmi <= 24.9) {
            status = "Normal";
        } 
		else if (bmi <= 39.9) {
            status = "Overweight";
        } 
		else {
            status = "Obese";
        }

        // Output the BMI and weight status
       
        System.out.printf("Your BMI: ", bmi);
        System.out.println("Weight Status: " + status);

        sc.close();
    }
}