public class Main {
    public static void main(String[] args) {
        int speed_of_light = 299792458;
        double earth_gravity = 9.800000;
        long milky_way_stars = 300000000000L;
        int earth_radius = 6378;
        int stars_number = 8;
        String biggest_planet = "Jupiter";
        double jupiter_gravity = 24.79001;
        boolean gravity_comparison = true;

        System.out.println("The speed of light is " + speed_of_light + " m/s");
        System.out.println("The gravity of the Earth is " + earth_gravity + " m/s2");
        System.out.println("There are " + milky_way_stars + " stars in the Milky Way Galaxy");
        System.out.println("The radius of the Earth is " + earth_radius + " km");
        System.out.println("There are " + stars_number + " planets in the Solar System");
        System.out.println("The largest planet in the Solar system is " + biggest_planet);
        System.out.println("The gravity of Jupiter is " + jupiter_gravity + " m/s2");
        System.out.println("Is Jupiter gravity stronger than Earth's: " + gravity_comparison);
    }
}