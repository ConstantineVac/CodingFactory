package javaio;

import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.PrintStream;
import java.io.PrintWriter;

public class IOAppend {

    public static void main(String[] args) throws FileNotFoundException {

        PrintStream ps = new PrintStream(new FileOutputStream("C:/tmp/TestAppend1.txt", true));
        PrintWriter pw = new PrintWriter(new FileOutputStream("C:/tmp/TestAppend2.txt", true));

        ps.println("Hello from PrintStream");
        pw.println("Hello from PrintWriter");


        ps.close();
        pw.close();
    }
}
