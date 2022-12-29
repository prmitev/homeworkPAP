import java.util.Scanner;

public class SentenceCompare {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("First sentence: ");
        String sentence1 = scanner.nextLine();
        String[] words1 = sentence1.split(" ");

        System.out.print("Second sentence: ");
        String sentence2 = scanner.nextLine();
        String[] words2 = sentence2.split(" ");

        System.out.print("Third sentence: ");
        String sentence3 = scanner.nextLine();
        String[] words3 = sentence3.split(" ");

        // find matching words
        boolean found = false;
        for (String word1 : words1) {
            for (String word2 : words2) {
                for (String word3 : words3) {
                    if (word1.equalsIgnoreCase(word2) && word2.equalsIgnoreCase(word3)) {
                        System.out.println("The word " + word1 + " is in all three sentences.");
                        found = true;
                    }
                }
            }
        }
        if (!found) {
            System.out.println("No match");
        }
    }
}
