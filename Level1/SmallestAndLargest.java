import java.util.Scanner;
//create a class SmallestAndLargest
public class SmallestAndLargest {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        // Taking user input for three numbers
        System.out.print("Enter three numbers: ");
        int number1 = scanner.nextInt();    
        int number2 = scanner.nextInt();
        int number3 = scanner.nextInt();
        // Finding smallest and largest numbers
        int[] result = findSmallestAndLargest(number1, number2, number3);
        // Displaying the results
        System.out.println("Smallest number: " + result[0]);
        System.out.println("Largest number: " + result[1]);

        scanner.close();
    }

    public static int[] findSmallestAndLargest(int number1, int number2, int number3) {
		//create variables smallest and largest
        int smallest = number1;
        int largest = number1;
        // Finding smallest
        if (number2 < smallest) {
            smallest = number2;
        }
        if (number3 < smallest) {
            smallest = number3;
        }
        // Finding largest
        if (number2 > largest) {
            largest = number2;
        }
        if (number3 > largest) {
            largest = number3;
        }
		//return smallest and largest
        return new int[]{smallest, largest};
    }
}