package solid.lsp;

// 리스코프 치환 원칙 위반사례
public class Main {
    public static void main(String[] args) {
        Rectangle rectangle = new Square();
        rectangle.setHeight(10);
        rectangle.setWidth(11);
        increaseHeight(rectangle);
    }

    public static void increaseHeight(Rectangle rectangle) {
        // instanceof 사용은 곧 리스코프 치환 원칙을 위반!
        if (rectangle instanceof Square) {
            throw new RuntimeException();
        }

        // width가 더 크거나 같으면 height값 10증가
        if (rectangle.getHeight() <= rectangle.getWidth()) {
            rectangle.setHeight(rectangle.getHeight() + 10);
        }
    }
}
