package design.strategy.step1;

public class Item {
    private int price;
    private boolean fresh;

    public void setPrice(int price) {
        this.price = price;
    }

    public void setFresh(boolean fresh) {
        this.fresh = fresh;
    }

    public int getPrice() {
        return price;
    }

    public boolean isFresh() {
        return fresh;
    }
}
