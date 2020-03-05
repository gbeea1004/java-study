package tddstudy.step2;

import org.junit.Before;
import org.junit.Test;

import static org.assertj.core.api.Assertions.assertThat;

public class PasswordStrengthMeterTest {
    private PasswordStrengthMeter meter;

    @Before
    public void setUp() throws Exception {
        meter = new PasswordStrengthMeter();
    }

    private void assertStrength(String password, PasswordStrength expStr) {
        assertThat(meter.meter(password)).isEqualTo(expStr);
    }

    @Test
    public void meetsAllCriteria_Then_Strong() {
        assertStrength("ab12!@AB", PasswordStrength.STRONG);
        assertStrength("abc1!Add", PasswordStrength.STRONG);
    }

    @Test
    public void meetsOtherCriteria_except_for_Length_Then_Normal() {
        assertStrength("av!13A", PasswordStrength.NORMAL);
        assertStrength("AA!32", PasswordStrength.NORMAL);
    }

    @Test
    public void meetsOtherCriteria_except_for_number_Then_Normal() {
        assertStrength("abAw@rrr", PasswordStrength.NORMAL);
    }

    @Test
    public void nullInput_Then_Invalid() {
        assertStrength(null, PasswordStrength.INVALID);
    }

    @Test
    public void emptyInput_Then_Invalid() {
        assertStrength("", PasswordStrength.INVALID);
    }

    @Test
    public void meetsOtherCriteria_except_for_Uppercase_Then_Normal() {
        assertStrength("ds2!@feqqqq", PasswordStrength.NORMAL);
    }

    @Test
    public void meetsOnlyLengthCriteria_Then_Weak() {
        assertStrength("aebebebessef", PasswordStrength.WEAK);
    }

    @Test
    public void meetsOnlyNumCriteria_Then_Weak() {
        assertStrength("124", PasswordStrength.WEAK);
    }

    @Test
    public void meetsOnlyUpperCriteria_Then_Weak() {
        assertStrength("ABEW", PasswordStrength.WEAK);
    }
}
