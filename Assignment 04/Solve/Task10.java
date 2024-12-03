import java.util.Scanner;
public class Task10 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        // Read the height of the triangle from the user
        System.out.print("Enter the height of the triangle: ");
        int height = scanner.nextInt();
        // Print the isosceles triangle
        for (int i = 1; i <= height; i++) {
            // Print leading spaces for center alignment
            for (int j = 0; j < height - i; j++) {
                System.out.print("  "); // Two spaces for each leading space
            }
            // Print numbers from 1 to (2 * i - 1)
            for (int j = 1; j <= (2 * i - 1); j++) {
                System.out.print(j + " "); // Print the numbers followed by a space
            }
            // Move to the next line after each row
            System.out.println();
        }
    }
}