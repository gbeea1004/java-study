package baseball_game;

import org.junit.Before;
import org.junit.Test;

import static org.assertj.core.api.Assertions.assertThat;

public class BaseballGameTest {
    private Game game;

    @Before
    public void setUp() throws Exception {
        // Given : 상황, 조건
        game = new Game(479); // 정답 479
    }

    @Test
    public void nomatch() {
        // When : 기능 실행
        Score score = game.guess(123); // 예측 123
        assertNoMatch(score); // 0 스트라이크 0 볼

        Score score2 = game.guess(568); // 예측 568
        assertNoMatch(score2); // 0 스트라이크 0 볼
    }

    private void assertNoMatch(Score score) {
        // Then : 결과 - 검증, 확인
        assertThat(score.strikes()).isEqualTo(0);
        assertThat(score.balls()).isEqualTo(0);
    }

    @Test
    public void allStrikes() {
        Score score = game.guess(479); // 예측 479
        assertAllStrikes(score);

        Game game2 = new Game(124);
        Score score2 = game2.guess(124); // 예측 124
        assertAllStrikes(score2);
    }

    private void assertAllStrikes(Score score) {
        assertThat(score.strikes()).isEqualTo(3);
        assertThat(score.balls()).isEqualTo(0);
    }

    @Test
    public void someStrikes() {
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

    @Test
    public void someBalls() {
        assertMatch(game.guess(124), 0, 1);
        assertMatch(game.guess(724), 0, 2);
        assertMatch(game.guess(794), 0, 3);
    }

    @Test
    public void someStrikesSomeBalls() {
        assertMatch(game.guess(497), 1, 2);
        assertMatch(game.guess(974), 1, 2);
        assertMatch(game.guess(749), 1, 2);
    }
}
