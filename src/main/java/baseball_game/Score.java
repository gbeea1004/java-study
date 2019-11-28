package baseball_game;

public class Score {
    private int strick;
    private int ball;

    public Score(int strick, int ball) {
        this.strick = strick;
        this.ball = ball;
    }

    public static Score create(int strick, int ball) {
        return new Score(strick, ball);
    }

    public int strikes() {
        return 0;
    }

    public int balls() {
        return 0;
    }
}
