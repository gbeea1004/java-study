package exception.step1;

/*
* 트랜잭션 예제
* main() 안에서 예외처리를 하는 것이 아니라 사용하는 메서드에서 각각 처리를 한다면 문제가 발생한다.
* 무슨 문제가 발생할까?
*/
public class Main {
    public static void main(String[] args) {
        Bank bank = new Bank();
        int money = 10000;
        Person person = new Person(5000);

        bank.내계좌에서돈빼기(person, money);
        bank.상대계좌에입금(money);
        bank.이체성공();
    }
}

class Person {
    int money;

    public Person(int money) {
        this.money = money;
    }
}


class Bank {
    public void 내계좌에서돈빼기(Person person, int money) {
        try {
            if (person.money - money < 0) {
                throw new IllegalArgumentException("잔액이 부족합니다.");
            }
            person.money -= money;
        } catch (IllegalArgumentException e) {
            System.out.println(e.getMessage());
        }
    }

    public void 상대계좌에입금(int money) {
        try {
            if (money == 0) {
                throw new IllegalArgumentException("잔액이 부족합니다.");
            }
        } catch (IllegalArgumentException e) {
            System.out.println(e.getMessage());
        }
    }

    public void 이체성공() {
        System.out.println("이체 성공!");
    }
}
