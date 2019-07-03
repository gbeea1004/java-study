package logger.step3;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
/*
* Logback 사용
*/
public class Main {
    private static final Logger log = LoggerFactory.getLogger(Main.class);

    public static void main(String[] args) {
        log.trace("trace Log");
        log.debug("debug Log");
        log.info("info Log");
        log.warn("warn Log");
        log.error("error Log");
    }
}
