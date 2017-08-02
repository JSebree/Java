import java.util.Scanner;
import java.lang.String;

public class Assignment2
{
    public static void main(String[] args) {
        System.out.println("Enter a line of text to be URL encoded");
        String message, catalog, encodedLine;
        Scanner keyboardScanner = new Scanner(System.in);
        message = keyboardScanner.nextLine();
        System.out.println(message);
        System.out.println(message.length());
        encodedLine = "";
        char position;
        int ind, ref, pos;
        ref = message.length();
        for (ind = 0; ind < ref; ind++) {
            catalog = "ABCDEFGHIJKLMNOPQRSTUVWXYZabcdefghijklmnopqrstuvwxyz0123456789_-.*";
            position = message.charAt(ind);
            pos = catalog.indexOf(position);
            if (pos != -1) {
                encodedLine += position;
            } else if (position == ' ') {
                encodedLine += '+';
            } else {
                String hexValue = Integer.toHexString(position);
                encodedLine += '%' + hexValue;
            }
        }
        System.out.println(encodedLine);
        System.out.println(encodedLine.length());
    }
}
