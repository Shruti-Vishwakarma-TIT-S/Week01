
import java.util.Scanner;
//create a class AgeCalculator
public class AgeCalculator
{
    public static void main(String[] args) 
	{
		
        Scanner input = new Scanner(System.in);

        //take input age and height of Amar Akbar Anthony        
		System.out.print("Enter Amar's age: ");
        int amarAge = input.nextInt();
		System.out.print("Enter Amar's height in cm: ");
        double amarHeight = input.nextDouble();
        System.out.print("Enter Akbar's age: ");
        int akbarAge = input.nextInt();
		System.out.print("Enter Akbar's height in cm: ");
        double akbarHeight = input.nextDouble();
        System.out.print("Enter Anthony's age: ");
        int anthonyAge = input.nextInt();		
        System.out.print("Enter Anthony's height in cm: ");
        double anthonyHeight = input.nextDouble();

        //find the youngest friend among three using if else statement
        String youngestFriend;
        int youngestAge = amarAge;
        youngestFriend = "Amar";

        if (akbarAge < youngestAge) 
		{
            youngestAge = akbarAge;
            youngestFriend = "Akbar";
        }
        if (anthonyAge < youngestAge) 
		{
            youngestAge = anthonyAge;
            youngestFriend = "Anthony";
        }

        //Find the tallest friend among three of them 
        String tallestFriend;
        double tallestHeight = amarHeight;
        tallestFriend = "Amar";

        if (akbarHeight > tallestHeight) 
		{
            tallestHeight = akbarHeight;
            tallestFriend = "Akbar";
        }
        if (anthonyHeight > tallestHeight) 
		{
            tallestHeight = anthonyHeight;
            tallestFriend = "Anthony";
        }

        //print the results
        System.out.println("The youngest friend is " + youngestFriend + " with age " + youngestAge + " years.");
        System.out.println("The tallest friend is " + tallestFriend + " with height " + tallestHeight + " cm.");

    }
}