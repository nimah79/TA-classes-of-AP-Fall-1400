import java.io.File;
import java.io.FileNotFoundException;
import java.io.PrintWriter;
// writes in formats (int,String,long,..)
//methods println() printf() format() print()
public class PrintWriterTest {
    public static void main(String[] args) throws FileNotFoundException {
        java.io.File file = new java.io.File("/home/ghazaal/Desktop/io/text.txt");
        PrintWriter output = new java.io.PrintWriter(file);
        output.print("John T Smith ");
        output.println(90);
        output.print("Eric K Jones ");
        output.println(85);
        output.close();
        File f9 = new File("/home/ghazaal/Desktop/io/ap/1.txt");
        PrintWriter pw = new PrintWriter(f9);
        pw.print("Ghazaal");
        pw.print(" Laghaee ");
        pw.print((int) 99);
        pw.close();
    }
}
