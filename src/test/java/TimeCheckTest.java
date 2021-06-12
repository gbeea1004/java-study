import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

class TimeCheckTest {
    private TimeCheck timeCheck;

    @BeforeEach
    public void setUp() throws Exception {
        timeCheck = new TimeCheck();
    }

    @Test
    void checkCurrentTimeMillis() {
        timeCheck.checkCurrentTimeMillis();
    }

    @Test
    void checkCurrentTimeNano() {
        timeCheck.checkCurrentTimeNano();
    }
}
