package data_structure.collection;

import org.junit.jupiter.api.Test;

import static org.assertj.core.api.Assertions.assertThat;

class ArrayListTest {

    @Test
    void addValueAndGetValueForIndex_Then_CorrespondingIndexValue() {
        List numbers = new ArrayList();
        numbers.add("A");
        assertThat(numbers.get(0)).isEqualTo("A");
        numbers.add("B");
        assertThat(numbers.get(1)).isEqualTo("B");
        numbers.add(1);
        assertThat(numbers.get(2)).isEqualTo(1);
        numbers.add('a');
        assertThat(numbers.get(3)).isEqualTo('a');

        numbers.add(0, "first");
        assertThat(numbers.get(0)).isEqualTo("first");
        assertThat(numbers.get(1)).isEqualTo("A");
        assertThat(numbers.get(2)).isEqualTo("B");
        assertThat(numbers.get(3)).isEqualTo(1);
        assertThat(numbers.get(4)).isEqualTo('a');
        assertThat(numbers.size()).isEqualTo(5);
    }

    @Test
    void getDefaultSize_Then_10() {
        List numbers = new ArrayList();
        assertThat(numbers.size()).isEqualTo(10);
    }

    @Test
    void getSizeToSpecify_Then_SpecifySize() {
        List numbers = new ArrayList(20);
        assertThat(numbers.size()).isEqualTo(20);
    }

    @Test
    void doubleSizeWhenExceedingSize_Then_doubleSize() {
        List numbers = new ArrayList(2);
        numbers.add("a");
        numbers.add("a");
        assertThat(numbers.size()).isEqualTo(2);
        numbers.add("a");
        assertThat(numbers.size()).isEqualTo(4);
    }
}
