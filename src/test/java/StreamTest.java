import org.junit.Test;
import stream.User;

import java.util.Arrays;
import java.util.stream.Stream;

import static org.assertj.core.api.Assertions.assertThat;

public class StreamTest {
    @Test
    public void 연산() {
        Stream<String> stream = Stream.of("1", "2");
        assertThat(stream.count()).isEqualTo(2);
    }

    @Test
    public void map() {
        Stream<User> userStream = Stream.of(
                new User("건희", 27),
                new User("도비", 1),
                new User("우디", 24)
        );
        userStream.map(User::getName).forEach(System.out::println);
    }

    @Test
    public void flatMap() {
        Stream<String[]> stringArrStream = Stream.of(
                new String[]{"abc", "라임", "임다"},
                new String[]{"비와이", "제이플라", "제시"},
                new String[]{"호눅스", "JK", "포비"}
        );

        System.out.println("flatMap 사용 시");
        stringArrStream.flatMap(Arrays::stream).forEach(System.out::println);
    }
}
