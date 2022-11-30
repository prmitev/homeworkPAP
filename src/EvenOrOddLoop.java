import java.util.Scanner;

public class EvenOrOddLoop {
    public static void main(String[] args) {

        Scanner s = new Scanner(System.in);

        System.out.println("Start from: ");
        int min = s.nextInt();

        System.out.println("Up to: ");
        int max = s.nextInt();

        for (int i=min; i<=max; i++){
            if (i % 2 == 0){
                System.out.println(i+ " is even");}
            else if ( i % 2 == 1) {
                System.out.println(i+ " is odd");
            }
        }


        }
    }




