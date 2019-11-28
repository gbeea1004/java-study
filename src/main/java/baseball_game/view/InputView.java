package baseball_game.view;

import java.util.Scanner;

public class InputView {
    public static int inputValue(Scanner scanner) {
        System.out.println("정답으로 지정할 숫자를 입력하세요.");
        return scanner.nextInt();
    }

    public static int inputGuess(Scanner scanner) {
        System.out.println("예상하는 숫자를 입력하세요.");
        return scanner.nextInt();
    }
}
