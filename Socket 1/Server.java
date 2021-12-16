import java.io.*;
import java.net.ServerSocket;
import java.net.Socket;
import java.util.Random;
public class Server {
    public static void main(String[] args) throws IOException {
        ServerSocket serverSocket = new ServerSocket(1234);
        System.out.println("MONTAZERAM");
        Socket socket = serverSocket.accept();
        System.out.println("CLIENT VASL SHOD");

        OutputStream out = socket.getOutputStream();
        InputStream in = socket.getInputStream();

        DataOutputStream dos = new DataOutputStream(out);
        DataInputStream dis = new DataInputStream(in);

//        dos.writeUTF("WELCOME");
//        dos.flush();
//
//        boolean b = dis.readBoolean();
//        System.out.println(b);

        int random = new Random().nextInt(100);
        System.out.println("Random: " + random);
        boolean isWin = false;

        while (!isWin){
            int hadsKarbar = dis.readInt();
            System.out.println("Hads karbar : " + hadsKarbar);
            if (hadsKarbar == random){
                dos.writeUTF("MASHALA");
                dos.flush();
                isWin = true;
            } else if (hadsKarbar > random){
                dos.writeUTF("KOCHIK TAR");
                dos.flush();
            }else {
                dos.writeUTF("BOZORG TAR");
                dos.flush();
            }
        }

    }
}
