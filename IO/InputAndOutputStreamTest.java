import java.io.*;
//copying one java file to another
public class InputAndOutputStreamTest {
    public static void main(String[] args) throws IOException{
        OutputStream output = new FileOutputStream("");
        InputStream input = new FileInputStream("");
        int data = input.read();
        while (data != -1){
            output.write((byte) data);
            data = input.read();
        }
        input.close();
        output.close();
    }

}
