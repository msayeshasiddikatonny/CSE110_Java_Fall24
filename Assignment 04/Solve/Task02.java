import java.util.Scanner;

public class Task02 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int number;
        
        while (true) {
            System.out.print("Enter Number: ");
            number = scanner.nextInt();

            // Check if the number is negative
            if (number < 0) {
                break; // Exit the loop if the number is negative
            }

            // Calculate the square and print the result
            int square = number * number;
            System.out.println(number + " ^ 2 = " + square);
        }

        System.out.println("Program terminated. You entered a negative number.");
        scanner.close();
    }
}