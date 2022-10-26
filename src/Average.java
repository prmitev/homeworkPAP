import java.util.Scanner;
public class Average {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.print("First number: ");
        double num1 = scan.nextDouble();
        System.out.print("Second number: ");
        double num2 = scan.nextDouble();
        System.out.print("Third number: ");
        double num3 = scan.nextDouble();
        scan.close();
        double average = (num1 + num2 + num3) / 3;
        System.out.format("The average is %,.4f\n", average);
    }
}

