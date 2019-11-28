package baseball_game;

import org.junit.Test;

import static org.assertj.core.api.Assertions.assertThat;

public class BaseballGameTest {
    @Test
    public void nomatch() {
        Game game = new Game(479); // 정답 479

        Score score = game.guess(123); // 예측 123
        assertNoMatch(score); // 0 스트라이크 0 볼
        
        Score score2 = game.guess(568); // 예측 568
        assertNoMatch(score2); // 0 스트라이크 0 볼
    }

    public void assertNoMatch(Score score) {
        assertThat(score.strikes()).isEqualTo(0);
        assertThat(score.balls()).isEqualTo(0);
    }
}
