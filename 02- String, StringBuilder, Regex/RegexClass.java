import java.util.Arrays;
import java.util.Scanner;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class RegexClass {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);

        System.out.println("Enter A Hamrah-e-Aval Phone Number: ");
        String phone = s.nextLine();

        // valid numbers:
        // 09151231234
        // +989151231234
        // 00989151231234

        boolean isValid = phone.matches("((091)|(\\+9891)|(009891))[0-9]{8}");
        System.out.println(isValid);
        // *******************************************************************************

        String text = "salam 1234 khoobi? &$%#&$^ 3546545 بمنتیسنبمت";
        String newString = text.replaceAll("[0-9]","*");
        System.out.println(newString);
        // *******************************************************************************

        System.out.println("Enter a command to split by space: ");
        String command = s.nextLine();
        // open door1
        String[] c = command.split("[ ]");
        System.out.println(Arrays.toString(c));

        // *******************************************************************************

        Pattern pattern = Pattern.compile("[0-9a-zA-Z_.]{3,20}@gmail\\.com");
        Matcher matcher = pattern.matcher("" +
                "hi choopani.m81@gmail.com\n" +
                "email: xy@gmail.com\n" +
                "choopani.m81@yahoo.com\n" +
                "سمنیبت abcd132@gmail.com"
        );

        while (matcher.find()){
            String email = matcher.group();
            System.out.println(email);
        }
        //choopani.m81@gmail.com
        //abcd132@gmail.com


    }
}
