package task8;

public class Bird extends Animal {
    private String featherColor;

    public Bird() {
        super();
        this.featherColor = "Unknown";
    }

    public Bird(String name, int age, int weight, String featherColor) {
        super(name, age, weight);
        this.featherColor = featherColor;
    }

    public Bird(String name, int age) {
        super(name, age);
        this.featherColor = "Unknown";
    }

    @Override
    public void eat(String food) {
        System.out.println(getName() + " (bird) pecks " + food);
    }

    @Override
    public void getVoice() {
        System.out.println(getName() + " chirps");
    }

    public void layEggs() {
        System.out.println(getName() + " lays eggs");
    }

    public String getFeatherColor() { return featherColor; }
    public void setFeatherColor(String featherColor) { this.featherColor = featherColor; }

    @Override
    public String toString() {
        return "Bird{" + super.toString() + ", featherColor='" + featherColor + "'}";
    }
}