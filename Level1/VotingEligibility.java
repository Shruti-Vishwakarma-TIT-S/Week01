import java.util.Scanner;
//Create a class called VotingEligibility
public class VotingEligibility {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int[] ages = new int[10];
        // Input ages of 10 students
        for (int i = 0; i < ages.length; i++) {
            System.out.println("Enter the age of student " + (i + 1) + ": ");
            ages[i] = scanner.nextInt();
        }
        // Check voting eligibility
        for (int age : ages) {
            if (age < 0) {
                System.out.println("Invalid age.");
            } else if (age >= 18) {
                System.out.println("The student with the age " + age + " can vote.");
            } else {
                System.out.println("The student with the age " + age + " cannot vote.");
            }
        }

        scanner.close();
    }
}