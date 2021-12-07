import java.io.File;
import java.io.FileWriter;
//writing char in files (better for .txt files)
public class FileWriterTest {

    public static void main(String[] args) throws Exception {

        File f10 = new File("/home/ghazaal/Desktop/io/ap/1.txt");
        FileWriter fw = new FileWriter(f10, true);
        fw.write("using FileWriter\n");
        fw.close();
    }

}
