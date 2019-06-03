package thread;

public class Main {
    public static void main(String[] args) {
        Thread thread = new Thread(new MyThread());
        Thread thread2 = new MyThread2();
        thread.start();
        thread2.start();
    }
}
