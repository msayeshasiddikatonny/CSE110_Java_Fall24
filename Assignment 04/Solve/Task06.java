import java.util.Scanner;
public class Task06 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        while (true) {
            System.out.print("Enter Number: ");
            int number = scanner.nextInt();

            // Check if the number is odd
            if (number % 2 != 0) {
                break; // Exit the loop if the number is odd
            }

            // Calculate the number of divisors
            int divisorCount = 0;
            for (int i = 1; i <= number; i++) {
                if (number % i == 0) {
                    divisorCount++; // Increment the count of divisors
                }
            }
            System.out.println(number + " has " + divisorCount + " divisors");
        }
    }
}