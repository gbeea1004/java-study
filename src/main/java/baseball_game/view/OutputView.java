package baseball_game.view;

import baseball_game.Score;

public class OutputView {
    public static void showGameBoard(Score score) {
        System.out.printf("Strikes : %d, Balls : %d", score.strikes(), score.balls());
        System.out.println();
    }

    public static void finishGame() {
        System.out.println("정답을 맞추셨습니다! 축하!");
    }
}
