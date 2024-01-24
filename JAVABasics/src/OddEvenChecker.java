import java.util.Scanner;  // Declaring a util package for scanner class
public class OddEvenChecker {  // Creating a class
    public static void main(String[] args){  //Declaring a main method
        Scanner sc = new Scanner(System.in); // For taking input
        int number; // Declaring a variable
        // Get input from user
        System.out.println("Enter any number");
        number = sc.nextInt();
        // Checking even or odd
        if(number%2==0) {
            System.out.println("Number is even");
        }
        else {
            System.out.println("Number is odd");
        }
    }
}
