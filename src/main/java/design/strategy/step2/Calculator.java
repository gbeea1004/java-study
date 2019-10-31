package design.strategy.step2;

import java.util.List;

/*
 * 전략패턴 : 특정 콘텍스트에서 전략을 별도로 분리하는 설계 방법
 * DI를 통해 콘텍스트에 전략을 전달한다.
 * 장점
    1. 할인 정책 확장에는 열려있고 변경에는 닫혀 있는 [개방 폐쇠 원칙]을 따르는 구조가 된다.
    2. 전략의 콘크리트 클래스와 클라이언트의 코드가 쌍을 이루므로 유지 보수 문제가 발생할 가능성이 줄어든다.
       클라이언트의 버튼 처리 코드에서 전략 객체를 직접 생성하는 것은 오히려 코드 이해를 높이고 응집을 높여준다.
 */
class Calculator {
    private DiscountStrategy discountStrategy;

    public Calculator(DiscountStrategy discountStrategy) {
        this.discountStrategy = discountStrategy;
    }

    public int calculator(List<Item> items) {
        int sum = 0;
        for (Item item : items) {
            sum += discountStrategy.getDiscountPrice(item);
        }
        return sum;
    }
}
