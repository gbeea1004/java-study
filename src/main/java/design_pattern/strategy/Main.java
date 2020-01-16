package design_pattern.strategy;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

public class Main {
    private static final Logger log = LoggerFactory.getLogger(Main.class);

    public static void main(String[] args) {
        Person personA = new Person(new Knife());
        log.debug(personA.attack());

        // 전략 변경
        personA.changeWeapon(new Gun());
        log.debug(personA.attack());
    }
}
