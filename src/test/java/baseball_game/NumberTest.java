package baseball_game;

import org.junit.Test;

public class NumberTest {
    @Test(expected = IllegalArgumentException.class)
    public void noThreeDigits() {
        Number number = new Number(1234);
    }
}
