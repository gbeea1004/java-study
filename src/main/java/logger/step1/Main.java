package logger.step1;

import java.util.logging.Level;
import java.util.logging.Logger;

/*
 * 자바에서 제공하는 기본 Log 사용하기 (JDK 1.4 부터 등장)
*/
public class Main {
    private final static Logger log = Logger.getGlobal();

    public static void main(String[] args) {
        log.setLevel(Level.SEVERE); // 해당 레벨 이상의 log 표시하기

        log.severe("severe Log");
        log.warning("warning Log");
        log.info("info Log");
    }
}
