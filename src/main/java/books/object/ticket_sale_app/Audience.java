package books.object.ticket_sale_app;

public class Audience {
    private Bag bag;

    public Audience(Bag bag) {
        this.bag = bag;
    }

    public boolean hasInvitation() {
        return bag.hasInvitation();
    }

    public void receiveTicket(Ticket ticket) {
        bag.setTicket(ticket);
    }

    public void plusAmount(Long amount) {
        bag.plusAmount(amount);
    }

    public void minusAmount(Long amount) {
        bag.minusAmount(amount);
    }
}
