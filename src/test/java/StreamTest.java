import org.junit.Test;

import java.util.stream.Stream;

import static org.assertj.core.api.Assertions.assertThat;

public class StreamTest {
    @Test
    public void 연산() {
        Stream<String> stream = Stream.of("1", "2");
        assertThat(stream.count()).isEqualTo(2);
    }
}
