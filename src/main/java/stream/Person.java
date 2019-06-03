package stream;

abstract class Person {
    protected int age;

    abstract void move();

    public void addAge() {
        age++;
    }
}
