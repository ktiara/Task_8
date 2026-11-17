package task8;

public class Dog extends Mammal implements AnimalBehavior {
    private String breed;

    public Dog() {
        super();
        this.breed = "Unknown";
    }

    public Dog(String name, int age, int weight, String order, String breed) {
        super(name, age, weight, order);
        this.breed = breed;
    }

    public Dog(String name, String breed) {
        super(name, 0);
        this.breed = breed;
    }

    @Override
    public void eat(String food) {
        System.out.println(getName() + " the dog gobbles up " + food);
    }

    @Override
    public void getVoice() {
        System.out.println(getName() + " says: Woof!");
    }

    @Override
    public void sleep() {
        System.out.println(getName() + " the dog sleeps curled up");
    }

    @Override
    public void move() {
        System.out.println("Dog run");
    }

    public void aport() {
        System.out.println(getName() + " fetches the stick!");
    }

    public String getBreed() { return breed; }
    public void setBreed(String breed) { this.breed = breed; }

    @Override
    public String toString() {
        return "Dog{" + super.toString() + ", breed='" + breed + "'}";
    }
}