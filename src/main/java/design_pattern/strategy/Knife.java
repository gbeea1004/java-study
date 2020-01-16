package design_pattern.strategy;

public class Knife implements Weapon {

    @Override
    public String attack() {
        return "검";
    }
}
