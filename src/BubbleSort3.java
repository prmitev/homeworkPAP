import java.util.Scanner;

public class BubbleSort3 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Sentence: ");
        String sentence = scanner.nextLine();

        // split the sentence into words
        String[] words = sentence.split(" ");

        // sort the words alphabetically
        for (int i = 0; i < words.length - 1; i++) {
            for (int j = i + 1; j < words.length; j++) {
                if (words[i].compareToIgnoreCase(words[j]) > 0) {
                    String temp = words[i];
                    words[i] = words[j];
                    words[j] = temp;
                }
            }
        }

        // print the sorted words
        for (String word : words) {
            System.out.println(word);
        }
    }
}
