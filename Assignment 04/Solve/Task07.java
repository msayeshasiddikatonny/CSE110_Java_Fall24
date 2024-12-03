import java.util.Scanner;
public class Task07{
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter the number of test cases: ");
        int N = scanner.nextInt();
        for (int i = 0; i < N; i++) {
            // Read X and Y for each test case
            System.out.print("Enter X and Y: ");
            int X = scanner.nextInt();
            int Y = scanner.nextInt();

            int sum = 0; // Variable to store the sum of odd numbers
            int count = 0; // Counter for how many odd numbers have been added

            // Start from X and find Y odd numbers
            while (count < Y) {
                if (X % 2 != 0) { // Check if X is odd
                    sum += X; // Add to sum if odd
                    count++; // Increment the count of odd numbers found
                }
                X++; // Move to the next number
            }

            // Print the result for the current test case
            System.out.println("Sum of " + Y + " odd numbers starting from " + X + ": " + sum);
        }
    }
}