import characters.Grumbler;
import city.FlowerCity;
import objects.Balloon;
import objects.Coordinates;

public class Main {
    public static void main(String[] args) {
        FlowerCity city = new FlowerCity("Цветочный город");
        Grumbler grumbler = new Grumbler("Ворчун", "Скучное");
        city.addResident(grumbler);

        Balloon balloon = new Balloon(new Coordinates(0, 0));
        System.out.println("Воздушный шар поднялся еще выше.");
        balloon.move();

        city.showCityView();
        grumbler.speak();

        System.out.println("Шар движется дальше, оставляя город позади.");
    }
}
