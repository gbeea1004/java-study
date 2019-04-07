import org.junit.Test;

import java.util.ArrayList;
import java.util.List;

import static org.assertj.core.api.Assertions.assertThat;

public class ContainsExactlyTest {
    @Test
    public void 모든값이_포함되어있는가() {
        List<String> alphabet = new ArrayList<>();
        alphabet.add("User");
        alphabet.add("B");
        alphabet.add("C");
        assertThat(alphabet).containsExactly("User", "B", "C");
    }

    @Test(expected = AssertionError.class)
    public void 모든값이_포함되어있지_않다면_에러() {
        String[] s = {"1", "2"};
        assertThat(s).containsExactly("1");
    }
}
