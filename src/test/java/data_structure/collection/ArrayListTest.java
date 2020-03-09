package data_structure.collection;

import org.junit.Test;

import static org.assertj.core.api.Assertions.assertThat;

public class ArrayListTest {

    @Test
    public void addValueAndGetValueForIndex_Then_CorrespondingIndexValue() {
        List numbers = new ArrayList();
        numbers.add("A");
        assertThat(numbers.get(0)).isEqualTo("A");
        numbers.add("B");
        assertThat(numbers.get(1)).isEqualTo("B");
    }
}
