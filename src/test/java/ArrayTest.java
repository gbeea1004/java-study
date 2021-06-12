import org.junit.jupiter.api.Test;

import static org.assertj.core.api.Assertions.assertThat;

class ArrayTest {
    @Test
    void arrayCopy() {
        String[] students = {"피터", "라임", "스컬", "레드", "레시안"};
        String[] newStudents = new String[students.length];
        System.arraycopy(students, 1, newStudents, 0, 1);
        assertThat(newStudents[0]).isEqualTo("라임");
        assertThat(newStudents[1]).isEqualTo(null);

        System.arraycopy(students, 0, newStudents, 0, students.length);
        assertThat(newStudents[0]).isEqualTo("피터");
        assertThat(newStudents[1]).isEqualTo("라임");
        assertThat(newStudents[2]).isEqualTo("스컬");
        assertThat(newStudents[3]).isEqualTo("레드");
        assertThat(newStudents[4]).isEqualTo("레시안");
    }
}
