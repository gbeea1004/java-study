package books.object.ticket_sale_app;

public class Bag {
    private Long amount;
    private Invitation invitation;
    private Ticket ticket;

    public Bag(Long amount) {
        this(null, amount);
    }

    public Bag(Invitation invitation, Long amount) {
        this.invitation = invitation;
        this.amount = amount;
    }

    public boolean hasInvitation() {
        return invitation != null;
    }

    public boolean hasTicket() {
        return ticket != null;
    }

    public void setTicket(Ticket ticket) {
        this.ticket = ticket;
    }

    public void plusAmount(long amount) {
        this.amount += amount;
    }

    public Long getAmount() {
        return amount;
    }

    public void minusAmount(long amount) {
        this.amount -= amount;
    }
}
