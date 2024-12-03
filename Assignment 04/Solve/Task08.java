import java.util.Scanner;
public class Task08{
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        
        System.out.print("Enter the width of the rectangle: ");
        int col = scanner.nextInt();
        System.out.print("Enter the length of the rectangle: ");
        int row = scanner.nextInt();
        
        // Print the rectangle
        for (int i = 0; i < row; i++) { // Loop for each row
            for (int j = 1; j <= col; j++) { // Loop for each column
                System.out.print(j + " "); // Print numbers from 1 to width
            }
            System.out.println(); // Move to the next line after each row
        }
    }
}