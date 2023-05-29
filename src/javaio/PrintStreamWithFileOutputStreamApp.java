package javaio;

import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.PrintStream;
import java.nio.charset.StandardCharsets;

public class PrintStreamWithFileOutputStreamApp {

    public static void main(String[] args) {
        try (PrintStream ps = new PrintStream(new FileOutputStream("C:/tmp/file1.txt"),
                true, StandardCharsets.UTF_8)) {
            ps.println("Hello");
        } catch (FileNotFoundException ex) {
            ex.printStackTrace();
        }
    }
}
