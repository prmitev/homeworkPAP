import java.util.Scanner;
import java.util.Stack;

public class DigitNames {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Number: ");
        int number = scanner.nextInt();

        String[] names = { "zero", "one", "two", "three", "four", "five", "six", "seven", "eight", "nine" };
        Stack<String> stack = new Stack<>();

        // extract the digits from the number and store their names in the stack
        while (number > 0) {
            int digit = number % 10;
            stack.push(names[digit]);
            number /= 10;
        }

        // pop the elements from the stack and print them
        while (!stack.isEmpty()) {
            System.out.print(stack.pop() + "\n");
        }
    }
}
