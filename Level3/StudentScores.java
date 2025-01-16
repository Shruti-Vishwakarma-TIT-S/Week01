import java.util.Random;
import java.util.Scanner;
//create a clss StudentScores
public class StudentScores {
    // Method to generate random 2-digit scores for Physics, Chemistry, and Math
    public static int[][] generateScores(int numberOfStudents) {
        Random random = new Random();
        int[][] scores = new int[numberOfStudents][3]; // 2D array to store scores for each student
        for (int i = 0; i < numberOfStudents; i++) {
            scores[i][0] = random.nextInt(90) + 10; // Physics score (10-99)
            scores[i][1] = random.nextInt(90) + 10; // Chemistry score (10-99)
            scores[i][2] = random.nextInt(90) + 10; // Math score (10-99)
        }
        return scores; // Return the 2D array of scores
	}
    // Method to calculate total, average, and percentage for each student
    public static double[][] calculateResults(int[][] scores) {
        double[][] results = new double[scores.length][4]; // 2D array to store total, average, and percentage
        for (int i = 0; i < scores.length; i++) {
            double total = scores[i][0] + scores[i][1] + scores[i][2]; // Calculate total
            double average = total / 3; // Calculate average
            double percentage = (total / 300) * 100; // Calculate percentage

            // Round off values to 2 decimal places
            results[i][0] = Math.round(total * 100.0) / 100.0; // Total
            results[i][1] = Math.round(average * 100.0) / 100.0; // Average
            results[i][2] = Math.round(percentage * 100.0) / 100.0; // Percentage
          
        }
        return results; // Return the 2D array of results
    }
    // Method to get the grade based on percentage
    public static String getGrade(double percentage) {
        if (percentage >= 80) {
            return "A (Level 4, above agency-normalized standards)";
        } else if (percentage >= 70) {
            return "B (Level 3, at agency-normalized standards)";
        } else if (percentage >= 60) {
            return "C (Level 2, below, but approaching agency-normalized standards)";
        } else if (percentage >= 50) {
            return "D (Level 1, well below agency-normalized standards)";
        } else if (percentage >= 40) {
            return "E (Level 1-, too below agency-normalized standards)";
        } else {
            return "R (Remedial standards)";
        }
    }
    // Method to display the scorecard of all students
    public static void displayScorecard(int[][] scores, double[][] results) {
        System.out.println("Student\tPhysics\tChemistry\tMath\tTotal\tAverage\tPercentage\tGrade");
        for (int i = 0; i < scores.length; i++) {
            System.out.print((i + 1) + "\t");
            System.out.print(scores[i][0] + "\t");
            System.out.print(scores[i][1] + "\t\t");
            System.out.print(scores[i][2] + "\t");
            System.out.print(results[i][0] + "\t");
            System.out.print(results[i][1] + "\t\t");
            System.out.print(results[i][2] + "\t\t");
            System.out.println(results[i][3]);
        }
    }
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in); // Create a Scanner object
        System.out.print("Enter the number of students: ");
        int numberOfStudents = scanner.nextInt(); // Input for the number of students

        int[][] scores = generateScores(numberOfStudents); // Generate scores
        double[][] results = calculateResults(scores); // Calculate results
        displayScorecard(scores, results); // Display the scorecard
        scanner.close(); // Close the scanner
    }
}