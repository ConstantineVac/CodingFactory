package javaio;

import java.io.FileNotFoundException;
import java.io.PrintStream;

public class IOFilePrint {

    public static void main(String[] args) {
        try (PrintStream ps = new PrintStream("C:/tmp/IOSimpleTest1.txt");
             PrintStream pw = new PrintStream("C:/tmp/IOSimpleTest2.txt"))
        {
            ps.println("Hello World2! From PrintStream");
            pw.println("Hello World2! From PrintWriter");
        } catch (FileNotFoundException e) {
            System.out.println("File Not Found.");
        }
    }
}
