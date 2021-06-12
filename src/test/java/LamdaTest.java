import org.junit.jupiter.api.Test;

import static org.assertj.core.api.Assertions.assertThat;

class LamdaTest {
    @Test
    void 람다식안쓸때() {
        assertThat(max(1, 2)).isEqualTo(2);
    }

    private int max(int a, int b) {
        return a > b ? a : b;
    }

    @Test
    void 람다식쓸때() {
        Calculator calculator = (int a, int b) -> a > b ? a : b;
        assertThat(calculator.max(1, 2)).isEqualTo(2);
    }
}

@FunctionalInterface // 함수형 인터페이스
interface Calculator {
    public abstract int max(int a, int b);
}
