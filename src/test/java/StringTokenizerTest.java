import org.junit.jupiter.api.Test;

import java.util.StringTokenizer;

class StringTokenizerTest {
    @Test
    void 문자열_얻기() {
        String source = "100,200,300,400";
        StringTokenizer st = new StringTokenizer(source, ",");

        while (st.hasMoreTokens()) { // 토큰이 남아있는가?
            System.out.println(st.countTokens()); // 토큰 수
            System.out.println(st.nextToken()); // 다음 토큰 반환
        }
    }
}
