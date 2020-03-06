package tddstudy.step3;

import org.junit.Test;

import java.time.LocalDate;

import static org.assertj.core.api.Java6Assertions.assertThat;

public class ExpiryDateCalculatorTest {

    @Test
    public void 만원_납부하면_한달_뒤가_만료일이_됨() {
        assertExpiryDate(
                PayData.builder()
                       .billingDate(LocalDate.of(2020, 3, 6))
                       .payAmount(10000)
                       .build(),
                LocalDate.of(2020, 4, 6));

        assertExpiryDate(
                PayData.builder()
                       .billingDate(LocalDate.of(2020, 1, 1))
                       .payAmount(10000)
                       .build(),
                LocalDate.of(2020, 2, 1)
        );
    }

    @Test
    public void 납부일과_한달_뒤_일자가_같지_않음() {
        assertExpiryDate(
                PayData.builder()
                       .billingDate(LocalDate.of(2019, 1, 31))
                       .payAmount(10000)
                       .build(),
                LocalDate.of(2019, 2, 28)
        );
        assertExpiryDate(
                PayData.builder()
                       .billingDate(LocalDate.of(2019, 5, 31))
                       .payAmount(10000)
                       .build(),
                LocalDate.of(2019, 6, 30)
        );
        assertExpiryDate(
                PayData.builder()
                       .billingDate(LocalDate.of(2020, 1, 31))
                       .payAmount(10000)
                       .build(),
                LocalDate.of(2020, 2, 29)
        );
    }

    @Test
    public void 첫_납부일과_만료일_일자가_다를때_만원_납부() {
        assertExpiryDate(
                PayData.builder()
                       .firstBillingDate(LocalDate.of(2019, 1, 31))
                       .billingDate(LocalDate.of(2019, 2, 28))
                       .payAmount(10000)
                       .build(),
                LocalDate.of(2019, 3, 31)
        );

        assertExpiryDate(
                PayData.builder()
                       .firstBillingDate(LocalDate.of(2019, 1, 30))
                       .billingDate(LocalDate.of(2019, 2, 28))
                       .payAmount(10000)
                       .build(),
                LocalDate.of(2019, 3, 30)
        );

        assertExpiryDate(
                PayData.builder()
                       .firstBillingDate(LocalDate.of(2019, 5, 31))
                       .billingDate(LocalDate.of(2019, 6, 30))
                       .payAmount(10000)
                       .build(),
                LocalDate.of(2019, 7, 31)
        );
    }

    private void assertExpiryDate(PayData payData, LocalDate expectedExpiryDate) {
        ExpiryDateCalculator calculator = new ExpiryDateCalculator();
        LocalDate expiryDate = calculator.calculateExpiryDate(payData);
        assertThat(expiryDate).isEqualTo(expectedExpiryDate);
    }
}
