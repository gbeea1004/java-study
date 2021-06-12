package baseball_game.domain;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

class NumberTest {
    @Test
    void givenThreeDigitsNumberThenError() {
        Assertions.assertThrows(IllegalArgumentException.class, () -> new Number(1234));
    }

    @Test
    void givenDuplicateNumberThenError() {
        Assertions.assertThrows(IllegalArgumentException.class, () -> new Number(111));
    }
}
