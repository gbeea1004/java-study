package exception.step3;

/*
 * unchecked 예외 사용
 */
public class Main {
    public static void main(String[] args) {
        Bank bank = new Bank();
        int money = 10000;
        Person person = new Person(10000);

        bank.내계좌에서돈빼기(person, money);
        bank.상대계좌에입금(null, money);
        bank.이체성공();

        System.out.println("내가 가진 돈 : " + person.money);
    }
}

class Person {
    int money;

    public Person(int money) {
        this.money = money;
    }
}


class Bank {
    public void 내계좌에서돈빼기(Person person, int money) throws NoMoneyException {
        if (person.money - money < 0) {
            throw new NoMoneyException("잔액이 부족합니다.");
        }
        person.money -= money;
    }

    public void 상대계좌에입금(Person person, int money) throws NoMoneyException {
        if (person == null) {
            throw new NoMoneyException("이체하실 계좌를 정확하게 입력하세요.");
        }
    }

    public void 이체성공() {
        System.out.println("이체 성공!");
    }
}