import java.util.Scanner;

public class ArrayCompare {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Prompt the user to enter the size of the first array
        System.out.print("How many in the first array: ");
        int size1 = scanner.nextInt();

        // Create the first array and read in its elements
        int[] array1 = new int[size1];
        for (int i = 0; i < size1; i++) {
            System.out.print("Enter element " + (i + 1) + " of the first array: ");
            array1[i] = scanner.nextInt();
        }

        // Prompt the user to enter the size of the second array
        System.out.print("How many in the second array: ");
        int size2 = scanner.nextInt();

        // Create the second array and read in its elements
        int[] array2 = new int[size2];
        for (int i = 0; i < size2; i++) {
            System.out.print("Enter element " + (i + 1) + " of the second array: ");
            array2[i] = scanner.nextInt();
        }

        // Compare the two arrays and store the matching numbers in a separate array
        int[] matches = new int[Math.min(size1, size2)];
        int count = 0;
        for (int i = 0; i < size1; i++) {
            for (int j = 0; j < size2; j++) {
                if (array1[i] == array2[j]) {
                    matches[count] = array1[i];
                    count++;
                    break;
                }
            }
        }

        // Print out the matching numbers
        System.out.print("Matching numbers: ");
        for (int i = 0; i < count; i++) {
            System.out.print(matches[i] + " ");
        }
        System.out.println();
    }
}

