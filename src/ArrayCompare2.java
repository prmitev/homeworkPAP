import java.util.Scanner;

public class ArrayCompare2 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("How many in the first array: ");
        int n1 = scanner.nextInt();
        double[] array1 = new double[n1];
        for (int i = 0; i < n1; i++) {
            System.out.print("1st array number: ");
            array1[i] = scanner.nextDouble();}

        System.out.print("How many in the second array: ");
        int n2 = scanner.nextInt();
        String[] array2 = new String[n2];
        for (int i = 0; i < n2; i++) {
            System.out.print("2nd array number: ");
            array2[i] = scanner.next();
        }



        // compare the elements of the two arrays
        System.out.println("Match: ");
        for (double d : array1) {
            int x = (int) d;
            for (String s : array2) {
                int y = Integer.parseInt(s);
                if (x == y) {
                    System.out.println(x);
                }
            }
        }
    }
}
