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

    @Test
    public void allStrikes() {
        Game game = new Game(479);
        Score score = game.guess(479); // 예측 479
        assertAllStrikes(score);

        Game game2 = new Game(124);
        Score score2 = game2.guess(124); // 예측 124
        assertAllStrikes(score2);
    }

    public void assertAllStrikes(Score score) {
        assertThat(score.strikes()).isEqualTo(3);
        assertThat(score.balls()).isEqualTo(0);
    }

    @Test
    public void someStrikes() {
        Game game = new Game(479);
        assertMatch(game.guess(359), 1, 0);
        assertMatch(game.guess(372), 1, 0);
        assertMatch(game.guess(412), 1, 0);

        assertMatch(game.guess(478), 2, 0);
        assertMatch(game.guess(379), 2, 0);
        assertMatch(game.guess(419), 2, 0);
    }

    public void assertMatch(Score score, int strike, int ball) {
        assertThat(score.strikes()).isEqualTo(strike);
        assertThat(score.balls()).isEqualTo(ball);
    }
}
