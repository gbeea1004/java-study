package design.strategy.step2;

public class CalculatorApp {
    private DiscountStrategy strategy;

    public void onFirstGuestButtonClick() {
        // 첫 손님 할인 버튼
        strategy = new FirstGuestDiscountStrategy();
    }

    public void onLastGuestButtonClick() {
        // 마지막 손님 할인 버튼
        strategy = new LastGuestDiscountStrategy();
    }

    public void onCalculatorButtonClick() {
        // 계산 버튼 누를 때 실행
        Calculator calculator = new Calculator(strategy);
    }
}
