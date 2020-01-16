package design_pattern.strategy;

public class Person {
    private Weapon weapon;

    public Person(Weapon weapon) {
        this.weapon = weapon;
    }

    public String attack() {
        return weapon.attack() + "으로 공격합니다.";
    }

    public void changeWeapon(Weapon weapon) {
        this.weapon = weapon;
    }
}
