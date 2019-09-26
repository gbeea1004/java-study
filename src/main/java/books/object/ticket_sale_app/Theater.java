package books.object.ticket_sale_app;

public class Theater {
    private TicketSeller ticketSeller;

    public Theater(TicketSeller ticketSeller) {
        this.ticketSeller = ticketSeller;
    }

    public void enter(Audience audience) {
        if (audience.hasInvitation()) {
            audience.receiveTicket(ticketSeller.getTicket());
        } else {
            Ticket ticket = ticketSeller.getTicket();
            audience.minusAmount(ticket.getFee());

            ticketSeller.plusAmount(ticket.getFee());
            audience.receiveTicket(ticket);
        }
    }
}
