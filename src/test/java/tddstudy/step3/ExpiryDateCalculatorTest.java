package tddstudy.step3;

import org.junit.Test;

import java.time.LocalDate;

import static org.assertj.core.api.Java6Assertions.assertThat;

public class ExpiryDateCalculatorTest {

    @Test
    public void 만원_납부하면_한달_뒤가_만료일이_됨() {
        assertExpiryDate(
                LocalDate.of(2020, 3, 6),
                10000,
                LocalDate.of(2020, 4, 6));

        assertExpiryDate(
                LocalDate.of(2020, 1, 1),
                10000,
                LocalDate.of(2020, 2, 1)
        );
    }

    private void assertExpiryDate(LocalDate billingDate, int payAmount, LocalDate expectedExpiryDate) {
        ExpiryDateCalculator calculator = new ExpiryDateCalculator();
        LocalDate expiryDate = calculator.calculateExpiryDate(billingDate, payAmount);
        assertThat(expiryDate).isEqualTo(expectedExpiryDate);
    }
}
