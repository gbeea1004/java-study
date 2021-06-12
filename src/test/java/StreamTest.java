import org.junit.jupiter.api.Test;
import stream.User;

import java.util.Arrays;
import java.util.stream.Stream;

import static org.assertj.core.api.Assertions.assertThat;

class StreamTest {
    @Test
    void 연산() {
        Stream<String> stream = Stream.of("1", "2");
        assertThat(stream.count()).isEqualTo(2);
    }

    @Test
    void map() {
        Stream<User> userStream = Stream.of(
                new User("건희", 27),
                new User("도비", 1),
                new User("우디", 24)
        );
        userStream.map(User::getName)
                  .forEach(System.out::println);
    }

    @Test
    void flatMap() {
        Stream<String[]> stringArrStream = Stream.of(
                new String[]{"abc", "라임", "임다"},
                new String[]{"비와이", "제이플라", "제시"},
                new String[]{"호눅스", "JK", "포비"}
        );

        System.out.println("flatMap 사용 시");
        stringArrStream.flatMap(Arrays::stream)
                       .forEach(System.out::println);
    }

    @Test
    void 재사용불가() {
        int[] no = new int[]{1, 2, 3, 4, 5, 6, 7, 8, 9, 10};
        int[] changeNo = Arrays.stream(no)
                               .map(e -> e * 2)
                               .toArray();
        System.out.println(Arrays.toString(no));
        System.out.println(Arrays.toString(changeNo));
    }
}
