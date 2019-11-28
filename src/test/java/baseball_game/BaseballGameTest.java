package baseball_game;

import org.junit.Test;

import static org.assertj.core.api.Assertions.assertThat;

public class BaseballGameTest {
    @Test
    public void nomatch() {
        // 정답 479
        Game game = new Game(479);

        // 예측 123
        Score score = game.guess(123);

        // 0 스트라이크 0 볼
        assertThat(score.strikes()).isEquealTo(0);
        assertThat(score.balls()).isEquealTo(0);
    }
}
