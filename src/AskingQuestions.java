import java.util.*;
public class AskingQuestions {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        Scanner scanner = new Scanner(System.in);

        System.out.print("How old are you: ");
        int age = scan.nextInt();
        System.out.println("Age: " + age);

        System.out.print("What's the distance between Sofia and Berlin? ");
        int distance = scan.nextInt();
        System.out.println("The distance between Sofia and Berlin is " + distance + " km");

        System.out.print("How many people live in Bulgaria? ");
        int people = scan.nextInt();
        System.out.println("The population of Bulgaria is " + people);

        System.out.print("How much money do you have? ");
        double money = scan.nextDouble();
        System.out.println("I have " + money + " leva in my pocket.");

        System.out.print("Your name: ");
        String name = scanner.nextLine();
        System.out.println("My name is: " + name);

    }
}

