package networking.tcp;

import java.io.IOException;
import java.net.ServerSocket;
import java.net.Socket;

public class TcpServer {
    public static void main(String[] args) {
        ServerSocket serverSocket = null;
        Socket socket = null;

        try {
            serverSocket = new ServerSocket(7777);
            System.out.println("서버 준비 완료");

            socket = serverSocket.accept();
            System.out.println("요청 들어옴");

            Sender sender = new Sender(socket); // 보내다
            Receiver receiver = new Receiver(socket); // 받다

            sender.start();
            receiver.start();
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}
