package data_structure;

import org.junit.Test;

import static org.assertj.core.api.Assertions.assertThat;

public class FibonacciTest {
    @Test
    public void 피보나치수열() {
        assertThat(Fibo.startNo(1)).isEqualTo(0);
        assertThat(Fibo.startNo(2)).isEqualTo(1);
        assertThat(Fibo.startNo(3)).isEqualTo(1);
        assertThat(Fibo.startNo(4)).isEqualTo(2);
        assertThat(Fibo.startNo(5)).isEqualTo(3);
    }
}
