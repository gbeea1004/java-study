package dip.not_use;

public class Person {
    private Pizza pizza; // 밥버거를 먹고싶으면 Person의 내부를 또 바꿔줘야함.

    public Person(Pizza pizza) {
        this.pizza = pizza;
    }

    public void eat() {
        System.out.println("꿀꿀 " + pizza.getName() + "맛있다.");
    }
}
