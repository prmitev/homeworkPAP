import java.util.Scanner;

public class Factorial1 {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);

        System.out.println(" Factorial of: ");

        int num = s.nextInt();
        int i = 1;
        long factorial = 1;
        while(i <= num)
        {
            factorial *= i;
            i++;
        }
        System.out.printf(" %d! = %d", num, factorial);
    }
}


