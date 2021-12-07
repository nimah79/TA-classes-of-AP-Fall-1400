import java.io.*;
//SequenceInputStream
public class SequenceInputStreamTest {
    public static void main(String[] args) throws IOException{
        OutputStream output = new FileOutputStream("/home/ghazaal/Desktop/io/text.txt");
        InputStream input1 = new FileInputStream("/home/ghazaal/Desktop/io/ap/1.txt");
        InputStream input2 = new FileInputStream("/home/ghazaal/Desktop/io/ap/2.txt");
        SequenceInputStream seq = new SequenceInputStream(input1,input2);
        int data = seq.read();
        while (data != -1){
            System.out.print((char) data);
            output.write((byte) data);
            data = seq.read();
        }
    }

}
