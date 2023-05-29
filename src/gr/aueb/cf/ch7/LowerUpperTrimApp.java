package gr.aueb.cf.ch7;

public class LowerUpperTrimApp {

    public static void main(String[] args) {
        String s = "Athens University";
        String lowercase;
        String uppercase;
        String trimmed;
        String s2 = ""; //Empty String : Length 0 String. Not space " " string.

        lowercase = s.toLowerCase();
        uppercase = s.toUpperCase();
        trimmed = s.trim();

        // Java 11 +
        System.out.println("*".repeat(10));

        if (s2.isEmpty()) {
            System.out.println(s2.length());
        }
    }
}
