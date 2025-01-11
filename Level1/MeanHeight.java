import java.util.Scanner;
//create MeanHeight class
public class MeanHeight {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
		//Enter numbers like height and take sum as 0.0
        double[] heights = new double[11];
        double sum = 0.0;
        // Get input for heights
        for (int i = 0; i < heights.length; i++) {
            System.out.println("Enter the height of player " + (i + 1) + ": ");
            heights[i] = scanner.nextDouble();
            sum += heights[i]; // Add to sum
        }
        // Calculate mean height
        double meanHeight = sum / heights.length;
        System.out.println("Mean height of the football team: " + meanHeight);
    }
}