package javaio;

import java.io.FileNotFoundException;
import java.io.PrintStream;

public class PrintStreamApp {

    public static void main(String[] args) {
        try(PrintStream ps = new PrintStream("C:/tmp/f1.txt")) {
            ps.println("Hello Coding Factory");
        } catch (FileNotFoundException ex) {
            ex.printStackTrace();
        }
    }
}