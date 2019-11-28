package baseball_game;

import baseball_game.domain.Number;

public class GamePlay {
    private Number number;

    public GamePlay(Number number) {
        this.number = number;
    }

    public Score guess(Number guess) {
        int strikeCount = 0;
        int ballCount = 0;
        for (int i = 1; i <= 3; i++) {
            if (pos(number.getNo(), i) == pos(guess.getNo(), i)) {
                strikeCount++;
            } else {
                if (String.valueOf(number.getNo()).contains(String.valueOf(pos(guess.getNo(), i)))) {
                    ballCount++;
                }
            }
        }
        return Score.create(strikeCount, ballCount);
    }

    private int pos(int value, int pos) {
        switch (pos) {
            case 1:
                return value % 10;
            case 2:
                return value / 10 % 10;
            case 3:
                return value / 100;
        }
        throw new IllegalArgumentException();
    }
}
