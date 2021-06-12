import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

import java.util.ArrayList;
import java.util.List;

import static org.assertj.core.api.Assertions.assertThat;


class ContainsExactlyTest {
    @Test
    void 모든값이_포함되어있는가() {
        List<String> alphabet = new ArrayList<>();
        alphabet.add("User");
        alphabet.add("B");
        alphabet.add("C");
        assertThat(alphabet).containsExactly("User", "B", "C");
    }

    @Test
    void 모든값이_포함되어있지_않다면_에러() {
        Assertions.assertThrows(AssertionError.class, () -> assertThat(new String[]{"1", "2"}).containsExactly("1"));
    }
}
