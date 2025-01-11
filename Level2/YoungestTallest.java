import java.util.Scanner;
//YoungestTallest
public class YoungestTallest {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);      
        // Arrays to store ages and heights
        String[] friends = {"Amar", "Akbar", "Anthony"};
		//Initialization of Arrays
        int[] ages = new int[3];
        double[] heights = new double[3];
        // Input ages and heights for the friends
        for (int i = 0; i < friends.length; i++) {
            System.out.println("Enter the age of " + friends[i] + ": ");
            ages[i] = scanner.nextInt();
            System.out.println("Enter the height of " + friends[i] + " (in cm): ");
            heights[i] = scanner.nextDouble();
        }
        // Initialize variables to find the youngest and tallest
        int youngestIndex = 0;
        double tallestIndex = 0;
        // Loop through the arrays to find the youngest and tallest
        for (int i = 1; i < friends.length; i++) {
            if (ages[i] < ages[youngestIndex]) {
                youngestIndex = i; // Update index of the youngest
            }
            if (heights[i] > heights[(int)tallestIndex]) {
                tallestIndex = i; // Update index of the tallest
            }
        }
        // Display the results
        System.out.println("The youngest friend is " + friends[youngestIndex] + " with age " + ages[youngestIndex] + " years.");
        System.out.println("The tallest friend is " + friends[(int)tallestIndex] + " with height " + heights[(int)tallestIndex] + " cm.");
        // Close the scanner
        scanner.close();
    }
}