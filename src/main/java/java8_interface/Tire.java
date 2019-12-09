package java8_interface;

abstract class Tire {
    private String model;

    public Tire(String model) {
        this.model = model;
    }

    abstract String setTire();
}
