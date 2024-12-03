import java.util.Scanner;
public class Task09{
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Read the height of the triangle from the user
        System.out.print("Enter the height of the triangle: ");
        int height = scanner.nextInt();

        // Print the right-justified triangle
        for (int i = 1; i <= height; i++) {
            // Print leading spaces for right justification
            for (int j = 0; j < height - i; j++) {
                System.out.print("  "); // Two spaces for each leading space
            }

            // Print numbers from 1 to i
            for (int j = 1; j <= i; j++) {
                System.out.print(j + " "); // Print the numbers followed by a space
            }

            // Move to the next line after each row
            System.out.println();
        }
    }
}