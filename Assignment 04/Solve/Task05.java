import java.util.Scanner;
public class Task05 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Prompt user for a positive integer N
        System.out.print("The value of N: ");
        int N = scanner.nextInt();
        int y = 0; // Initialize y
        // Calculate the value of y based on the given expression
        for (int i = 1; i <= N; i++) {
            // Calculate the sum of the first i integers
            int sum = (i * (i + 1)) / 2; // Using the formula for the sum of the first i natural numbers
            y -= sum; // Subtract the sum from y
        }
        System.out.println("The value of y: " + y);
    }
}