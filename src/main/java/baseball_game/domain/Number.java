package baseball_game.domain;

public class Number {
    private int no;

    public Number(int no) {
        if (String.valueOf(no).length() != 3) {
            throw new IllegalArgumentException("세 자리 수만 입력이 가능합니다.");
        }
        if (isDuplicateNumber(no)) {
            throw new IllegalArgumentException("중복된 수는 입력할 수 없습니다.");
        }
        this.no = no;
    }

    private boolean isDuplicateNumber(int no) {
        int digitOfOne = no % 10;
        int digitOfTwo = no / 10 % 10;
        int digitOfThree = no / 100;

        return digitOfOne == digitOfTwo || digitOfOne == digitOfThree || digitOfTwo == digitOfThree;
    }
}
