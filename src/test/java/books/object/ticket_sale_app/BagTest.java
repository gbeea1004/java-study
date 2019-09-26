package books.object.ticket_sale_app;

import org.junit.Test;

import static org.assertj.core.api.Assertions.assertThat;

public class BagTest {
    @Test
    public void 초대장을_가지고_있는가() {
        assertThat(new Bag(new Invitation(), 1000L).hasInvitation()).isEqualTo(true);
        assertThat(new Bag(1000L).hasInvitation()).isEqualTo(false);
    }

    @Test
    public void 티켓을_가지고_있는가() {

    }

    @Test
    public void 돈을_추가하기() {
        Bag bag = new Bag(1000L);
        bag.plusAmount(2000L);
        assertThat(bag.getAmount()).isEqualTo(3000L);
    }

    @Test
    public void 돈을_빼기() {
        Bag bag = new Bag(1000L);
        bag.minusAmount(500L);
        assertThat(bag.getAmount()).isEqualTo(500L);
    }
}