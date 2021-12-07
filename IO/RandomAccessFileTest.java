import java.io.*;
import java.nio.charset.StandardCharsets;
//RandomAccessFile -> seek() , write() , read() (read and write in bytes)

public class RandomAccessFileTest {
    public static void main(String[] args) throws IOException{
        //second parameter "rw" means read and write
        RandomAccessFile raf = new RandomAccessFile("/home/ghazaal/Desktop/io/ap/3.txt","rw");
        System.out.println(raf.getFilePointer()); //where is the pointer
        raf.seek(200); //Put the pointer at the position
        System.out.println(raf.getFilePointer());
        int value = raf.read();
        System.out.println(value);
        raf.write("Ghazaal Laghaee".getBytes(StandardCharsets.UTF_8));
        raf.close();
        System.out.println(raf.getFilePointer());//throws Stream closed exception
    }

}
