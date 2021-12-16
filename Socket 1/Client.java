import java.io.*;
import java.net.Socket;
import java.util.Scanner;

//ipconfig
public class Client {
    public static void main(String[] args) throws IOException {
        Socket socket = new Socket("127.0.0.1",1234);

        OutputStream out = socket.getOutputStream();
        InputStream in = socket.getInputStream();

        DataOutputStream dos = new DataOutputStream(out);
        DataInputStream dis = new DataInputStream(in);

//        String message = dis.readUTF();
//        System.out.println(message);

//        dos.writeBoolean(true);
//        dos.flush();

        Scanner scanner = new Scanner(System.in);

        boolean isWin = false;
        while (!isWin){
            System.out.println("HADS BEZAN:");
            int hads = scanner.nextInt();

            dos.writeInt(hads);
            dos.flush();

            String javab = dis.readUTF();
            if (javab.equals("MASHALA")){
                isWin =true;
                System.out.println(javab);
            }else {
                System.out.println(javab);
            }

        }



    }
}
