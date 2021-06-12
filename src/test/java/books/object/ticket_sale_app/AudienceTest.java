package books.object.ticket_sale_app;

import org.junit.jupiter.api.Test;

class AudienceTest {
    @Test
    void 초대장을_가진_관람객() {
        Audience audience = new Audience(new Bag(new Invitation(), 1000L));
//        assertThat(audience.hasInvitation()).isEqualTo(true);
    }

    @Test
    void 초대장을_가지지않은_관람객() {
        Audience audience = new Audience(new Bag(1000L));
//        assertThat(audience.hasInvitation()).isEqualTo(false);
    }
}
