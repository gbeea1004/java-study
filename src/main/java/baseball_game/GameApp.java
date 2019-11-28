package baseball_game;

import baseball_game.domain.Number;
import baseball_game.view.InputView;
import baseball_game.view.OutputView;

import java.util.Scanner;

public class GameApp {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        GamePlay gamePlay = new GamePlay(new Number(InputView.inputValue(scanner)));
        boolean isPlaying = true;
        while (isPlaying) {
            try {
                Score score = gamePlay.guess(new Number(InputView.inputGuess(scanner)));
                if (score.isFinish()) {
                    isPlaying = false;
                }
                OutputView.showGameBoard(score);
            } catch (IllegalArgumentException e) {
                System.out.println(e.getMessage());
            }
        }
        OutputView.finishGame();
        scanner.close();
    }
}
