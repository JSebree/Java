import java.util.Scanner;

public class P2 {
    public static void main (String[] args)
    {
        Scanner intValue = new Scanner(System.in);
        do {
            System.out.println("Enter three values...");
            int val1 = intValue.nextInt();
            int val2 = intValue.nextInt();
            int val3 = intValue.nextInt();
            System.out.println("max value is " + max(val1, val2, val3));
        }while (true);
    }
    public static int max(int val1, int val2, int val3) {
        int maxVal = val1;
        if (val2 > maxVal)
            maxVal = val2;
        if (val3 > maxVal)
            maxVal = val3;
        return maxVal;
    }
}
