package sort.select;

import org.junit.jupiter.api.Test;

import java.util.Arrays;

class SelectSortTest {
    @Test
    void testCase_1() {
        int[] arr = new int[]{3, 4, 2, 1};
        SelectSort.sort(arr);
        System.out.println(Arrays.toString(arr));
    }
}