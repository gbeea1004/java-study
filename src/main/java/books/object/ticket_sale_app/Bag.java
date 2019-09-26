package books.object.ticket_sale_app;

public class Bag {
    private Invitation invitation;

    public Bag() {

    }

    public Bag(Invitation invitation) {
        this.invitation = invitation;
    }

    public boolean hasInvitation() {
        return invitation != null;
    }
}
