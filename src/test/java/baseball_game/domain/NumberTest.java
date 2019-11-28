package baseball_game.domain;

import org.junit.Test;

public class NumberTest {
    @Test(expected = IllegalArgumentException.class)
    public void givenThreeDigitsNumberThenError() {
        Number number = new Number(1234);
    }

    @Test(expected = IllegalArgumentException.class)
    public void givenDuplicateNumberThenError() {
        Number number = new Number(111);
    }
}
