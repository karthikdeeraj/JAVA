import java.util.Scanner;  // Declaring a util package for scanner class

    public class MultiplicationTable {  // Creating a class

        public static void main(String[] args) {  //Declaring a main method
            Scanner scanner = new Scanner(System.in); // For taking input
            int number;  // Declaring a variable

            // Get a positive integer from the user
            do {
                System.out.print("Enter a positive integer: ");
                number = scanner.nextInt();

                if (number <= 0) {
                    System.out.println("Please enter a positive integer.");
                }

            } while (number <= 0);

            // Print the multiplication table
            System.out.println("Multiplication table for " + number + ":");
            for (int i = 1; i <= 10; i++) {
                System.out.println(number + " x " + i + " = " + (number * i));
            }

            // Close the scanner to prevent resource leaks
            scanner.close();
        }
    }

