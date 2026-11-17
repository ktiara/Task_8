package task8;

public class Blowfish extends Fish implements AnimalBehavior {
    private int diameter; // in cm

    public Blowfish() {
        super();
        this.diameter = 0;
    }

    public Blowfish(String name, int age, int weight, String scaleColor, int diameter) {
        super(name, age, weight, scaleColor);
        this.diameter = diameter;
    }

    public Blowfish(String name, int diameter) {
        super(name, 0);
        this.diameter = diameter;
    }

    @Override
    public void getVoice() {
        System.out.println(getName() + " the blowfish makes a quiet pop");
    }

    @Override
    public void sleep() {
        System.out.println(getName() + " the blowfish sleeps near the seabed");
    }

    @Override
    public void move() {
        System.out.println("Blowfish swim");
    }

    public void blows() {
        diameter *= 2;
        System.out.println(getName() + " blows up! Diameter is now " + diameter + " cm");
    }

    public int getDiameter() { return diameter; }
    public void setDiameter(int diameter) { this.diameter = diameter; }

    @Override
    public String toString() {
        return "Blowfish{" + super.toString() + ", diameter=" + diameter + "}";
    }
}