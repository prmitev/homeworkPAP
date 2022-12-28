import java.util.Scanner;
public class CoffeeShop {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);

        int coffee = 0;

        System.out.println("How much coffee would you like (in ml)? ");
        int amount = s.nextInt();

        if (amount <= 20){
            System.out.println("\n Must be > 20 ml ");
            return;
        }
        if ( amount >= 20 && amount <= 30 ) {
            System.out.println("\n Short coffee ");
        }
        if ( amount >= 30 && amount <= 80 ) {
            int longCoffee = coffee + 30;
            System.out.println("\n Long coffee ");
        }
        if (amount > 80){
            System.out.println("Must be less than or equal to 80 ml. ");
            return;
        }

        System.out.println("Which brand do you prefer: ");
        String brand = s.next();

        if("Lavazza".equals(brand)){
            double lavazzaPrice = coffee + 1;
            System.out.println(" Your cup of " + brand + " coffee will cost " + lavazzaPrice + " leva") ;}
        else if (("Nescafe".equals(brand))){
            double longCoffee = coffee + 0.30;
            double nescafePrice = longCoffee + 0.85;
            System.out.println(" Your cup of " + brand + " coffee will cost " + nescafePrice + " leva") ;}
        else if("Illy".equals(brand)){
            double lavazzaPrice = coffee + 1;
            double illyPrice = lavazzaPrice + 0.99;
            System.out.println(" Your cup of " + brand + " coffee will cost " + illyPrice + " leva") ;}
        else {
        System.out.println(" \n Unknown brand ");}




    }
}
