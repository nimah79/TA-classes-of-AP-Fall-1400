import java.io.File;
import java.io.FileReader;
import java.util.Scanner;

public class ReadData {
    public static void main(String[] args) throws Exception {
        //Scanner
        java.io.File file = new java.io.File("/home/ghazaal/Desktop/io/ap/2.txt");
        Scanner input = new Scanner(file);
        while (input.hasNext()) {
            String firstName = input.next();
            String mi = input.next();
            String lastName = input.next();
            int score = input.nextInt();
            System.out.println(firstName + " " + mi + " " + lastName + " " + score);
        }
        input.close();
        File f9 = new File("/home/ghazaal/Desktop/io/ap/1.txt");
        Scanner sc = new Scanner(f9);
        while (sc.hasNext())
            System.out.print(sc.next() + " ");
        sc.close();
    }
}