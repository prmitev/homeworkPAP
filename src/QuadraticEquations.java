import java.util.Scanner;
public class QuadraticEquations {
    public static void main(String[] Strings) {
        Scanner input = new Scanner(System.in);
        System.out.print("Enter A: ");
        double a = input.nextDouble();
        System.out.print("Enter B: ");
        double b = input.nextDouble();
        System.out.print("Enter C: ");
        double c = input.nextDouble();
        double d = b * b - 4.0 * a * c;
        if (d > 0.0) {
            double x2 = (-b + Math.pow(d, 0.5)) / (2.0 * a);
            double x1 = (-b - Math.pow(d, 0.5)) / (2.0 * a);
            System.out.println("x1 = " + x1);
            System.out.println("x2 = " + x2);
        }
        }
    }
