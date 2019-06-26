package dip.use;

public class Person {
    private Food food;

    public Person(Food food) {
        this.food = food;
    }

    public void eat() {
        food.eat();
    }
}
