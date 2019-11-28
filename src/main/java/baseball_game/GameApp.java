package baseball_game;

import baseball_game.view.InputView;
import baseball_game.view.OutputView;

import java.util.Scanner;

public class GameApp {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        GamePlay gamePlay = new GamePlay(InputView.inputValue(scanner));
        boolean isPlaying = true;
        while (isPlaying) {
            Score score = gamePlay.guess(InputView.inputGuess(scanner));
            if (score.isFinish()) {
                isPlaying = false;
            }
            OutputView.showGameBoard(score);
        }
        OutputView.finishGame();
        scanner.close();
    }
}
