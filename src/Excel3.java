import java.util.Arrays;
import java.util.Scanner;

public class Excel3 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int[] numbers = new int[5];
        int count = 0;
        int sum = 0;
        int min = Integer.MAX_VALUE;
        int max = Integer.MIN_VALUE;

        // read numbers from the keyboard
        System.out.println("Enter positive numbers, or a negative number to stop:");
        while (true) {
            int number = scanner.nextInt();
            if (number < 0) {
                break;
            }

            // resize the array if necessary
            if (count == numbers.length) {
                numbers = Arrays.copyOf(numbers, numbers.length + 1);
            }

            // store the number and update statistics
            numbers[count] = number;
            if (number != 0) {
                sum += number;
                count++;
                min = Math.min(min, number);
                max = Math.max(max, number);
            }
        }

        // calculate and print the results
        double average = (double) sum / count;
        System.out.printf("SUM=%d, AVERAGE=%.2f, COUNT=%d, MIN=%d, MAX=%d\n", sum, average, count, min, max);
        System.out.println("Numbers: " + Arrays.toString(numbers));
    }
}
