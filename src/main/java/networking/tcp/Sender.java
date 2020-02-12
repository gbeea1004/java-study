package networking.tcp;

import java.io.DataOutputStream;
import java.io.IOException;
import java.net.Socket;
import java.util.Scanner;

public class Sender extends Thread {
    private Socket socket;
    private DataOutputStream out;
    private String name;

    public Sender(Socket socket) {
        this.socket = socket;
        try {
            out = new DataOutputStream(socket.getOutputStream());
            name = "[" + socket.getPort() + "]";
        } catch (IOException e) {
            e.printStackTrace();
        }
    }

    @Override
    public void run() {
        Scanner scanner = new Scanner(System.in);
        while (out != null) {
            try {
                out.writeUTF(name + scanner.nextLine());
            } catch (IOException e) {
                e.printStackTrace();
                break;
            }
        }
    }
}
