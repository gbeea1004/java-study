package designpattern.templatecallback;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

import java.util.Objects;

import static org.assertj.core.api.Assertions.assertThat;

class CalculatorTest {

    private Calculator calculator;
    private String numFilePath1;
    private String numFilePath2;

    @BeforeEach
    void setUp() {
        calculator = new Calculator();
        numFilePath1 = Objects.requireNonNull(getClass().getResource("/mock/number/numbers1.txt"))
                              .getPath();
        numFilePath2 = Objects.requireNonNull(getClass().getResource("/mock/number/numbers2.txt"))
                              .getPath();
    }

    @Test
    @DisplayName("N 개의 숫자 덧샘")
    void sumOfNumbers() {
        assertThat(calculator.calcSum(numFilePath1)).isEqualTo(10);
        assertThat(calculator.calcSum(numFilePath2)).isEqualTo(30);
    }

    @Test
    @DisplayName("N 개의 숫자 곱셈")
    void multiplyOfNumbers() {
        assertThat(calculator.calcMultiply(numFilePath1)).isEqualTo(24);
        assertThat(calculator.calcMultiply(numFilePath2)).isEqualTo(200);
    }
}