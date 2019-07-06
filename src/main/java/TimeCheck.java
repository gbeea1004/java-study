import java.util.ArrayList;
import java.util.HashMap;

public class TimeCheck {

    public void checkCurrentTimeMillis() {
        long startTime = System.currentTimeMillis();
        makeDummyObject();
        long endTime = System.currentTimeMillis();
        System.out.println(endTime - startTime);
    }

    private void makeDummyObject() {
        HashMap<String, String> dummys = new HashMap<>(1000000);
        ArrayList<String> list = new ArrayList<>(1000000);
    }

//    JDK 5.0 이상에서 등장한 nano가 Millis 보다 약간 더 성능이 좋다.
    public void checkCurrentTimeNano() {
        long startTime = System.nanoTime();
        makeDummyObject();
        long endTime = System.nanoTime();
        System.out.println((endTime - startTime) / 1000000.0);
    }
}