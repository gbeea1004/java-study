package polymorphism;

class Porsche extends Car {
    Porsche() {
        super("포르쉐", 2000);
    }

    void sportsMode() {
        System.out.println("스포츠 모드 가동!!");
    }
}
