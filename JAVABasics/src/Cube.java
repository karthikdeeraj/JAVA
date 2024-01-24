import java.util.Scanner; // Declaring a util package for scanner class

public class Cube {     // Creating a class
    public static void main(String[] args) {  // Declaring a main method
        Scanner scanner = new Scanner(System.in); // For taking input
        int number;  // Declaring a variable

        do {       // do- while loop to check whether the given input is positive or not
            System.out.print("Enter a positive number: ");
            number = scanner.nextInt();

            if (number <= 0) {
                System.out.println("Please enter a positive number.");
            }

        } while (number <= 0);

        // Calculate and print the cube of the positive number
        int cube = number * number * number; // Assigning formula to a variable
        System.out.println("The cube of " + number + " is: " + cube); // Printing the result


        // Close the scanner to prevent resource leaks
        scanner.close();
    }
}

