package designpattern.strategy;

public class Gun implements Weapon {
    @Override
    public String attack() {
        return "총";
    }
}
