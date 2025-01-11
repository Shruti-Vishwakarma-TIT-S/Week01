import java.util.Scanner;
//create a class ArrayCopy
public class ArrayCopy {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
		//Enter rows
        System.out.print("Enter the number of rows and columns: ");
        int rows = scanner.nextInt();
        int columns = scanner.nextInt();
		// Create a 2D array
        int[][] matrix = new int[rows][columns];
        // Get user input for the 2D array
        System.out.println("Enter the elements of the matrix:");
        for (int i = 0; i < rows; i++) {
            for (int j = 0; j < columns; j++) {
                matrix[i][j] = scanner.nextInt();
            }
        }

        // Create a 1D array to copy the elements
        int[] array = new int[rows * columns];
        int index = 0;
        // Copy elements from 2D array to 1D array
        for (int i = 0; i < rows; i++) {
            for (int j = 0; j < columns; j++) {
				// Copy each element
                array[index++] = matrix[i][j]; 
            }
        }

        // Display the 1D array
        System.out.println("Elements in the 1D array:");
        for (int i = 0; i < array.length; i++) {
            System.out.print(array[i] + " ");
        }
        System.out.println();
     
    }
}