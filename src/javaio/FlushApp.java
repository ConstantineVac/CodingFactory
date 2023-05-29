package javaio;

import java.io.FileNotFoundException;
import java.io.PrintWriter;

public class FlushApp {

    public static void main(String[] args) {
        try {
            PrintWriter pw = new PrintWriter("C:/tmp/flush-file.txt");
            pw.print("Hello");
            pw.flush();
        } catch (FileNotFoundException e) {
            e.printStackTrace();
        }
    }
}
