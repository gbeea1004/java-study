package networking.tcp;

import java.io.IOException;
import java.net.Socket;
import java.net.UnknownHostException;

public class TcpClient {
    public static void main(String[] args) {
        try {
            String serverIp = "127.0.0.1";
            Socket socket = new Socket(serverIp, 7777);
            System.out.println("서버에 연결함");

            Sender sender = new Sender(socket);
            Receiver receiver = new Receiver(socket);

            sender.start();
            receiver.start();
        } catch (UnknownHostException e) {
            e.printStackTrace();
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}
