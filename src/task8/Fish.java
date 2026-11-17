package task8;

public class Fish extends Animal {
    private String scaleColor;

    public Fish() {
        super();
        this.scaleColor = "Unknown";
    }

    public Fish(String name, int age, int weight, String scaleColor) {
        super(name, age, weight);
        this.scaleColor = scaleColor;
    }

    public Fish(String name, int age) {
        super(name, age);
        this.scaleColor = "Unknown";
    }

    @Override
    public void eat(String food) {
        System.out.println(getName() + " (fish) eats " + food);
    }

    @Override
    public void getVoice() {
        System.out.println(getName() + " is silent... (blub blub)");
    }

    public void swim() {
        System.out.println(getName() + " swims");
    }

    public String getScaleColor() { return scaleColor; }
    public void setScaleColor(String scaleColor) { this.scaleColor = scaleColor; }

    @Override
    public String toString() {
        return "Fish{" + super.toString() + ", scaleColor='" + scaleColor + "'}";
    }
}