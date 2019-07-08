package lambda;

import java.util.Map;

public class Main {
    public static void main(String[] args) {
        // 익명 클래스
        Moveable moveable = new Moveable() {
            @Override
            public int move(int start, int end) {
                return end - start;
            }
        };

        // 람다
        Moveable moveable2 = (start, end) -> end - start;
        int dir = moveable2.move(3,4);
        System.out.println(dir);



        // 추상 클래스 익명
        Person person = new Person() {
            @Override
            void move() {
                System.out.println("움직");
            }
        };

        // 추상 클래스 람다
        // 오류 : 람다는 무조건 인터페이스
//        Person person2 = () -> System.out.println("움직");

    }
}
