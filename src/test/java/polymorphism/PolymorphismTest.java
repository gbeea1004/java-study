package polymorphism;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.assertj.core.api.Assertions.assertThat;

class PolymorphismTest {
    private Car avante;
    private Car porsche;

    @BeforeEach
    public void setUp() throws Exception {
        avante = new Avante();
        porsche = new Porsche();
    }

    @Test
    void 다형성() {
        assertThat(avante.isSameName("아반떼")).isTrue();
        assertThat(porsche.isSameName("포르쉐")).isTrue();

        assertThat(avante.isFester(porsche)).isEqualTo(false);
        assertThat(porsche.isFester(avante)).isEqualTo(true);

        ((Porsche) porsche).sportsMode();
    }

    @Test
    void instanceof_연산자() {
        assertThat(avante.exhaustSound()).isEqualTo("붕");
        assertThat(porsche.exhaustSound()).isEqualTo("부우우우와아아아아앙!!!!!!!!!!!!");

        TayoBus tayoBus = new TayoBus();
        assertThat(tayoBus.exhaustSound()).isEqualTo("등록된 자동차가 아닙니다.");
    }
}
