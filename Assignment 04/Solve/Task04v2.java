import java.util.Scanner;
public class  Task04v2{
   public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        // Prompt user for a positive integer N
        System.out.print("Enter a positive integer N (N > 0): ");
        int N = scanner.nextInt();

        int count = 0; // Count of prime numbers found
        int number = 2; // Starting number to check for primality

        // Loop until we find N prime numbers
        while (count < N) {
             int c=0; // Assume the number is prime
            // Check if 'number' is prime
            for (int i = 2; i<=  number; i++) {
                if (number % i == 0) {
                    
                     c++; // No need to check further
                }
            }
            // If the number is prime, print it
            if (c==1) {
                System.out.println(number);
                count++; // Increment the count of found primes
            }

            number++; // Move to the next number
        }
    }
}