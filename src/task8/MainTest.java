package task8;

public class MainTest {
    public static void main(String[] args) {
        Animal[] animals = {
                new Dog("Rex", 3, 25, "Carnivora", "Labrador"),
                new Blowfish("Puffy", 2, 1, "Yellow", 10),
                new Pigeon("Coo", 1, 1, "Gray", "Homing pigeon"),
                new Mammal("Generic mammal", 4),
                new Fish("Generic fish", 1),
                new Bird("Generic bird", 2)
        };

        System.out.println("--- move() ---");
        for (Animal animal : animals) {
            animal.move();
        }

        System.out.println("\n--- name() ---");
        for (Animal animal : animals) {
            AnimalName.name(animal.getName());
        }

        AnimalBehavior[] behaviors = {
                new Dog("Rex", 3, 25, "Carnivora", "Labrador"),
                new Pigeon("Coo", 1, 1, "Gray", "Homing pigeon"),
                new Blowfish("Puffy", 2, 1, "Yellow", 10)
        };
        System.out.println("\n--- sleep() ---");
        behaviors[0].sleep();
        behaviors[1].sleep();
        behaviors[2].sleep();
    }
}