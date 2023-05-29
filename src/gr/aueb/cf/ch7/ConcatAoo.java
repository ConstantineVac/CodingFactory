package gr.aueb.cf.ch7;

public class ConcatAoo {

    public static void main(String[] args) {
        String title = "Dr.";
        String  firstName = "Athan.";
        String lastName = "Androutsos";
        String fullName;
        String titledFullName;

        fullName = firstName + lastName;
        titledFullName = title.concat(firstName).concat(lastName);
        System.out.println(fullName);
        System.out.println(titledFullName);
    }
}
