package baseball_game;

public class Game {
    private int value;

    public Game(int value) {
        this.value = value;
    }


    public Score guess(int guess) {
        int strikeCount = 0;
        if (value % 10 == guess % 10) {
            strikeCount++;
        }
        if (value / 10 % 10 == guess / 10 % 10) {
            strikeCount++;
        }
        if (value / 100 == guess / 100) {
            strikeCount++;
        }
        return Score.create(strikeCount,0);
    }
}
