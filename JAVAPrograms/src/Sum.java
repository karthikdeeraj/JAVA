import java.util.Scanner;
public class Sum {
    public static int getSum(int n){
        
    int sum = 0;
 
        while (n != 0) {
        sum = sum + n % 10;
        n = n / 10;
    }
 
        return sum;
}
 public static void main(String args[]){
     Scanner scanner = new Scanner(System.in);

     System.out.print("Enter a double-digit: ");
     int n = scanner.nextInt();
     System.out.println(getSum(n));
     scanner.close();
 }
 }

