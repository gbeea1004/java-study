package logger.step2;

import java.util.logging.ConsoleHandler;
import java.util.logging.Handler;
import java.util.logging.Level;
import java.util.logging.Logger;

public class Main {
    private final static Logger log = Logger.getGlobal();

    public static void main(String[] args) {
//        기본 로그 출력을 제거
        Logger logger = Logger.getLogger("");
        Handler[] handlers = logger.getHandlers();
        if (handlers[0] instanceof ConsoleHandler) {
            logger.removeHandler(handlers[0]);
        }


        log.setLevel(Level.INFO);

        Handler handler = new ConsoleHandler();
        CustomLogFormatter formatter = new CustomLogFormatter();
        handler.setFormatter(formatter);
        log.addHandler(handler);

        log.severe("severe Log");
        log.warning("warning Log");
        log.info("info Log");
    }
}
