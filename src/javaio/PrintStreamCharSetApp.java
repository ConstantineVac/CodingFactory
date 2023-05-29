package javaio;

import java.io.IOException;
import java.io.PrintStream;
import java.nio.charset.StandardCharsets;

public class PrintStreamCharSetApp {

    public static void main(String[] args) {
        try (PrintStream ps = new PrintStream("C:/tmp/file.txt", StandardCharsets.UTF_8);) {

            ps.println("Hello");
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}
