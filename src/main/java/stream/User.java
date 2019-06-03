package stream;

public class User extends Person {
    private String name;

    public User(String name, int age) {
        this.name = name;
        this.age = age;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    @Override
    void move() {
        System.out.println("움직임");
    }
}
