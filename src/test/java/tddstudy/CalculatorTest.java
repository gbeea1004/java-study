package tddstudy;

import org.junit.Test;

import static org.assertj.core.api.Assertions.assertThat;

public class CalculatorTest {

    @Test
    public void givenOneAndTwoWhenPlus_thenReturnThree() {
        assertThat(Calculator.plus(1, 2)).isEqualTo(3);
        assertThat(Calculator.plus(4, 1)).isEqualTo(5);
    }
}
