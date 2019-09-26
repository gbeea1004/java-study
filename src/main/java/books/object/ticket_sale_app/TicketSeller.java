package books.object.ticket_sale_app;

public class TicketSeller {
    private TicketOffice ticketOffice;

    public TicketSeller(TicketOffice ticketOffice) {
        this.ticketOffice = ticketOffice;
    }

    public Ticket getTicket() {
        return ticketOffice.getTicket();
    }

    public void plusAmount(Long amount) {
        ticketOffice.plusAmount(amount);
    }

    public void minusAmount(Long amount) {
        ticketOffice.minusAmount(amount);
    }
}
