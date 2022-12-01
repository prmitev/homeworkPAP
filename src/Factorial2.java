import java.util.*;
public class Factorial2 {
    public static void factorial(int min, int max) {

        for (int i = min; i <= max; i++) {
            long factorial = 1;
            for (int j = 1; j <= i; j++) {
                factorial = factorial * j;
            }

            System.out.printf("\n %d! = %d", i, factorial);
        }
    }
    public static void main(String[] args) {

        Scanner s = new Scanner(System.in);

        System.out.println("From: ");
        int min = s.nextInt();

        System.out.println("To: ");
        int max = s.nextInt();


        factorial(min, max);
    }
}










