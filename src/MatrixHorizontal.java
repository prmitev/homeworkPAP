import java.util.Scanner;

public class MatrixHorizontal {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Prompt the user to enter the number of rows and columns
        System.out.print("How many rows? ");
        int rows = scanner.nextInt();
        System.out.print("How many columns? ");
        int columns = scanner.nextInt();

        // Create a 2D array to store the numbers
        int[][] numbers = new int[rows][columns];

        // Store the numbers horizontally, from left to right
        int count = 1;
        for (int i = 0; i < rows; i++) {
            for (int j = 0; j < columns; j++) {
                numbers[i][j] = count;
                count++;
            }
        }

        // Print out the numbers
        for (int i = 0; i < rows; i++) {
            for (int j = 0; j < columns; j++) {
                System.out.print(numbers[i][j] + " ");
            }
            System.out.println();
        }
    }
}
