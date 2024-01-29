import java.util.Scanner;
public class Triangle {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Enter the first angle:");
        int angle1 = scanner.nextInt();

        System.out.println("Enter the second angle:");
        int angle2 = scanner.nextInt();

        System.out.println("Enter the third angle:");
        int angle3 = scanner.nextInt();

        if (angle1 + angle2 + angle3 == 180) {
            System.out.println("It is a valid triangle.");

            if (angle1 == angle2 && angle2 == angle3) {
                System.out.println("It is an Equilateral triangle.");
            } else if (angle1 == angle2 || angle1 == angle3 || angle2 == angle3) {
                System.out.println("It is an Isosceles triangle.");
            } else {
                System.out.println("It is a Scalene triangle.");
            }
        } else {
            System.out.println("It is not a valid triangle.");
        }

        scanner.close();
    }
}
