package task8;

public interface AnimalMove {
    default void move() {
        System.out.println("Class " + this.getClass().getSimpleName()
                + ": the animal moves in some general way");
    }
}