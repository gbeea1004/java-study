package sort.select;

import org.junit.Test;

import java.util.Arrays;

public class SelectSortTest {
    @Test
    public void testCase_1() {
        int[] arr = new int[]{3, 4, 2, 1};
        SelectSort.sort(arr);
        System.out.println(Arrays.toString(arr));
    }
}