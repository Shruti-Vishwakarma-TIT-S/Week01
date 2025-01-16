import java.util.Random;
//create a class StudentScorecard
public class StudentScorecard {
    // Method to generate random 2-digit scores for Physics, Chemistry, and Maths
    public static int[][] generateScores(int numberOfStudents) {
        Random random = new Random();
		// 2D array for scores (PCM)
        int[][] scores = new int[numberOfStudents][3]; 
        for (int i = 0; i < numberOfStudents; i++) {
			// Physics score
            scores[i][0] = random.nextInt(100);
			// Chemistry score
            scores[i][1] = random.nextInt(100);
			// Maths score
            scores[i][2] = random.nextInt(100); 
        }
		// Return the 2D array of scores
        return scores; 
    }
    // Method to calculate total, average, and percentage for each student
    public static double[][] calculateResults(int[][] scores) {
		// 2D array for total, average, percentage
        double[][] results = new double[scores.length][4]; 
        for (int i = 0; i < scores.length; i++) {
            int total = scores[i][0] + scores[i][1] + scores[i][2]; // Total marks
            double average = total / 3.0; // Average marks
            double percentage = (total / 300.0) * 100; // Percentage
            // Round off values to 2 decimal places
            results[i][0] = total;
            results[i][1] = Math.round(average * 100.0) / 100.0; // Average rounded
            results[i][2] = Math.round(percentage * 100.0) / 100.0; // Percentage rounded
        }
        return results; // Return the 2D array of results
    }
    // Method to calculate grades based on percentage
    public static String[][] calculateGrades(double[][] results) {
        String[][] grades = new String[results.length][2]; // 2D array for grades
        for (int i = 0; i < results.length; i++) {
            double percentage = results[i][2]; // Get percentage
            // Determine grade based on percentage
            if (percentage >= 80) {
                grades[i][0] = "A";
                grades[i][1] = "Level 4, above agency-normalized standards";
            } 
			else if (percentage >= 70) {
                grades[i][0] = "B";
                grades[i][1] = "Level 3, at agency-normalized standards";
            } 
			else if (percentage >= 60) {
                grades[i][0] = "C";
                grades[i][1] = "Level 2, below, but approaching agency-normalized standards";
            } 
			else if (percentage >= 50) {
                grades[i][0] = "D";
                grades[i][1] = "Level 1, well below agency-normalized standards";
            } 
			else if (percentage >= 40) {
                grades[i][0] = "E";
                grades[i][1] = "Level 1-, too below agency-normalized standards";
            } 
			else {
                grades[i][0] = "R";
                grades[i][1] = "Remedial standards";
            }
        }
		// Return the 2D array of grades
        return grades; 
    }
    // Method to display the scorecard in a tabular format
    public static void displayScorecard(int[][] scores, double[][] results, String[][] grades) {
		// Print the header
		System.out.println("Student  Physics  Chemistry  Maths  Total  Average  Grade");
		System.out.println("-----------------------------------------------------------");
		// Print each student's scores, total, average, and grade
		for (int i = 0; i < scores.length; i++) {
        // Use String.format to create a formatted string for each line
        System.out.println((i + 1) + "       " + scores[i][0] + "       " + scores[i][1] + "       " + scores[i][2] + "       " + (int) results[i][0] + "       " + results[i][1] + "       " + grades[i][0]);
		}
	}
    public static void main(String[] args) {
		int numberOfStudents = 10; // Number of students
		// Generate random scores for students
		int[][] scores = generateScores(numberOfStudents);
		// Calculate total, average, and percentage for each student
		double[][] results = calculateResults(scores);
		// Calculate grades based on the percentage
		String[][] grades = calculateGrades(results);
		// Display the scorecard in a tabular format
		displayScorecard(scores, results, grades);
	}
}