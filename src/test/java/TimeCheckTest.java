import org.junit.Before;
import org.junit.Test;

public class TimeCheckTest {
    private TimeCheck timeCheck;

    @Before
    public void setUp() throws Exception {
        timeCheck = new TimeCheck();
    }

    @Test
    public void checkCurrentTimeMillis() {
        timeCheck.checkCurrentTimeMillis();
    }

    @Test
    public void checkCurrentTimeNano() {
        timeCheck.checkCurrentTimeNano();
    }
}
