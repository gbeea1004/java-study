package baseball_game;

public class Score {
    private int strike;
    private int ball;

    public Score(int strike, int ball) {
        this.strike = strike;
        this.ball = ball;
    }

    public static Score create(int strike, int ball) {
        return new Score(strike, ball);
    }

    public int strikes() {
        return strike;
    }

    public int balls() {
        return ball;
    }

    public boolean isFinish() {
        return strike == 3;
    }
}
