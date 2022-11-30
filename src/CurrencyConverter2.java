import java.util.Scanner;
public class CurrencyConverter2 {
    public static void main(String[] args) {
        double priceUSD = 1.72;
        double priceEUR = 1.9558;

        Scanner scanner = new Scanner(System.in);

        System.out.println("\n Amount: ");
        double amount = scanner.nextDouble();

        System.out.println("\n From: ");
        String from = scanner.next();

        System.out.println("\n To: ");
        String to = scanner.next();

        if (from.equals("USD") && to.equals("BGN")) {
            double result_BGN_USD = amount * priceUSD ;
            System.out.println(" \n Result: " + String.format("%.4f" ,result_BGN_USD ));}

        if (from.equals("BGN") && to.equals("EUR")) {
            double result_BGN_EUR = amount  / priceEUR;
            System.out.println("\n Result: " + String.format("%.4f" , result_BGN_EUR ));}

        if (from.equals("USD") && to.equals("USD")) {
            System.out.println("\n Result: " + String.format("%.4f" , amount));}

        else {
            System.out.println("\n Unknown conversion ");}
    }
}
