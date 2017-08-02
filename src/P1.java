import java.util.Scanner;
import java.lang.*;

public class P1 {
    public static void main (String[] args)
    {
        Scanner intValue = new Scanner(System.in);
        do {
            System.out.println("Enter a value to see if it is an integer...");
            String testIntval = intValue.nextLine();
            isValidInt(null);
        }while (true);
    }
    public static boolean isValidInt(String testIntval) {
        try{
            Integer.parseInt(testIntval);
            System.out.print(true);
            System.out.println();
        }
        catch(NumberFormatException e){
            System.out.print(false);
            System.out.println();
        }
        return true;
    }
}
