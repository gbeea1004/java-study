package design.strategy.step2;

public class LastGuestDiscountStrategy implements DiscountStrategy {
    @Override
    public int getDiscountPrice(Item item) {
        return (int) (item.getPrice() * 0.5); // 마지막 손님 50% 할인
    }
}
