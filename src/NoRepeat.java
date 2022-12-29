import java.util.Arrays;
import java.util.Scanner;

public class NoRepeat {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // initialize the array with size 1
        String[] words = new String[1];
        int count = 0;

        // read words from the keyboard until the user enters a dot
        while (true) {
            System.out.print("Word: ");
            String word = scanner.next();
            if (word.equals(".")) {
                break;
            }

            // check if the word already exists in the array
            boolean exists = false;
            for (int i = 0; i < count; i++) {
                if (words[i].equalsIgnoreCase(word)) {
                    exists = true;
                    break;
                }
            }
            if (exists) {
                System.out.println("This word already exists!");
            } else {
                // add the word to the array
                if (count == words.length) {
                    // resize the array if needed
                    words = Arrays.copyOf(words, words.length + 1);
                }
                words[count] = word;
                count++;
            }
        }

        // print all words in the array
        System.out.println("All words: ");
        for (int i = 0; i < count; i++) {
            System.out.println(words[i]);
        }
    }
}
