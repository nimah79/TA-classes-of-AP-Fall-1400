import java.io.FileReader;
import java.io.IOException;
//(better for .txt files)
public class FileReaderTest {
    public static void main(String[] args) throws IOException {
        FileReader fr = new FileReader("/home/ghazaal/Desktop/io/ap/1.txt");
        int i = 0;
        while((i = fr.read()) != -1){ // read method returns int of the character we're reading
            System.out.println((char) i); // we should cast it back to char
        }
        fr.close();
    }
}
