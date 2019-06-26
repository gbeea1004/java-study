package dip.use;

public class Pizza implements Food {
    private String name;

    public Pizza() {
        name = "피자";
    }

    @Override
    public void eat() {
        System.out.println("꿀꿀 " + name + "맛있다.");
    }
}
