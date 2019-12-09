package java8_interface;

public interface Control {
    String open();

    default String start() {
        return "출발!!";
    }
}
