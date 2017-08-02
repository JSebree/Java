import java.util.Scanner;

public class ArraySort {
    public static int size;

    public static void main(String[] args) {
        System.out.println();
        System.out.println("How many integers are in your array (between 3 and 10)?");
        Scanner keyboard = new Scanner(System.in);
        size = keyboard.nextInt();
        System.out.println("Enter " + size + " values.");
        int[] array = new int[size];
        fillArray(array);
        System.out.println();
        System.out.println("Unsorted array:");
        printArray(array);
        sortArray(array);
        System.out.println();
        System.out.println("Sorted array:");
        printArray(array);
        System.out.println();
        System.out.println("Done - press enter key to end program");
        Scanner end = new Scanner(System.in);
        String junk = end.nextLine();
    }

    public static void fillArray(int[] array) {
        int i = 0;
        while ((size >= 3) && (i < array.length)) {
            System.out.println("Eneter array value " + Integer.toString(i + 1));
            Scanner keyboard = new Scanner(System.in);
            int value = keyboard.nextInt();
            array[i] = value;
            i++;
        }
    }

    public static void printArray(int[] array) {
        for (int i = 0; i < array.length; i++) {
            System.out.println(array[i]);
        }
    }

    public static void sortArray(int[] array) {
        boolean swapped = true;
        while (swapped){
            swapped = false;
            for (int i = 0; i < array.length - 1; i++) {
                if (array[i] > array[i+1]) {
                    int value1 = array[i];
                    int value2 = array[i + 1];
                    array[i] = value2;
                    array[i + 1] = value1;
                    swapped = true;
                }
            }
        }

    }
}



