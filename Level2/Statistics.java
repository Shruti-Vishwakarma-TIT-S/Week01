import java.util.Random;
//create a class RandomStatistics
public class RandomStatistics {
    // Method to generate an array of 4-digit random numbers
    public static int[] generate4DigitRandomArray(int size) {
        int[] randomNumbers = new int[size];
        Random random = new Random();
        for (int i = 0; i < size; i++) {
            // Generate a random 4-digit number (1000 to 9999)
            randomNumbers[i] = 1000 + random.nextInt(9000);
        }
		// Return the array of random numbers
        return randomNumbers; 
    }
    // Method to find average, min, and max value of an array
    public static double[] findAverageMinMax(int[] numbers) {
        double sum = 0;
		// Integer.MAX_VALUE is to take largest value of integer
        int min = Integer.MAX_VALUE; 
		// Integer.MAX_VALUE is to take smallest value of integer
        int max = Integer.MIN_VALUE; 
        for (int number : numbers) {
			// Calculate the sum
            sum += number; 
			// Find the minimum value
            min = Math.min(min, number); 
			// Find the maximum value
            max = Math.max(max, number); 
        }
		// Calculate the average
        double average = sum / numbers.length; 
		// Return average, min, and max in an array
        return new double[]{average, min, max}; 
    }
    public static void main(String[] args) {
		// Number of random values to generate
        int size = 5; 
		// Generate random numbers
        int[] randomNumbers = generate4DigitRandomArray(size); 
        // Display the generated random numbers
        System.out.println("Generated 4-digit random numbers:");
        for (int number : randomNumbers) {
            System.out.println(number);
        }
        // Find average, min, and max values
        double[] results = findAverageMinMax(randomNumbers);
        double average = results[0];
        int min = (int) results[1];
        int max = (int) results[2];
        // Display the results
        System.out.println("Average: "+ average);
        System.out.println("Minimum: " + min);
        System.out.println("Maximum: " + max);
    }
}