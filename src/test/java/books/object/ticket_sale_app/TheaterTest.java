package books.object.ticket_sale_app;

import org.junit.jupiter.api.Test;

class TheaterTest {
    @Test
    void enter() {
        Ticket[] tickets = new Ticket[3];
        for (int i = 0; i < tickets.length; i++) {
            tickets[i] = new Ticket();
        }
        Theater theater = new Theater(new TicketSeller(new TicketOffice(1000L, tickets)));
        theater.enter(new Audience(new Bag(10000L)));
    }
}