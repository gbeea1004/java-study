package books.object.ticket_sale_app;

import org.junit.Test;

import static org.assertj.core.api.Assertions.assertThat;

public class AudienceTest {
    @Test
    public void 초대장을_가진_관람객() {
        Audience audience = new Audience(new Bag(new Invitation()));
        assertThat(audience.hasInvitation()).isEqualTo(true);
    }

    @Test
    public void 초대장을_가지지않은_관람객() {
        Audience audience = new Audience(new Bag());
        assertThat(audience.hasInvitation()).isEqualTo(false);
    }
}
