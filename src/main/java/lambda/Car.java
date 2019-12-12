package lambda;

public class Car {
    private String name;
    private int dir;

    public Car(String name, int dir) {
        this.name = name;
        this.dir = dir;
    }

    public Car move(MoveStrategy moveStrategy) {
        return this;
    }
}
