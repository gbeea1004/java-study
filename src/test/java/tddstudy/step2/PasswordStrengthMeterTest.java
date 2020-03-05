package tddstudy.step2;

import org.junit.Test;

import static org.assertj.core.api.Assertions.assertThat;

public class PasswordStrengthMeterTest {
    @Test
    public void meetsAllCriteria_Then_Strong() {
        PasswordStrengthMeter meter = new PasswordStrengthMeter();
        PasswordStrength result = meter.meter("ab12!@AB");
        assertThat(result).isEqualTo(PasswordStrength.STRONG);
    }
}
