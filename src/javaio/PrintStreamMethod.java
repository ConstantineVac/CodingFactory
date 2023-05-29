package javaio;

import java.io.FileNotFoundException;
import java.io.PrintStream;

public class PrintStreamMethod {

    public static void main(String[] args) throws FileNotFoundException {
        PrintStream ps = new PrintStream("C:/tmp/cf.txt");

        printMsg(ps, "Hello Coding Plus"); // Print to file
        printMsg(System.out, "Coding Factory"); // Print to screen
    }

    /**
     * Prints a string message to PrintStream
     * @param ps        PrintStream Object
     * @param message   Message to print to STDOUT
     */
    public static void printMsg (PrintStream ps, String message) {
        ps.println(message);
    }
}
