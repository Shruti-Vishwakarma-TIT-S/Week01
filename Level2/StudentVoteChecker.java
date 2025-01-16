import java.util.Scanner;
//create a class StudentVoteChecker
public class StudentVoteChecker {
    // Method to check if a student can vote based on age
    public boolean canStudentVote(int age) {
        // Validate the age
        if (age < 0) {
			//Negative age is invalid, cannot vote
            return false; 
        }
        // Check if age is 18 or above
		// Return true if age is 18 or above, otherwise false
        return age >= 18; 
    }
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        StudentVoteChecker voteChecker = new StudentVoteChecker(); // Create an instance of StudentVoteChecker
        // Create an Array to hold the ages of 10 students
        int[] ages = new int[10];
        // Loop to take user input for the ages of the students
        for (int i = 0; i < ages.length; i++) {
            System.out.print("Enter the age of student " + (i + 1) + ": ");
            ages[i] = scanner.nextInt(); 
        }
        // Check if each student can vote and display the result
        for (int i = 0; i < ages.length; i++) {
			// Call canStudentVote method
            boolean canVote = voteChecker.canStudentVote(ages[i]); 
            if (canVote) {
                System.out.println("Student " + (i + 1) + " can vote.");
            } 
			else {
                System.out.println("Student " + (i + 1) + " cannot vote.");
            }
        }
        scanner.close(); // Close the scanner
    }
}