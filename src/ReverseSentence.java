import java.util.Scanner;

public class ReverseSentence {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter a sentence: ");
        String sentence = scanner.nextLine();

        // split the sentence into words
        String[] words = sentence.split(" ");

        // reverse the array of words
        for (int i = 0; i < words.length / 2; i++) {
            String temp = words[i];
            words[i] = words[words.length - 1 - i];
            words[words.length - 1 - i] = temp;
        }

        // make a single string from the array of words
        String reversedSentence = String.join(" ", words);


        //print the original sentence
        System.out.println("Original order: \n" + sentence);

        // print the reversed sentence
        System.out.println("Reverse sentence: \n" + reversedSentence);
    }
}
