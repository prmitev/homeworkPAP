public class TempConverter {
    public static void main(String arg[])
    {
        float Fahrenheit, Celsius;
        Fahrenheit = 98;
        Celsius  = ((Fahrenheit-32)*5)/9;
        System.out.println("Temperature in Fahrenheit is: " + Fahrenheit);
        System.out.println("Temperature in Celsius is: " + Celsius);
    }
}
