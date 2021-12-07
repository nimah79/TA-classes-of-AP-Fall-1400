import java.io.File;
import java.io.IOException;

public class TestFileClass {
    public static void main(String[] args) throws IOException {
        java.io.File file = new java.io.File("/home/ghazaal/Desktop/io/text.txt");
        file.createNewFile(); // building file
        System.out.println("Does it exist? " + file.exists());
        System.out.println("The file has " + file.length() + " bytes");
        System.out.println("Can it be read? " + file.canRead());
        System.out.println("Can it be written? " + file.canWrite());
        System.out.println("Is it a directory? " + file.isDirectory());
        System.out.println("Is it a file? " + file.isFile());
        System.out.println("Is it absolute? " + file.isAbsolute());
        System.out.println("Is it hidden? " + file.isHidden());
        System.out.println("Absolute path is " + file.getAbsolutePath());
        System.out.println("Last modified on " + new java.util.Date(file.lastModified()));
        File f3 = new File("/home/ghazaal/Desktop/io/mkdir");
        f3.mkdir(); // building last folder(building java)
        File f4 = new File("/home/ghazaal/Desktop/build/with/mkdirs");
        f4.mkdirs(); //building whole directory E: -> Ap -> programming
        File f5 = new File("/home/ghazaal/ds/stack-queue.cpp");
        System.out.println(f5.length()); // file length in bytes
        File f6 = new File("/home/ghazaal/Desktop/io");
        String[] filename = f6.list(); //saving file names in array
        for(String a : filename)
            System.out.println(a);
        File[] f7 = f6.listFiles(); // array of files which each index consist a file
        for (File f8 : f7)
            System.out.print(new java.util.Date(f8.lastModified()) + " "); // using Date class
    }
}