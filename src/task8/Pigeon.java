package task8;

public class Pigeon extends Bird implements AnimalBehavior {
    private String species;

    public Pigeon() {
        super();
        this.species = "Unknown";
    }

    public Pigeon(String name, int age, int weight, String featherColor, String species) {
        super(name, age, weight, featherColor);
        this.species = species;
    }

    public Pigeon(String name, String species) {
        super(name, 0);
        this.species = species;
    }

    @Override
    public void getVoice() {
        System.out.println(getName() + " the pigeon says: Coo-coo!");
    }

    @Override
    public void sleep() {
        System.out.println(getName() + " the pigeon sleeps on a roof");
    }

    @Override
    public void move() {
        System.out.println("Pigeon fly");
    }

    public void transportsMail() {
        System.out.println(getName() + " delivers a letter");
    }

    public String getSpecies() { return species; }
    public void setSpecies(String species) { this.species = species; }

    @Override
    public String toString() {
        return "Pigeon{" + super.toString() + ", species='" + species + "'}";
    }
}