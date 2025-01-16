import java.util.Random;
import java.util.Scanner;
// Create class NumberGuessingGame
public class NumberGuessingGame { 
    public static void main(String[] args) { 
        // Create scanner object for user input
        Scanner sc = new Scanner(System.in); 
        // Get the secret number from the user
        System.out.print("Think of a number between 1 and 100. Press Enter when you're ready.");
        sc.nextLine(); 
        // Call method to start the guessing game
        playGame(sc); 
        // Close the scanner object
        sc.close(); 
    }

    // Method to play the guessing game
    public static void playGame(Scanner sc) { 
        // Initialize the lower and upper bounds
        int low = 1, high = 100; 
        String feedback; 
        int guess; 
        // Loop to keep guessing until the correct number is found
        do { 
            // Generate the guess
            guess = generateGuess(low, high); 
            System.out.println("Is your number " + guess + "?");
            // Get feedback from the user
            feedback = getFeedback(sc); 
            // Adjust bounds based on feedback
            if (feedback.equalsIgnoreCase("low")) { 
                low = guess + 1; 
            } else if (feedback.equalsIgnoreCase("high")) { 
                high = guess - 1; 
            } 
        } while (!feedback.equalsIgnoreCase("correct")); 
        // If feedback is correct, the guess is correct
        System.out.println("Yay! I guessed your number!"); 
    }

    // Method to generate a guess within the given bounds
    public static int generateGuess(int low, int high) { 
        Random rand = new Random(); 
        return rand.nextInt(high - low + 1) + low; 
    }

    // Method to get feedback from the user
    public static String getFeedback(Scanner sc) { 
        System.out.print("Enter feedback (high/low/correct): "); 
        return sc.nextLine(); 
    }
}
