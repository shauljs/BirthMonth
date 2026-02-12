import java.util.Scanner;

public class Main {
    public static void main(String[] args)
    {

        // Declarations
        int birthMonth;

        // Create a scanner object
        Scanner in = new Scanner(System.in);

        //Prompt user for data entry
        System.out.println("Enter your birth month (1-12):");

        // Accept input from user
        birthMonth = in.nextInt();

        // If else statement
        if (birthMonth >= 1 && birthMonth <= 12)
        {
            System.out.println("Your birth month is: " + birthMonth + ".");
        }
        else
        {
            System.out.println("You entered an incorrect month value: " + birthMonth + ".");
        }
    }
}