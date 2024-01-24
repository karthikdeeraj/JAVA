import java.util.Scanner;  // Declaring a util package for scanner class

    public class LargestNumberFinder {   // Creating a class

        public static void main(String[] args) {  // Declaring a main method
            Scanner scanner = new Scanner(System.in);  // For taking input
            int a, b, c;  // Declaring variables

            // Get three numbers from the user
            System.out.print("Enter the first number (a): ");
            a = scanner.nextInt();

            System.out.print("Enter the second number (b): ");
            b = scanner.nextInt();

            System.out.print("Enter the third number (c): ");
            c = scanner.nextInt();

            // Find and display the largest number
            if (a > b && a > c) {
                System.out.println("The largest number is: " + a);
            } else if (b > a && b > c) {
                System.out.println("The largest number is: " + b);
            } else {
                System.out.println("The largest number is: " + c);
            }

            // Close the scanner to prevent resource leaks
            scanner.close();
        }
    }


