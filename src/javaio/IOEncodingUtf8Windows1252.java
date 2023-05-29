package javaio;

import java.io.FileNotFoundException;
import java.io.PrintStream;
import java.io.PrintWriter;
import java.io.UnsupportedEncodingException;

public class IOEncodingUtf8Windows1252 {

    public static void main(String[] args) throws UnsupportedEncodingException, FileNotFoundException {

        PrintStream ps = new PrintStream("C:/tmp/testEncode1.txt", "UTF-8");
        PrintWriter pw = new PrintWriter("C:/tmp/testEncode2.txt", "Windows-1252");

        ps.println("Οικονιμικό Πανεπιστήμιο Αθηνών");
        pw.println("Οικονιμικό Πανεπιστήμιο Αθηνών");

        ps.close();
        pw.close();
    }
}
