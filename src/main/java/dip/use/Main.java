package dip.use;

public class Main {
    public static void main(String[] args) {
        Person nori = new Person(new Pizza());
        nori.eat();

        Person nori2 = new Person(new BobBugger());
        nori2.eat();
    }
}
