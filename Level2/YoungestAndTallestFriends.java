import java.util.Scanner;
//create a class YoungestAndTallestFriends
public class YoungestAndTallestFriends {
	 public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        // Names of the friends
        String[] names = {"Amar", "Akbar", "Anthony"};
        // Arrays to store ages and heights
        int[] ages = new int[3];
        double[] heights = new double[3];
        // Taking user input for ages and heights
        for (int i = 0; i < names.length; i++) {
            System.out.print("Enter the age of " + names[i] + ": ");
			//read age
            ages[i] = scanner.nextInt(); 
            System.out.print("Enter the height of " + names[i] + " (in cm): ");
			//input height
            heights[i] = scanner.nextDouble(); 
        }
        // Finding the youngest and tallest friends
        String youngest = findYoungest(names, ages);
        String tallest = findTallest(names, heights);
        // Displaying the results
        System.out.println("The youngest friend is: " + youngest);
        System.out.println("The tallest friend is: " + tallest);
        scanner.close(); 
    }
    // Method to find the youngest friend
    public static String findYoungest(String[] names, int[] ages) {
		// taking as youngest the first friend
        int minAgeIndex = 0; 
        for (int i = 1; i < ages.length; i++) {
            if (ages[i] < ages[minAgeIndex]) {
				// Update index if a younger friend is found
                minAgeIndex = i; 
            }
        }
		// Return the name of the youngest friend
        return names[minAgeIndex]; 
    }
    // Method to find the tallest friend
    public static String findTallest(String[] names, double[] heights) {
		//taking as tallest the first friend 
        int maxHeightIndex = 0; 
        for (int i = 1; i < heights.length; i++) {
            if (heights[i] > heights[maxHeightIndex]) {
				// Update index if a taller friend is found
                maxHeightIndex = i; 
            }
        }
		// Return the name of the tallest friend
        return names[maxHeightIndex]; 
    }
   
}