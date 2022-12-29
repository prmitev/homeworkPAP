import java.util.Scanner;

public class BubbleSort2 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Prompt the user to enter a word
        System.out.print("Word: ");
        String word = scanner.nextLine();

        // Convert the word to a character array and sort it in alphabetical order
        char[] letters = word.toCharArray();
        java.util.Arrays.sort(letters);

        // Print out the sorted letters
        for (char letter : letters) {
            System.out.print(letter + "");
        }
        System.out.println();

    }
}

