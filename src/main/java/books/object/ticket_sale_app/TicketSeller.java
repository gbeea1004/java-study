package books.object.ticket_sale_app;

public class TicketSeller {
    private TicketOffice ticketOffice;

    public TicketSeller(TicketOffice ticketOffice) {
        this.ticketOffice = ticketOffice;
    }

    public void plusAmount(Long amount) {
        ticketOffice.plusAmount(amount);
    }

    public void minusAmount(Long amount) {
        ticketOffice.minusAmount(amount);
    }

    public void sellTo(Audience audience) {
        if (audience.hasInvitation()) {
            audience.receiveTicket(ticketOffice.getTicket());
        } else {
            Ticket ticket = ticketOffice.getTicket();
            audience.minusAmount(ticket.getFee());

            plusAmount(ticket.getFee());
            audience.receiveTicket(ticket);
        }
    }
}
