import java.util.Scanner;
//create a class StudentVotingEligibility
public class StudentVotingEligibility {
    // Method to generate random ages for students
    public static int[] generateAges(int numberOfStudents) {
        int[] ages = new int[numberOfStudents];
        for (int i = 0; i < numberOfStudents; i++) {
			// Generate random age between 0 and 99
            ages[i] = (int) (Math.random() * 100); 
        }
		// Return the array of ages
        return ages; 
    }
    // Method to check voting eligibility based on age
    public static String[][] checkVotingEligibility(int[] ages) {
		// 2D array for age and eligibility
        String[][] eligibility = new String[ages.length][2]; 
        for (int i = 0; i < ages.length; i++) {
            int age = ages[i];
			// Store age as string
            eligibility[i][0] = String.valueOf(age); 
            // Validate age and determine voting eligibility
            if (age < 0) {
				// Negative age
                eligibility[i][1] = "Cannot Vote"; 
            } 
			else if (age >= 18) {
				// Eligible to vote
                eligibility[i][1] = "Can Vote"; 
            } 
			else {
				// Not eligible to vote
                eligibility[i][1] = "Cannot Vote"; 
            }
        }
        return eligibility; // Return the 2D array
    }
    // Method to display the 2D array in a tabular format
    public static void displayEligibility(String[][] eligibility) {
        System.out.println( "Age              Voting Eligibility"); // Header
        System.out.println("\n---------------------------");
        for (String[] row : eligibility) {
			// Display age and eligibility
            System.out.printf("%-10s %-15s%n", row[0], row[1]); 
        }
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        // Number of students
        int numberOfStudents = sc.nextInt();
        // Generate random ages for students
        int[] ages = generateAges(numberOfStudents);
        // Check voting eligibility
        String[][] eligibility = checkVotingEligibility(ages);
        // Display the results
        displayEligibility(eligibility);
        
        sc.close(); // Close the scanner
    }
}