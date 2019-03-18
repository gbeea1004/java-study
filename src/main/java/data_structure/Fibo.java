package data_structure;

public class Fibo {
    public static int startNo(int no) {
        if (no == 1) {
            return 0;
        } else if (no == 2) {
            return 1;
        }
        return startNo(no - 1) + startNo(no - 2);
    }
}
