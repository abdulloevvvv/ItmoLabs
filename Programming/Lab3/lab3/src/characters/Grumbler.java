package characters;

public class Grumbler extends Character {
    private String mood;

    public Grumbler(String name, String mood) {
        super(name);
        this.mood = mood;
    }

    public String getMood() {
        return mood;
    }

    public void setMood(String mood) {
        this.mood = mood;
    }

    @Override
    public void speak() {
        System.out.println(getName() + " сказал: \"Все засмеялись!\"");
    }
}
