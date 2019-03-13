package polymorphism;

class Car {
    private String name;
    private int power;

    Car(String name, int power) {
        this.name = name;
        this.power = power;
    }

    boolean isSameName(String carName) {
        return this.name.equals(carName);
    }

    boolean isFester(Car otherCar) {
        return this.power > otherCar.power;
    }

    String exhaustSound() {
        if (this instanceof Avante) {
            return "붕";
        } else if (this instanceof Porsche) {
            return "부우우우와아아아아앙!!!!!!!!!!!!";
        }
        return "등록된 자동차가 아닙니다.";
    }
}
