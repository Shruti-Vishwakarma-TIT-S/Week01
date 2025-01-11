import java.util.Scanner;
// creata a class named as Multiples
public class Multiples {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);

        //Take number in input
        System.out.print("Enter a number to find its multiples below 100 and greater than 0: ");
        int number = s.nextInt();
        // Run a for loop backward from 100 to 1
        for (int i = 100; i >= 1; i--) {
            // Check if i is a multiple of the number themn print
			
            if (i % number == 0) 
                System.out.println(i);
            
        }
   
        // Close the scanner
        s.close();
    }
}