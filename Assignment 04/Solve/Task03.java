import java.util.Scanner;

public class Task03 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Ask for the number of inputs
        System.out.print("Enter an integer: ");
        int count = scanner.nextInt();

        int nonNegativeCount = 0;
        int negativeCount = 0;

        // Loop to take the specified number of inputs
        for (int i = 1; i <= count; i++) {
            System.out.print("Enter number " + i + ": ");
            int number = scanner.nextInt();

            // Count non-negative and negative numbers
            if (number < 0) {
                negativeCount++;
            } else {
                nonNegativeCount++;
            }
        }

        // Display the results
        System.out.println(nonNegativeCount + " Non-negative Numbers");
        System.out.println(negativeCount + " Negative Numbers");

        // Close the scanner
        scanner.close();
    }
}