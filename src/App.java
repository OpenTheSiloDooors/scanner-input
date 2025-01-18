// import scanner class
import java.util.Scanner;

public class App 
{
    public static void main(String[] args)
    {

        // Creating Scanner class object
        Scanner scn = new Scanner(System.in);

            // Enter first input
            String fullName; // Declaring a string variable to store the full name
            String firstName; // Declaring a string variable to store the first name
            String lastName; // Declaring a string variable to store the last name
            System.out.print("Enter your first and last name: "); // Prompting the user to enter their name
            fullName = scn.nextLine(); // Reading the name entered by the user
            String[] names = fullName.split(" ", 2); // Splitting the string into two parts
            firstName = names[0]; // Assigning the first name to firstName
            lastName = names[1]; // Assigning the last name to lastName
            System.out.println("Hello, " + firstName + ". Your last name is " + lastName); // Printing the first and last name

            // Enter second input
            int age = 0; // Declaring an integer variable to store the age
            try // Using try-catch block to handle exceptions
            {
                System.out.print("Enter your age: "); // Prompting the user to enter their age
                age = scn.nextInt(); // Reading the value entered by the user
            }
            catch (Exception e) // Catching the exception if the input is not an integer
            {
                System.out.println("Try again but enter a valid number"); // Printing an error message
            }
                System.out.println("Age: " + (age)); // Printing the age

            // Enter third input
            double pi = 0.0; // Declaring a double variable to store the value of pi
            try // Using try-catch block to handle exceptions
            {
                System.out.print("What is the first six digits of pi? "); // Prompting the user to enter the value of pi
                pi = scn.nextDouble(); // Reading the value entered by the user
            }   
            catch (Exception e) // Catching the exception if the input is not a double
            {
                System.out.println("Must be in this format: 0.00000"); // Printing an error message
            }
                System.out.println("Your answer is: " + pi); // Printing the value of pi

                // Closing the scanner to release resources
                scn.close();
    }
}