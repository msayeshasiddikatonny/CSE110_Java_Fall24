import java.util.Scanner;

public class Task01{
    public static void main(String[] args) {
        Scanner sc  = new Scanner(System.in);

        // Ask the user how many inputs they want to provide
        System.out.print("How many numbers do you want to input? ");
        int count = sc.nextInt();

        // Variables to store max, min, and sum of even positive numbers
        int max = -1;
        int min = 1;
        int sum = 0;
        int evenCount = 0;

        // Loop to collect the inputs
        for (int i = 0; i < count; i++) {
            System.out.print("Enter number " + (i + 1) + ": ");
            int number = sc.nextInt();

            // Check if the number is even and positive
            if (number > 0 && number % 2 == 0) {
                // Update max and min
                if (number > max) {
                    max = number;
                }
                if (number < min) {
                    min = number;
                }
                // Update sum and count of even positive numbers
                sum += number;
                evenCount++;
            }
        }

        // Calculate average
        double average = (evenCount > 0) ? (double) sum / evenCount : 0;

        // Print results
        if (evenCount > 0) {
            System.out.println("Max: " + max);
            System.out.println("Min: " + min);
            System.out.printf("Average: "+ average);
        } else {
            System.out.println("No even positive numbers were entered.");
            System.out.println("Max: N/A");
            System.out.println("Min: N/A");
            System.out.println("Average: 0.00");
        }

        // Close the scanner
        sc.close();
    }
}