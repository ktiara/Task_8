package task8;

public class Mammal extends Animal {
    private String order;

    public Mammal() {
        super();
        this.order = "Unknown";
    }

    public Mammal(String name, int age, int weight, String order) {
        super(name, age, weight);
        this.order = order;
    }

    public Mammal(String name, int age) {
        super(name, age);
        this.order = "Unknown";
    }

    @Override
    public void eat(String food) {
        System.out.println(getName() + " (mammal) eats " + food);
    }

    @Override
    public void getVoice() {
        System.out.println(getName() + " makes a mammal sound");
    }

    public void drinkMilk() {
        System.out.println(getName() + " drinks milk");
    }

    public String getOrder() { return order; }
    public void setOrder(String order) { this.order = order; }

    @Override
    public String toString() {
        return "Mammal{" + super.toString() + ", order='" + order + "'}";
    }
}