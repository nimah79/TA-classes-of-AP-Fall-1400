import java.io.DataInputStream;
import java.io.DataOutputStream;
import java.io.IOException;
import java.net.Socket;
import java.util.Scanner;

public class Client {
    static Socket socket;
    static DataInputStream dis;
    static DataOutputStream dos;

    public static void main(String[] args) throws IOException {
        Scanner input = new Scanner(System.in);
        socket = new Socket("127.0.0.1", 590);
        try {
            dis = new DataInputStream(socket.getInputStream());
            dos = new DataOutputStream(socket.getOutputStream());
            String username = "";
            String serverValidationMsg = "";
            do {
                System.out.println("Enter username");
                username = input.nextLine();
                dos.writeUTF(username);
                serverValidationMsg = dis.readUTF();
                System.out.println(serverValidationMsg);
            } while (serverValidationMsg.startsWith("error"));

            Thread messageListener = new Thread(new MessageListener(dis));
            messageListener.start();

            while (true) {
                System.out.println("Enter receiver username");
                String receiver = input.nextLine();
                dos.writeUTF(receiver);
                System.out.println("Write you message");
                String message = input.nextLine();
                dos.writeUTF(message);
            }
        } catch (Exception e) {
            socket.close();
            dos.close();
            dis.close();
        }
    }
}

class MessageListener implements Runnable {
    DataInputStream dis;
    MessageListener(DataInputStream dis) {
        this.dis = dis;
    }
    @Override
    public void run() {
        while (true) {
            try {
                String serverMsg = this.dis.readUTF();
                System.out.println(serverMsg);
            } catch (Exception e) {
                try {
                    dis.close();
                } catch (IOException ex) {
                    ex.printStackTrace();
                }
            }
        }
    }
}
