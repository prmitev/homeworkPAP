import java.util.Scanner;
public class TimeCalculator {
    public static void main(String[] args) {
        Scanner sec = new Scanner(System.in);
        System.out.print(" How many seconds? ");
        int seconds = sec.nextInt();
        double H = seconds / 60f;
        H = H / 60f;
        double M = seconds / 60f;
        double D = H / 24f;
        double W = D / 7f;
        double Y = D / 365f;
        System.out.println(" Minutes: " + String.format("%.10f" , M));
        System.out.println(" Hours: " + String.format("%.10f" , H));
        System.out.println(" Days: " + String.format("%.10f" , D));
        System.out.println(" Weeks " + String.format("%.10f" , W));
        System.out.println(" Years: " + String.format("%.10f" , Y));
    }
}
