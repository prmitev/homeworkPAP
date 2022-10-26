import java.util.Scanner;
import java.lang.Math;
public class DiceRoll {
    public static void main(String[] args) {
        Scanner num = new Scanner(System.in);
        System.out.print("Desired sum of two rolls: ");
        int a = num.nextInt();

        int min = 1;
        int max = 6;
        int b = (int) (Math.random() * (max - min + 1) + min);
        int c = (int) (Math.random() * (max - min + 1) + min);
        int sum = b + c;
        System.out.println("First roll was " + b + ", second roll was " + c + ", the sum is " + sum);

        if (a < sum){
            System.out.print("Win: false");
        } else if (a > sum){
            System.out.print("Win: false");
        } else {
            System.out.print("Win: true");
        }
        }
    }

