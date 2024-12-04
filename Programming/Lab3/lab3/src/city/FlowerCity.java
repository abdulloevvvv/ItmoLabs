package city;

import characters.Character;
import java.util.ArrayList;
import java.util.List;

public class FlowerCity {
    private String name;
    private List<Character> residents;

    public FlowerCity(String name) {
        this.name = name;
        this.residents = new ArrayList<>();
    }

    public void addResident(Character resident) {
        residents.add(resident);
    }

    public void showCityView() {
        System.out.println("Цветочный город виден как на ладони.");
    }
}
