package design.strategy.step1;

import java.util.List;

/*
 * 상황 : 첫 손님 할인, 덜 신선한 과일 할인 정책 도입
 * 문제 발생
    1. 가격 정책이 추가될 때마다 if-else가 추가되어 calculator()를 수정하는 것이 점점 어려워진다.
    2. 서로 다른 계산 정책이 한 코드에 섞여있어, 코드 분석을 어렵게 함.
 */
public class Calculator {
    public int calculator(boolean firstGuest, List<Item> items) {
        int sum = 0;
        for (Item item : items) {
            if (firstGuest) {
                sum += (int) (item.getPrice() * 0.9); // 첫 손님은 10% 할인
            } else if (!item.isFresh()) {
                sum += (int) (item.getPrice() * 0.8); // 신선하지 않은 과일 20% 할인
            } else {
                sum += item.getPrice();
            }
        }
        return sum;
    }
}
