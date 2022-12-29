import java.util.Scanner;

public class MatrixDiagonals {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Size: ");
        int size = scanner.nextInt();

        // create a 2D array filled with dashes
        char[][] matrix = new char[size][size];
        for (int i = 0; i < size; i++) {
            for (int j = 0; j < size; j++) {
                matrix[i][j] = '-';
            }
        }

        // put X on the first diagonal
        for (int i = 0; i < size; i++) {
            matrix[i][i] = 'X';
        }

        // put Y on the second diagonal
        for (int i = 0; i < size; i++) {
            matrix[i][size - i - 1] = 'Y';
        }

        // print the matrix
        for (int i = 0; i < size; i++) {
            for (int j = 0; j < size; j++) {
                System.out.print(matrix[i][j] + " ");
            }
            System.out.println();
        }
    }
}
