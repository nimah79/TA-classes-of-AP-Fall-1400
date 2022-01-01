import java.io.DataInputStream;
import java.io.DataOutputStream;
import java.io.IOException;
import java.net.Socket;

public class ClientHandler implements Runnable {
    Socket socket;
    DataInputStream dis;
    DataOutputStream dos;
    String username;
    public ClientHandler(Socket socket) throws IOException {
        this.socket = socket;
        dis = new DataInputStream(socket.getInputStream());
        dos = new DataOutputStream(socket.getOutputStream());
    }
    @Override
    public void run() {
        try {
            username = dis.readUTF();
            while (Server.users.containsKey(username)) {
                this.dos.writeUTF("error: this username already exists.");
                username = dis.readUTF();
            }
            this.dos.writeUTF("successfully registered.");
            Server.users.put(username, this);
            Server.printUsers();
            while (true) {
                String receiverUsername = dis.readUTF();
                if (Server.users.containsKey(receiverUsername)) {
                    ClientHandler receiverHandler = Server.users.get(receiverUsername);
                    String clientMsg = dis.readUTF();
                    receiverHandler.dos.writeUTF(username + " : " + clientMsg);
                }
            }
        } catch (Exception e) {
            Server.users.remove(username);
            try {
                socket.close();
                dis.close();
                dos.close();
            } catch (IOException ex) {
                ex.printStackTrace();
            }
        }
    }
}
