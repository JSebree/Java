import java.io.*;
import java.util.Scanner;
import java.lang.String;

public class TextFormatter {
    public static void main(String[] args) throws FileNotFoundException {
        System.out.println("Enter maximum formatted output width (30 to 100 characters):");
        Scanner width = new Scanner(System.in);
        int outputWidth = width.nextInt();
        while (outputWidth < 30 || outputWidth > 100)
        {
            System.out.println("Please enter value between 30 and 100");
            width = new Scanner(System.in);
            outputWidth = width.nextInt();
        }
        System.out.print("Enter the file name of the input text file:");
        Scanner input = new Scanner(System.in);
        String infileName = input.next();
        File infileObject = new File(infileName);
        boolean infileOK = false;
        while (!infileOK)
        {
            if (!infileObject.exists())
                System.out.println("No such file");
            else if (!infileObject.canRead())
                System.out.println("That file is not readable.");
            else
                infileOK = true;
            if (!infileOK)
            {
                System.out.println("Enter another file name:");
                infileName = input.next();
                infileObject = new File(infileName);
            }
        }
        System.out.print("Enter the file name of the output text file:");
        Scanner output = new Scanner(System.in);
        String outfileName = output.next();
        File outfileObject = new File(outfileName);
        boolean outfileOK = false;
        while (!outfileOK) {
            if (!outfileObject.exists())
                outfileOK = true;
            else {
                System.out.println(outfileName + " already exists. Would you like to overwrite " + outfileName + "? (Y/N)");
                String overwrite = output.next();
                if (overwrite.startsWith("y") || overwrite.startsWith("Y")) {
                    outfileOK = true;
                } else {
                    System.out.println("Please enter another file name:");
                    outfileName = output.next();
                    outfileObject = new File(outfileName);
                }
            }
        }
        PrintWriter outputStream = null;
        try
        {
            outputStream = openOutputTextFile(outfileName);
        }
        catch (FileNotFoundException e)
        {
            System.out.println("Error opening the file " + outfileName);
            System.exit(0);
        }
        StringBuilder header = new StringBuilder();
        for (int n = 0; n < outputWidth; n++) {
            header.append("*");
        }
        outputStream.println(header);
        Scanner inputStream = null;
        try {
            inputStream = new Scanner(infileObject);
        }
        catch (IOException e)
        {
            System.out.println(e.toString());
            System.exit(1);
        }
        String content = "";
        while (inputStream.hasNext()) {
            String nextWord = inputStream.next() + " ";
            if ((content.length() + nextWord.length() -1) < outputWidth)
            {
                content += nextWord;
            }
            else
            {
                outputStream.println(content);
                content = nextWord;
            }
        }
        outputStream.println(content);
        inputStream.close();
        outputStream.close();
        }
    private static PrintWriter openOutputTextFile(String outfileName)
            throws FileNotFoundException
    {
        return new PrintWriter(outfileName);
    }

}
