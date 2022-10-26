import java.util.Scanner;
public class TriangleArea {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        System.out.print("Please enter A: \n");
        double a = s.nextDouble();
        System.out.print("Please enter C (hypotenuse): \n");
        double c = s.nextDouble();
        double b = Math.sqrt(Math.pow(c , 2) - (Math.pow(a , 2)));
        double area = (a * b) / 2;
        System.out.print("The area of the triangle is " + String.format("%.3f" , area));
    }
}
