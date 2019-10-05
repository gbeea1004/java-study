package books.object.movie_reservation;

import org.junit.Before;
import org.junit.Test;

import static org.assertj.core.api.Assertions.assertThat;

public class MoneyTest {
    private Money money;

    @Before
    public void setUp() throws Exception {
        money = Money.wons(10000);
    }

    @Test
    public void plusTest() {
        assertThat(money.plus(Money.wons(1000))).isEqualTo(Money.wons(11000));
    }

    @Test
    public void minusTest() {
        assertThat(money.minus(Money.wons(1000))).isEqualTo(Money.wons(9000));
    }

    @Test
    public void compareTest() {
        assertThat(money.isLessThan(Money.wons(20000))).isTrue();
        assertThat(money.isLessThan(Money.wons(10001))).isTrue();
        assertThat(money.isLessThan(Money.wons(10000))).isFalse();
        assertThat(money.isLessThan(Money.wons(9999))).isFalse();

        assertThat(money.isGreaterThanOrEqual(Money.wons(9999))).isTrue();
        assertThat(money.isGreaterThanOrEqual(Money.wons(10000))).isTrue();
        assertThat(money.isGreaterThanOrEqual(Money.wons(20000))).isFalse();
        assertThat(money.isGreaterThanOrEqual(Money.wons(10001))).isFalse();
    }
}