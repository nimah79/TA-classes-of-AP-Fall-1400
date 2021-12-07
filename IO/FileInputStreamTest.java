import java.io.*;
//using InputStream -> read() , read(byte[])
// read methode reads one byte each second
public class FileInputStreamTest {
    public static void main(String[] args) throws IOException{
        //InputStream read method returns a number between 0-255
        InputStream input1 = new FileInputStream("/home/ghazaal/Desktop/io/sc.png");
        int data = input1.read();
        while (data != -1){
            System.out.print(data + " ");
            data = input1.read();
        }
        InputStream input2 = new FileInputStream("/home/ghazaal/Desktop/io/ap/1.txt");
        int data2 = input2.read();
        while (data2 != -1){
            System.out.print((char) data2);
            data2 = input2.read();
        }
        InputStream input = new FileInputStream("/home/ghazaal/Desktop/io/sc.png");
        byte[] data3 = new byte[1024];
        int count = input.read(data3);
        System.out.println(count);
        while (count != -1){
            for(byte d : data3)
                System.out.print(d + " ");
            System.out.println();
            count = input.read(data3);
        }
        input.close();
    }

}
