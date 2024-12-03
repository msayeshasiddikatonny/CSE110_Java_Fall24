import java.util.Scanner;
public class Task11 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        // Prompt user for the starting and ending numbers
        System.out.print("Start: ");
        int start = scanner.nextInt();
        System.out.print("End: ");
        int end = scanner.nextInt();
        System.out.println("Armstrong numbers: ");
        // Loop through the range and check for Armstrong numbers
        for (int number = start; number <= end; number++) {
            int originalNumber = number;
            int sum = 0;
            int numberOfDigits = String.valueOf(number).length();
            // Calculate the sum of the digits raised to the power of the number of digits
            while (number > 0) {
                int digit = number % 10;
                sum += Math.pow(digit, numberOfDigits);
                number /= 10;
            }
            // Check if the calculated sum is equal to the original number
            if (sum == originalNumber) {
                System.out.println(originalNumber);
            }
            // Reset the number for the next iteration
            number = originalNumber; // Restore the original number for the next loop iteration
        }
    }
}