import java.util.Scanner;
public class Average2 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.print("First number: ");
        double num1 = scan.nextDouble();
        System.out.print("Second number: ");
        double num2 = scan.nextDouble();
        System.out.print("Third number: ");
        double num3 = scan.nextDouble();
        System.out.print("Fourth number: ");
        double num4 = scan.nextDouble();
        double average = (num1 + num2 + num3 + num4) / 4;
        System.out.print("The average, calculated with whole number division is " + String.format("%.0f \n" , average));
        System.out.print("The average, calculated with decimal number division is " + String.format("%.2f \n" , average));

    }
}
