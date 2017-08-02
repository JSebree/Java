import java.util.Scanner;

public class Assignment1
{
    public static void main(String[] args) {
        System.out.println("Enter a line of text containing the word 'java' somewhere within it.");
        String message;
        Scanner keyboardScanner = new Scanner(System.in);
        message = keyboardScanner.nextLine();
        System.out.println(message);
        System.out.println(message.length());
        System.out.println(message.toLowerCase());
        System.out.println(message.toUpperCase());
        System.out.println(message.indexOf("java"));
        int ind, end, next;
        ind = message.indexOf("java");
        end = message.length();
        next = ind + 4;
        System.out.println(message.substring(0, ind) + "Java" + message.substring(next, end));
        System.out.println(message.substring(0, ind) + "JAVA" + message.substring(next, end));
        System.out.println();
        System.out.println("Done - press enter key to end program");
        String junk = keyboardScanner.nextLine();
    }
}