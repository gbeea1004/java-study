package baseball_game;

import baseball_game.domain.Number;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.assertj.core.api.Assertions.assertThat;

class GamePlayTest {
    private GamePlay game;

    @BeforeEach
    public void setUp() throws Exception {
        // Given : 상황, 조건
        game = new GamePlay(new Number(479)); // 정답 479
    }

    @Test
    void noMatch() {
        // When : 기능 실행
        Score score = game.guess(new Number(123)); // 예측 123
        assertNoMatch(score); // 0 스트라이크 0 볼

        Score score2 = game.guess(new Number(568)); // 예측 568
        assertNoMatch(score2); // 0 스트라이크 0 볼
    }

    private void assertNoMatch(Score score) {
        // Then : 결과 - 검증, 확인
        assertThat(score.strikes()).isEqualTo(0);
        assertThat(score.balls()).isEqualTo(0);
    }

    @Test
    void allStrikes() {
        Score score = game.guess(new Number(479)); // 예측 479
        assertAllStrikes(score);

        GamePlay game2 = new GamePlay(new Number(124));
        Score score2 = game2.guess(new Number(124)); // 예측 124
        assertAllStrikes(score2);
    }

    private void assertAllStrikes(Score score) {
        assertThat(score.strikes()).isEqualTo(3);
        assertThat(score.balls()).isEqualTo(0);
    }

    @Test
    void someStrikes() {
        assertMatch(game.guess(new Number(359)), 1, 0);
        assertMatch(game.guess(new Number(372)), 1, 0);
        assertMatch(game.guess(new Number(412)), 1, 0);

        assertMatch(game.guess(new Number(478)), 2, 0);
        assertMatch(game.guess(new Number(379)), 2, 0);
        assertMatch(game.guess(new Number(419)), 2, 0);
    }

    public void assertMatch(Score score, int strike, int ball) {
        assertThat(score.strikes()).isEqualTo(strike);
        assertThat(score.balls()).isEqualTo(ball);
    }

    @Test
    void someBalls() {
        assertMatch(game.guess(new Number(124)), 0, 1);
        assertMatch(game.guess(new Number(724)), 0, 2);
        assertMatch(game.guess(new Number(794)), 0, 3);
    }

    @Test
    void someStrikesSomeBalls() {
        assertMatch(game.guess(new Number(497)), 1, 2);
        assertMatch(game.guess(new Number(974)), 1, 2);
        assertMatch(game.guess(new Number(749)), 1, 2);
    }
}
