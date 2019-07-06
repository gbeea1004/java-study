import java.util.ArrayList;
import java.util.HashMap;

public class TimeCheck {

    public void checkCurrentTime() {
        long startTime = System.currentTimeMillis();
        makeDummyObject();
        long endTime = System.currentTimeMillis();
        System.out.println(endTime - startTime);
    }

    private void makeDummyObject() {
        HashMap<String, String> dummys = new HashMap<>(1000000);
        ArrayList<String> list = new ArrayList<>(1000000);
    }


}
