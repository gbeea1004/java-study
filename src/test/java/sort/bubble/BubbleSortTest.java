package sort.bubble;

import org.junit.jupiter.api.Test;

import java.util.Arrays;

class BubbleSortTest {
    @Test
    void testCase_1() {
        int[] arr = new int[]{1, 4, 2, 5};
        BubbleSort.sort(arr);
        System.out.println(Arrays.toString(arr));
    }

    @Test
    void testCase_2() {
        int[] arr = new int[]{5, 4, 3, 2, 1};
        BubbleSort.sort(arr);
        System.out.println(Arrays.toString(arr));
    }
}