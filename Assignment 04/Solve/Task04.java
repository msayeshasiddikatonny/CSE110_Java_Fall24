import java.util.Scanner;

public class  Task04{
   public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Prompt user for a positive integer N
        System.out.print("Enter a positive integer N (N > 0): ");
        int N = scanner.nextInt();

        // Validate the input
        if (N <= 0) {
            System.out.println("Please enter a positive integer greater than 0.");
            scanner.close();
            return; // Exit if the input is not valid
        }

        int count = 0; // Count of prime numbers found
        int number = 2; // Starting number to check for primality

        // Loop until we find N prime numbers
        while (count < N) {
            boolean isPrime = true; // Assume the number is prime

            // Check if 'number' is prime
            for (int i = 2; i <= Math.sqrt(number); i++) {
                if (number % i == 0) {
                    isPrime = false; // Not a prime number
                    break; // No need to check further
                }
            }

            // If the number is prime, print it
            if (isPrime) {
                System.out.println(number);
                count++; // Increment the count of found primes
            }

            number++; // Move to the next number
        }

        // Close the scanner
        scanner.close();
    }
}