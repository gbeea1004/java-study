package sort.insert;

import org.junit.jupiter.api.Test;

import java.util.Arrays;

class InsertSortTest {
    @Test
    void testCase_1() {
        int[] arr = new int[]{5, 3, 2, 4, 1};
        InsertSort.sort(arr);
        System.out.println(Arrays.toString(arr));
    }
}