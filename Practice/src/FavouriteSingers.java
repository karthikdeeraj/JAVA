import java.util.Arrays;
import java.util.Scanner;

    public class FavouriteSingers {

        public static void main(String[] args) {
            // Create a Scanner object to read input from the console
            Scanner scanner = new Scanner(System.in);

            // Read the number of songs in the playlist
            int n = scanner.nextInt();

            // Read the singers of each song into an array
            int[] singers = new int[n];
            for (int i = 0; i < n; i++) {
                singers[i] = scanner.nextInt();
            }

            // Close the scanner to avoid resource leaks
            scanner.close();

            // Sort the array for easier counting
            Arrays.sort(singers);

            // Initialize variables to track the maximum and current counts
            int maxCount = 1;
            int currentCount = 1;

            // Find the maximum count in a single pass through the sorted array
            for (int i = 1; i < n; i++) {
                if (singers[i] == singers[i - 1]) {
                    // If the current singer is the same as the previous one, increment the count
                    currentCount++;
                    // Update the maximum count if needed
                    maxCount = Math.max(maxCount, currentCount);
                } else {
                    // If the current singer is different, reset the count
                    currentCount = 1;
                }
            }

            // Output the result (the maximum count)
            System.out.println(maxCount);
        }
    }

