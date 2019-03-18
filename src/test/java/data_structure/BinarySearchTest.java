package data_structure;

import org.junit.Test;

import static org.assertj.core.api.Assertions.assertThat;

public class BinarySearchTest {
    @Test
    public void 이진탐색() {
        int[] numbers = {1, 3, 5, 7, 9};
        BinarySearch binarySearch = new BinarySearch();

        assertThat(binarySearch.start(numbers, 8)).isEqualTo(-1); // 탐색실패
        assertThat(binarySearch.start(numbers, 1)).isEqualTo(0);
        assertThat(binarySearch.start(numbers, 5)).isEqualTo(2);
        assertThat(binarySearch.start(numbers, 7)).isEqualTo(3);
        assertThat(binarySearch.start(numbers, 9)).isEqualTo(4);
        assertThat(binarySearch.start(numbers, 10)).isEqualTo(-1);


    }
}