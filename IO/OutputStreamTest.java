import java.io.*;
import java.nio.charset.StandardCharsets;
import java.util.Scanner;
//using OutputStream ->write
public class OutputStreamTest {
    public static void main(String[] args) throws IOException{
        OutputStream output = new FileOutputStream("/home/ghazaal/Desktop/io/ap/3.txt");
        byte[] data = {1,0,1,0};
        output.write(data);
        output.close();
    }

}
