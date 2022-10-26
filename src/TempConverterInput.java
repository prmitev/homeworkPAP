import java.util.Scanner;
public class TempConverterInput {

    public static void main(String[] args)
    {
        double celsius, fahrenheit;
        Scanner s = new Scanner(System.in);
        System.out.print("What's the temperature in Fahrenheit? ");
        fahrenheit = s.nextDouble();
        System.out.println("Temperature in Fahrenheit is: " + fahrenheit);
        celsius = (fahrenheit - 32) * (0.5556);
        System.out.printf("Temperature in Celsius is: " + String.format("%.2f" , celsius));
    }
}

