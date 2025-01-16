import java.util.Random;
//create a class FootballTeamHeight
public class FootballTeamHeight {
    // Method to generate random heights for players
    public static int[] generateRandomHeights(int size) {
		// Create an array to store heights
        int[] heights = new int[size]; 
		// Create a Random object
        Random random = new Random(); 
        // Generate random heights between 150 and 250 cm
        for (int i = 0; i < size; i++) {
            heights[i] = 150 + random.nextInt(101); 
        }
		// Retrn the array of heights
        return heights; 
    }

    //Method to find the sum of all heights
    public static int findSum(int[] heights) {
        int sum = 0; // Initialize sum to 0
        for (int height : heights) {
		// Add each height to the sum
            sum += height; 
        }
        return sum; // Return the total sum
    }
    //Method to find the mean height
    public static double findMean(int[] heights) {
        int sum = findSum(heights); 
		// Calculate and return the mean
        return (double) sum / heights.length; 
    }
    // Method to find the shortest height
    public static int findShortest(int[] heights) {
        int shortest = heights[0]; // Assume the first height is the shortest
        for (int height : heights) {
            if (height < shortest) {
                shortest = height; // Update shortest if a smaller height is found
            }
        }
        return shortest; // Return the shortest height
    }
    // Method to find the tallest height
    public static int findTallest(int[] heights) {
        int tallest = heights[0]; 
        for (int height : heights) {
            if (height > tallest) {
			// Update tallest if a larger height is found
                tallest = height; 
            }
        }
        return tallest; // Return the tallest height
    }
    public static void main(String[] args) {
        int numberOfPlayers = 11; // Number of players in the team
        int[] heights = generateRandomHeights(numberOfPlayers); 

        // Display the heights of the players
        System.out.println("Heights of the players:");
        for (int height : heights) {
			// Print each height
            System.out.println(height + " cm"); 
        }
        // Calculate and display the results
		// Find the sum of heights
        int sum = findSum(heights); 
		 // Find the mean height
        double mean = findMean(heights);
		// Find the shortest height
        int shortest = findShortest(heights); 
		// Find the tallest height
        int tallest = findTallest(heights); 
        // Display the results
        System.out.println("Sum of heights: " + sum + " cm");
        System.out.println("Mean height: " + mean + " cm");
        System.out.println("Shortest height: " + shortest + " cm");
        System.out.println("Tallest height: " + tallest + " cm");
    }
}