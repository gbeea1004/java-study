package logger.step3;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
/*
* Logback 사용
*/
public class Main {
    private static final Logger log = LoggerFactory.getLogger(Main.class);

    public static void main(String[] args) {
//        디버그가 가능한 상태에서만 실행
//        가독성이 떨어짐
//        LOG4J에서는 이런식으로만 성능상의 이슈를 해결할 수 밖에 없었다.
        if (log.isDebugEnabled()) {
            log.debug("LOG4J : " + "디버그 상태인지 체크");
        }

//        logback에서 해결방안이 등장
//        내부적으로 debug가 가능한 상태인지 검사
//        debug 가능이면 포맷팅을 통해서 연산
        log.debug("logback 방식 {}", 100);

        log.trace("trace Log");
        log.debug("debug Log");
        log.info("info Log");
        log.warn("warn Log");
        log.error("error Log");
    }
}
