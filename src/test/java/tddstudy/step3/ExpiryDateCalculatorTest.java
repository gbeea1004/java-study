package tddstudy.step3;

import org.junit.Test;

import java.time.LocalDate;

import static org.assertj.core.api.Java6Assertions.assertThat;

public class ExpiryDateCalculatorTest {

    @Test
    public void 만원_납부하면_한달_뒤가_만료일이_됨() {
        LocalDate billingDate = LocalDate.of(2020, 3, 6);
        int payAmount = 10000;

        ExpiryDateCalculator calculator = new ExpiryDateCalculator();
        LocalDate expiryDate = calculator.calculateExpiryDate(billingDate, payAmount);

        assertThat(expiryDate).isEqualTo(LocalDate.of(2020, 4, 6));

        LocalDate billingDate2 = LocalDate.of(2020, 1, 1);
        int payAmount2 = 10000;

        ExpiryDateCalculator calculator2 = new ExpiryDateCalculator();
        LocalDate expiryDate2 = calculator2.calculateExpiryDate(billingDate2, payAmount2);

        assertThat(expiryDate2).isEqualTo(LocalDate.of(2020, 2, 1));
    }
}
