import java.util.Scanner;
public class Pyramid {
    public static void main(String[] args) {
        Scanner pyramid = new Scanner(System.in);
        System.out.print("a: ");
        int a = pyramid.nextInt();
        System.out.print("b: ");
        int b = pyramid.nextInt();
        System.out.print("h: ");
        int h = pyramid.nextInt();
        double vol = a * b * h;
        double V;
        V = vol / 3;
        System.out.format("The volume of a rectangular pyramid with sides " + a + " and " + b + " and height " + h + " is " + "%.3f\n" , V) ;
    }
}
