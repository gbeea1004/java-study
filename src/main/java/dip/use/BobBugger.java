package dip.use;

public class BobBugger implements Food {
    private String name;

    public BobBugger() {
        name = "밥버거";
    }

    @Override
    public void eat() {
        System.out.println("꿀꿀 " + name + "맛있다.");
    }
}
