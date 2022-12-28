import java.util.Scanner;
public class GeometricProgression {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);

        System.out.println("Min: ");
        int min = s.nextInt();

        System.out.println("Max: ");
        int max = s.nextInt();

        for (int i = min ; i <= max ; i++){
            double sum = Math.pow(i, i);
            System.out.println("\n" + sum);
        }

        }

        }


